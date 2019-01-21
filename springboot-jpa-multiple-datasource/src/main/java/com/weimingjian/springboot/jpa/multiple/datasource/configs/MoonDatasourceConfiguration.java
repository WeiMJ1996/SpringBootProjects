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
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.extern.slf4j.Slf4j;

/**
 * @author weimingjian
 */

@Slf4j
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "moonEntityManagerFactory",
        transactionManagerRef = "moonTransactionManager",
        basePackages = "com.weimingjian.springboot.jpa.multiple.datasource.moon.dao"
)
public class MoonDatasourceConfiguration {
    @Autowired
    private JpaProperties jpaProperties;

    @Primary
    @Bean(name = "moonEntityManager")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return moonEntityManagerFactory(builder).getObject().createEntityManager();
    }

    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.moon")
    @Bean(name = "moonDataSource")
    public DataSource moonDataSource() {
        log.info("moon datasource created...");
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "moonEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean moonEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(moonDataSource())
                .properties(getVendorProperties(moonDataSource()))
                .packages("com.weimingjian.springboot.jpa.multiple.datasource.moon.model")
                .persistenceUnit("moonPersistenceUnit")
                .build();
    }

    private Map<String, String> getVendorProperties(DataSource dataSource) {
        return jpaProperties.getHibernateProperties(dataSource);
    }

    @Primary
    @Bean(name = "moonTransactionManager")
    public PlatformTransactionManager transactionManagerPrimary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(moonEntityManagerFactory(builder).getObject());
    }
}
