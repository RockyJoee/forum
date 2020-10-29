###技术栈
|  技术   | 链接  |
|  ----  | ----  |
| Spring Boot  | http://projects.spring.io/spring-boot/#quick-start    |
| MyBatis  | https://mybatis.org/mybatis-3/zh/index.html   |
| MyBatis Generator  | http://mybatis.org/generator/   |
| MySql  |https://dev.mysql.com/doc/ |
| Flyway | https://flywaydb.org/getstarted/firststeps/maven|
| Lombok  | https://www.projectlombok.org   |
| Bootstrap | https://v3.bootcss.com/getting-started/   |
| Github OAuth | https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/ |

 

运行 migrate 和 generator 的命令
```
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```
