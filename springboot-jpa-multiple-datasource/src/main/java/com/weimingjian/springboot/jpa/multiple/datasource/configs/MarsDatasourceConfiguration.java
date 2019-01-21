package com.weimingjian.springboot.jpa.multiple.datasource.configs;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.extern.slf4j.Slf4j;

/**
 * @author weimingjian
 */
@SuppressWarnings("ALL")
@Slf4j
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "marsEntityManagerFactory",
        transactionManagerRef = "marsTransactionManager",
        basePackages = "com.weimingjian.springboot.jpa.multiple.datasource.mars.dao"
)
public class MarsDatasourceConfiguration {
    @Autowired
    private JpaProperties jpaProperties;

    @Bean(name = "marsEntityManager")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryBean(builder).getObject().createEntityManager();
    }

    @ConfigurationProperties(prefix = "spring.datasource.mars")
    @Bean(name = "marsDataSource")
    public DataSource marsDataSource() {
        log.info("mars datasource created...");
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "marsEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(marsDataSource())
                .properties(getVendorProperties(marsDataSource()))
                .packages("com.weimingjian.springboot.jpa.multiple.datasource.mars.model")
                .persistenceUnit("marsPersistenceUnit")
                .build();
    }
    private Map<String, String> getVendorProperties(DataSource dataSource) {
        return jpaProperties.getHibernateProperties(dataSource);
    }

    @Bean(name = "marsTransactionManager")
    public PlatformTransactionManager transactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryBean(builder).getObject());
    }
}
