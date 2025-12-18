# Bank_Transaction_Management_System

A Spring Boot based Account Management System that provides REST APIs for managing
accounts and transactions. This project follows a clean layered architecture using
Controller, Service, and Repository patterns.

---

## Features

- Create and manage accounts
- Perform credit and debit transactions
- View account statements
- RESTful API design
- Layered architecture (Controller, Service, Repository)
- Maven based project

---

## Tech Stack

- Java (JDK 11+)
- Spring Boot
- Spring Data JPA
- Maven
- REST APIs
- JUnit (for testing)

---

## 📂 Project Structure

```text
Account
│── pom.xml
│── mvnw
│── mvnw.cmd
│── .gitignore
│── .gitattributes
│── HELP.md
│
├── .mvn
│   └── wrapper
│       └── maven-wrapper.properties
│
└── src
    ├── main
    │   ├── java
    │   │   └── com.example.Account
    │   │       ├── AccountApplication.java
    │   │       │
    │   │       ├── Controller
    │   │       │   ├── AccountController.java
    │   │       │   └── TransactionController.java
    │   │       │
    │   │       ├── Model
    │   │       │   ├── Account.java
    │   │       │   ├── Statement.java
    │   │       │   └── TypeEnum.java
    │   │       │
    │   │       ├── Repository
    │   │       │   ├── AccountRepo.java
    │   │       │   └── StatementRepo.java
    │   │       │
    │   │       └── services
    │   │           ├── AccountService.java
    │   │           └── TransactionService.java
    │   │
    │   └── resources
    │       ├── static
    │       └── templates
    │
    └── test
        └── java
            └── com.example.Account
                └── AccountApplicationTests.java
```

---

## Prerequisites

- Java JDK 11 or higher
- Git
- Maven is NOT required (Maven Wrapper included)

---

## How to Run the Project

### Clone the repository
```bash
git clone https://github.com/your-username/account-management-system.git
cd account-management-system
```

### Run the application

Windows
```bash
mvnw.cmd spring-boot:run
```

Linux / macOS
```bash
./mvnw spring-boot:run
```

Running Tests
```bash
mvnw test
```

### Sample API Endpoints

| Method | Endpoint                  | Description            |
| ------ | ------------------------- | ---------------------- |
| POST   | /accounts                 | Create a new account   |
| GET    | /accounts/{id}            | Get account details    |
| POST   | /transactions             | Perform a transaction  |
| GET    | /accounts/{id}/statements | Get account statements |


## Author

Vraj Anghan
Java Backend Developer

