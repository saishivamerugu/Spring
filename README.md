# Spring Framework 

This repository contains a comprehensive collection of **Spring Framework** modules developed for learning, experimentation, and demonstration purposes. Each folder represents a distinct concept or layer of Spring — from basic dependency injection to advanced ORM and MVC configurations.

---

## 📘 Table of Contents 
1. [Overview](#overview)
2. [Projects and Descriptions](#projects-and-descriptions)
   - [SpringCore](#springcore)
   - [SpringCoreTwo](#springcoretwo)
   - [SpringCoreNoXML](#springcorenoxml)
   - [AutoWireInSpring](#autowireinspring)
   - [SpringPrimaryAnnotation](#springprimaryannotation)
   - [SpringQuantifiers](#springquantifiers)
   - [SpringJdbcXml](#springjdbcxml)
   - [SpringJdbcNoXml](#springjdbcnoxml)
   - [SpringORM_XML](#springorm_xml)
   - [SpringOrmNoXml](#springormnoxml)
   - [SpringMVC_XML](#springmvc_xml)
   - [SpringMVC_NoXML](#springmvc_noxml)
3. [How to Run](#how-to-run)
4. [Technologies Used](#technologies-used)
5. [Author](#author)

---

## Overview

These projects collectively demonstrate **core Spring concepts** including:
- Dependency Injection (DI) and Inversion of Control (IoC)
- Bean configuration with XML and Java-based annotations
- Autowiring and primary qualifiers
- Spring JDBC and ORM integration (Hibernate)
- MVC architecture with XML and annotation-based setups

Each folder can be built and run independently using **Maven**.

---

## Projects and Descriptions

### SpringCore
Introduces the fundamental **Spring Core concepts**:
- Bean creation and lifecycle management.
- XML-based configuration of dependencies.
- Demonstrates how Spring's IoC container handles relationships between objects.

### SpringCoreTwo
An extension of the Spring Core example focusing on layered configuration:
- Demonstrates multiple bean scopes (`singleton`, `prototype`).
- Explains constructor vs. setter injection.

### SpringCoreNoXML
Implements the same concepts as SpringCore but uses **Java-based configuration** instead of `applicationContext.xml`:
- Shows how to use `@Configuration`, `@Bean`, and `@ComponentScan`.
- Simplifies setup by eliminating XML files.

### AutoWireInSpring
Covers **Spring Autowiring** features:
- Demonstrates different autowiring modes (`byName`, `byType`, and `constructor`).
- Explains field-level autowiring using `@Autowired`.

### SpringPrimaryAnnotation
Highlights the use of `@Primary` to resolve multiple bean conflicts:
- Shows how the `@Primary` annotation directs Spring to use a specific bean when multiple beans of the same type exist.

### SpringQuantifiers
Focuses on **Spring Qualifiers**:
- Uses `@Qualifier` alongside `@Autowired` to specify which bean should be injected when multiple candidates exist.
- Best practice for precise dependency injection in large applications.

### SpringJdbcXml
Introduces **Spring JDBC with XML configuration**:
- Configures `JdbcTemplate` using `applicationContext.xml`.
- Performs simple CRUD operations through DAO classes.

### SpringJdbcNoXml
Demonstrates **Spring JDBC without XML**:
- Java-based configuration using `@Configuration` and `@Bean`.
- Simplifies setup and promotes cleaner, annotation-driven code.

### SpringORM_XML
Explains **Spring ORM integration** using **Hibernate** with XML configuration:
- Includes transaction management and entity mapping.
- Demonstrates how Spring manages Hibernate `SessionFactory`.

### SpringOrmNoXml
Provides the ORM setup using **Java-based configuration**:
- Uses annotations like `@EnableTransactionManagement` and `@PersistenceContext`.
- Removes XML dependencies for cleaner configuration.

### SpringMVC_XML
Builds a full **MVC (Model-View-Controller)** application using XML configuration:
- Demonstrates how to map controllers, configure view resolvers, and handle form submissions.
- Follows traditional XML-based approach for beginners learning MVC.

### SpringMVC_NoXML
Presents the same MVC structure as `SpringMVC_XML` but **with annotations only**:
- Uses `@Controller`, `@RequestMapping`, and `@Configuration`.
- Incorporates `DispatcherServlet` setup via Java config, aligning with modern Spring Boot-style practices.

---

## How to Run

1. Clone the repository:
git clone https://github.com/saishivamerugu/your-repo-name.git

2. Open the desired project folder in your IDE (IntelliJ IDEA / Eclipse / Spring Tool Suite).
3. Build the project using Maven:
mvn clean install
4. Run the main class (usually `App.java` or `Main.java`), or deploy to a servlet container for MVC modules.

---

## Technologies Used

- **Spring Framework 6**
- **Java 17+**
- **Maven** (for build automation)
- **JDBC / Hibernate**
- **Servlets & JSP (for MVC modules)**
- **Annotations-based configuration**

---

## Author

**Saishiva Merugu**  
Java & Spring Developer  
Passionate about exploring the Spring ecosystem and simplifying backend development through annotation-driven architectures.

---
