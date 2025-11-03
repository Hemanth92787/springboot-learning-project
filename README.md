# SpringWeb5 – Spring Boot + MySQL CRUD Example

This project is a simple **Spring Boot REST API** that manages employee records using **Spring Data JPA** and **MySQL**.  
It demonstrates how to set up a RESTful service to perform basic CRUD operations.

---

## 🧩 Tech Stack

- **Spring Boot 3.x**
- **Spring Data JPA**
- **MySQL Database**
- **Maven**
- **Java 17**

---

## ⚙️ Project Setup

### 1. Clone the Repository

git clone https://github.com/your-username/springweb5.git
cd springweb5
2. Configure Database
Update src/main/resources/application.properties:

properties

spring.application.name=SpringWeb5
server.port=9090

spring.datasource.url=jdbc:mysql://localhost:3306/springdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Make sure the database springdb exists in MySQL:

sql

CREATE DATABASE springdb;
🚀 Run the Application
You can run it using:


mvn spring-boot:run
or from your IDE by running SpringWeb5Application.java.

Server will start at:
http://localhost:9090

🔗 API Endpoints
Method	Endpoint	Description
GET	/getall	Fetch all employees
GET	/getbyone/{id}	Fetch employee by ID

Example:


Copy code
GET http://localhost:9090/getall
GET http://localhost:9090/getbyone/1
📦 Project Structure
css

src/
 └─ main/
    ├─ java/com/example/demo/
    │   ├─ controller/
    │   │   └─ mycontroller.java
    │   ├─ entity/
    │   │   └─ Employee.java
    │   ├─ repository/
    │   │   └─ EmployeeRepository.java
    │   └─ service/
    │       └─ myservice.java
    └─ resources/
        └─ application.properties
🧠 Notes
You can add more endpoints for POST, PUT, and DELETE if you want to extend CRUD functionality.

The JPA property spring.jpa.hibernate.ddl-auto=update keeps your schema updated automatically during development.

Use @RestController and @Service annotations for clean layering.

📄 License
This project is open source under the MIT License.

👤 Author
Hemanth Reddy Palem

'''

---

Would you like me to include **POST/PUT/DELETE API examples** in the README too, so it becomes a complete CRUD reference?
