# Post Office Management System

A **console-based Java application** designed to simulate and manage the basic operations of a post office.  This project helps demonstrate **object-oriented programming (OOP) concepts** such as classes, objects, inheritance, and abstraction in a real-world scenario.

---

## 📌 Features

- **Admin & Customer Modes**  
  - Admin can manage services, employees, and track operations.  
  - Customers can access postal services.

- **Core Functionalities**  
  - Register customers  
  - Send/receive parcels and letters  
  - Calculate postal charges  
  - Maintain records of transactions  

- **Console-Based Menu Navigation**  
  - Simple and intuitive menu-driven interface.  

---

## 🛠️ Tech Stack

- **Language:** Java  
- **Paradigm:** Object-Oriented Programming (OOP)  
- **Interface:** Console (Text-based)  

---

## 🚀 Getting Started

### 1. Clone the Repository

    git clone https://github.com/Murugavl/PostOfficeManagement.git
    cd PostOfficeManagement

### 2. Compile the Project
- Navigate to the src directory and compile the Java files:

        javac Main.java

### 3. Run the Application
        java Main
---
## 📂 Project Structure
    PostOfficeManagement/
    │
    ├── src/
    │   ├── Main.java               
    │   ├── Models/                 # Contains core entity classes (Customer, Parcel, Letter, etc.)
    │   └── Services/               # Service classes handling operations (PostOfficeService)
    │
    ├── .gitignore
    └── README.md

---
## 🖥️ Usage Example

When you run the program, you will see a menu-driven console like this:
    === Post Office Management System ===
    1. Admin
    2. Customer
    3. Exit
    Enter your choice: 1

    === Admin Menu ===
    1. Add Customer
    2. View Customers
    3. Remove Custome
    4. Show Postal Items
    Enter your choice: 1

    Enter Employee Name: Vel
    Enter Employee Address: xyz 
    Customer added successfully!

Or as a customer:

    === Post Office Management System ===
    1. Admin
    2. Customer
    3. Exit
    Enter your choice: 2

    === Customer Menu ===
    1. Send Letter
    2. Send Parcel
    3. Send Money Order
    4. Logout
    Enter your choice: 2

    Enter Sender Name: Alice
    Enter Receiver Name: Bob
    Enter Parcel Weight (kg): 2.5
    Parcel sent successfully! 

---
## 🎯 Learning Objectives

- Applying OOP principles in Java
- Handling menu-driven console input/output
- Structuring Java projects with Models and Services
- Simulating real-world operations using code

---

## 🤝 Contribution

Contributions are welcome! If you’d like to improve this project:
- Fork the repository
- Create a new branch (feature-xyz)
- Commit your changes
- Open a Pull Request

---

## 📜 License

This project is open-source and available under the MIT License.