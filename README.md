# Spring
# 🌱 Spring Framework Learning Repository 

Welcome to the **Spring Framework Master Repository**, where each folder demonstrates a different concept of the **Spring Ecosystem**, starting from the **core container concepts** to **Spring MVC**, **JDBC**, and **ORM integrations** — both **XML-based** and **Annotation-based** configurations.

This repository is designed as a **progressive learning path**, allowing you to build your Spring knowledge step-by-step.

---

## 🧭 **Repository Overview**

| Order | Module Name | Description | Configuration Type |
|:-----:|:-------------|:-------------|:--------------------|
| 1️⃣ | **SpringCore** | Basic IoC (Inversion of Control) and DI (Dependency Injection) using XML configuration. | XML |
| 2️⃣ | **SpringCoreNoXML** | Demonstrates DI and bean management using **Java-based Configuration** (without XML). | Annotation/Java |
| 3️⃣ | **SpringCoreTwo** | Advanced Spring Core examples — Setter & Constructor Injection, Collections Injection, Bean Lifecycle methods, and Autowiring basics. | XML |
| 4️⃣ | **SpringPrimaryAnnotation** | Demonstrates use of `@Primary` annotation to handle multiple bean candidates for autowiring. | Annotation |
| 5️⃣ | **SpringQuantifiers** | Shows how to use `@Qualifier` and `@Primary` annotations together for precise bean injection control. | Annotation |
| 6️⃣ | **AutoWireInSpring** | Focuses entirely on **Spring Autowiring Techniques** — by name, by type, and constructor. | XML & Annotation |
| 7️⃣ | **SpringJdbcXml** | Connects Spring with a Database using **Spring JDBC Template** configured with XML. | XML |
| 8️⃣ | **SpringJdbcNoXml** | Implements the same JDBC Template approach but using **Annotation & Java-based Config** (No XML). | Annotation/Java |
| 9️⃣ | **SpringORM_XML** | Demonstrates **Spring ORM Integration with Hibernate**, configured using XML. | XML |
| 🔟 | **SpringOrmNoXml** | Same ORM integration but purely through **Java configuration and annotations**. | Annotation/Java |
| 1️⃣1️⃣ | **SpringMVC_XML** | Demonstrates **Spring MVC** architecture (Model-View-Controller) configured fully with XML (DispatcherServlet, Controller mappings, etc.). | XML |
| 1️⃣2️⃣ | **SpringMVC_NoXML** | Implements the same MVC example but using **Annotation-based configuration** (No web.xml, no XML beans). | Annotation/Java |

---

## 🧩 **Learning Order and Flow**

To understand Spring from the ground up, follow this order:

1. **SpringCore** → Learn what the **Spring Container** is and how it manages beans via XML.
2. **SpringCoreTwo** → Deep dive into **Dependency Injection techniques** and bean lifecycle.
3. **AutoWireInSpring** → Learn how Spring performs **Automatic Dependency Injection**.
4. **SpringPrimaryAnnotation** → Understand how Spring resolves multiple beans of the same type.
5. **SpringQuantifiers** → Master **@Qualifier** and **@Primary** usage for precise control.
6. **SpringCoreNoXML** → Migrate from XML to **pure annotation-based configuration**.
7. **SpringJdbcXml** → Integrate **Spring JDBC Template** with databases using XML.
8. **SpringJdbcNoXml** → Move JDBC configuration to annotations and Java-based config.
9. **SpringORM_XML** → Learn how Spring integrates with **Hibernate ORM** (XML config).
10. **SpringOrmNoXml** → Do the same ORM setup **without XML**.
11. **SpringMVC_XML** → Build your first **Spring MVC web application** using XML config.
12. **SpringMVC_NoXML** → Build the same MVC app using **pure annotations**.

---

## 🧠 **Concepts Covered**

- ✅ Inversion of Control (IoC)
- ✅ Dependency Injection (DI)
- ✅ Bean Lifecycle and Scopes
- ✅ Autowiring (`@Autowired`, `@Primary`, `@Qualifier`)
- ✅ XML vs Java-based Configuration
- ✅ JDBC Template (Spring JDBC)
- ✅ ORM Integration (Spring + Hibernate)
- ✅ Spring MVC (Controllers, ViewResolvers, DispatcherServlet)
- ✅ No-XML Configuration using Annotations

---

## ⚙️ **Technology Stack**

| Category | Tools / Technologies |
|-----------|----------------------|
| **Core Framework** | Spring Framework 5+ |
| **Database Layer** | JDBC, Hibernate ORM |
| **View Layer (MVC)** | JSP, Spring MVC |
| **Build Tool** | Maven |
| **Language** | Java 17+ |
| **Server** | Apache Tomcat 10+ |
| **IDE** | Eclipse / IntelliJ IDEA |

---

## 🧾 **How to Run**

1. **Clone the repository**
   ```bash
   git clone https://github.com/saishivamerugu/saishivamerugu.git
