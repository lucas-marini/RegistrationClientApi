<h1> Registration Client Api w/ Spring Boot </h1>

> Spring Boot application, which built an API for registering customers including their CPF, name and address. Briefly, the flow consists of creating a new client, thus having the possibility of listing them and also deleting them by id.

<h2> System Architecture </h2>
<ul>
<li>JDK 8</li>
<li>Spring Boot 2.5.7</li>
<li>Maven 3.8.1</li>
<li>JPA</li>
<li>Postman</li>
</ul>

<h2>relational database</h2>
<ul>
<li>H2</li>
</ul>

<h2>Environment Setting</h2>
Regarding the database, it is not necessary to create any database or connection, as the H2 database technology was used, which stores the information in memory per session and is erased each time the project starts. Therefore, it is only necessary to add the following dependencies to pom.xml:

```
<dependencies>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-data-jpa</artifactId>
	</dependency>
	<dependency>
		<groupId>com.h2database</groupId>
		<artifactId>h2</artifactId>
		<scope>runtime</scope>
	</dependency>		
</dependencies>

```

<h2>API usage</h2>

After starting the project with spring boot, check the port where the project started and in Postman make a request with POST method to the clients page (localhost:8080/clients) using the raw body in JSON, for example:

```
{
    "name": "João",
    "cpf": "12345678901",
    "address": "Av Vila Ema"
}

```
![post](https://user-images.githubusercontent.com/48499649/142878633-6c29017f-6dea-4c87-a6bc-7d8aa5ced8d5.PNG)

After that, it will be possible to list your registered clients using the GET method (localhost:8080/clients). 
![get](https://user-images.githubusercontent.com/48499649/142878735-80812c27-20ed-464d-a069-73621c5d9196.PNG)

And finally, it is also possible to delete a specific customer by id with the DELETE method just passing your id number, for example: localhost:8080/clients/5
![delete](https://user-images.githubusercontent.com/48499649/142878783-db968036-38eb-4af4-b66a-55132e9de9c2.PNG)









