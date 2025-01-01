# Building a Basic CRUD Application with Spring Boot for Beginners

This repository provides a step-by-step guide to creating a basic CRUD application using
Spring Boot, MySQL, and JPA. Designed for beginners, it simplifies backend development
concepts and demonstrates how to structure a Spring Boot project with a three-layer architecture.

## Features
 - RESTful APIs for CRUD operations.
 - MySQL database integration.
 - Spring Data JPA for simplified database interaction.
 - Lombok for reducing boilerplate code.

## Read the Full Guide
For a detailed explanation and setup instructions, check out the article on [medium](https://medium.com/@gosucode/building-a-basic-crud-application-with-spring-boot-for-beginners-fe212df06fa6)

# Getting Started

1. Clone this repository:
```bash
git clone https://github.com/yourusername/spring-boot-crud.git
```

2. Navigate to the project directory:
```bash
cd spring-boot-crud
```

3. Import the project into your favorite IDE (e.g., IntelliJ, Eclipse).
4. Configure the database connection in application.properties:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
```
5. Run the application:
```bash
./gradlew bootRun
```

## Feedback
If you find this project useful or have any feedback, please let me know by creating an issue or leaving a comment in the Medium article.
