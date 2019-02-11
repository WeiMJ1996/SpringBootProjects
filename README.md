# SpringBootProjects
some spring boot demo for learning 


### 1.springboot-jpa-starter
> springboot简单整合JPA，使用druid或者hikari作为数据库连接池。

### 2.springboot-mybatis-starter"
> springboot简单整合mybatis及mybatis-generator逆向生成工具。使用时需修改配置文件，主要包括generatorConfig.xml中mysql的jar包url和model、dao的url等，以及部分生成规则按需修改，application-*.properties中数据库的配置也需要修改，连接池的配置同样按需修改。

### 3.springboot-swaggerui-starter
> springboot整合swagger-ui，自动生成API文档。

### 4.springboot-mybatis-generator-configuration
> springboot整合通用Mapper以及分页插件pagehelper。主要注意引入通用Mapper后部分mybatis的配置会失效，需要通过通用Mapper的配置来配置ORM。

### 5.springboot-jpa-multiple-datasource
> springboot整合JPA，使用多数据源，其中springboot版本为1.5；2.0以后版本需要修改配置，该源码不适用。
