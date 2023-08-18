# Read Me First
This project demonstrate a simple SQL injection vulnerability on a SpringBoot project
The project runs a servlet serving two endpoints:
* '/' with a simple Hello the world answer
*  '/person/address' which maps the 'name' GET parameter to a SQL query (the vulnerability)
* the initial DB setup has a PEOPLE table populated with one entry for the name 'foo'
* as default, the application listens on port 8080 and also maps the H2 DB console: http://localhost:8080/h2-console

Credits to @jeff-zapotoczny-sonarsource for the initial implementation

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#web)
* [JDBC API](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#data.sql)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)

Updated README
