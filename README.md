# 🛒 E-Commerce Backend API

A scalable and production-ready E-Commerce backend application built using Spring Boot and SQL database.
This repository handles core e-commerce functionalities such as Customers, Categories, Products, and Orders through RESTful APIs.
<br>
<br>
<img width="1380" height="1077" alt="Screenshot 2026-01-21 184430" src="https://github.com/user-attachments/assets/f742b92b-303b-4b68-9909-343a8bc47bfd" />
---

## 📌 Features


- Customer management
- Category management
- Product management
- Order creation and tracking
- SQL database integration
- RESTful API design
- Docker support

---

## 🧰 Tech Stack

- Java 17  
- Spring Boot  
- Spring Web  
- Spring Data JPA (Hibernate)  
- SQL Database (MySQL / PostgreSQL)  
- Maven  

---

## 🏗 Application Architecture
<br>Controller → Service → Repository → Database<br>

- **Controller**: Handles HTTP requests
- **Service**: Business logic
- **Repository**: Database operations
- **Model**: Entity classes

---

## 📁 Project Structure

e-com/demo <br>
│<br>
├── src/main/java/com/example/e-com<br>
│   ├── controller<br>
│   │   ├── CategoryController.java<br>
│   │   ├── ProductController.java<br>
│   │   ├── CustomerController.java<br>
│   │   └── OrderController.java<br>
│   │<br>
│   ├── service<br>
│   │   ├── CategoryService.java<br>
│   │   ├── ProductService.java<br>
│   │   ├── CustomerService.java<br>
│   │   └── OrderService.java<br>
│   │<br>
│   ├── repository<br>
│   │   ├── CategoryRepository.java<br>
│   │   ├── ProductRepository.java<br>
│   │   ├── CustomerRepository.java<br>
│   │   └── OrderRepository.java<br>
│   │<br>
│   ├── model<br>
│   │   ├── Category.java<br>
│   │   ├── Product.java<br>
│   │   ├── Customer.java<br>
│   │   ├── Order.java<br>
│   │   └── OrderItem.java<br>
│   │<br>
│   └── EcommerceApplication.java<br>
│<br>
├── src/main/resources<br>
│   └── application.properties<br>
│<br>
├── Dockerfile<br>
├── docker-compose.yml<br>
├── pom.xml<br>
└── README.md<br>


---

## 🗄 Database Schema

### Tables

- customers
- categories
- products
- orders
- order_items

### Relationships

- One Category → Many Products  
- One Customer → Many Orders  
- One Order → Many Order Items  

---

## 🔗 API Endpoints

### Category APIs
GET /api/products<br>
GET /api/orders<br>
GET /api/category<br>
GET /api/customers<br>


---

## 🌐 Deployment

- Backend can be deployed using Docker on Render / Railway / AWS
- Frontend can be hosted on GitHub Pages
- CORS configuration supported

---

## 🚀 Future Enhancements

- JWT Authentication
- Admin APIs
- Payment Gateway Integration
- Product Reviews and Ratings
- Inventory Management

---

## 👨‍💻 Author

Vatsal Varma  
LinkedIn: https://www.linkedin.com/in/vatsal-varma-2bb681294/  
Backend Developer | Spring Boot | SQL
