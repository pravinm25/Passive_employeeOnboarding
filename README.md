# Employee Onboarding API for Company
## Project Description
##### This is a Spring Boot project that contains POST and GET methods for adding new employees and read all employees from the DB. In this application I have used mapper to write API. Initially I started on writing a swagger code for documentation in the swagger editor. Then by using swagger code I generated EmployeeApi and EmployeeDto. I have implemented all my method calls in the controller layer and all the bussiness logics were written in the service layer. I also included configuration and mapper in this for optimized coding. For the Database I have used PostgreSql. For using postgreSql we need to give useranme, password, and url in the application.properties. 

## UML Diagram
<img width="864" height="892" alt="Umldiagram" src="https://github.com/user-attachments/assets/a0dda115-53c5-4ccd-a2ef-925359c41628" />

## Technologies Used
* Java 21
* Spring Boot
* Spring Data JPA
* Postman
* Maven
* PostgreSQL
* Swagger for API Documentation

## Database used and Its Configuration 
##### PostgreSQL is used for the Employee Craete and Get API for PravinTechCompany.

```
spring.datasource.url=jdbc:postgresql://localhost:5432/{databasename}
spring.datasource.username=[username]
spring.datasource.password=[password]
spring.datasource.driver-class-name = org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
```

# API Endpoint
- POST http://localhost:8080/onboarding/employee
- GET http://localhost:8080/onboarding/employee

# Functionality

- Create: Add new employee into the database. Employee details are id, name, role, age and salary.
- Fetch Employee: Retreive all employees from the database.

# Project Structure
```
src/main/java
  config
  controller
  entity
  mapper
  repository
  service
src/main/resources
  application.properties
  swagger.yaml
```
