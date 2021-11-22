<h1> Registration Client Api w/ Spring Boot </h1>

> Spring Boot application, which built an API for registering customers including their CPF, name and address. Briefly, the flow consists of creating a new client, thus having the possibility of listing them and also deleting them by id.

<h2> System Architecture </h2>
<ul>
<li>JDK 8</li>
<li>Spring Boot 2.5.7</li>
<li>Maven 3.8.1</li>
<li>JPA</li>
</ul>

<h2>relational database</h2>
<ul>
<li>H2</li>
</ul>

<h2>Environment Setting</h2>
Regarding the database, it is not necessary to create any database or connection, as the H2 database technology was used, which stores the information in memory per session and is erased each time the project starts. Therefore, it is only necessary to add the following dependencies to pom.xml:
```
    <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
          <groupId>com.h2database</groupId>
          <artifactId>h2</artifactId>
          <scope>runtime</scope>
        </dependency>

```

