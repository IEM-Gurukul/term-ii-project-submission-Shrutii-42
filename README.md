[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Design and Implementation of a Mini Banking System using Layered Architecture 

## Problem Statement (max 150 words)

In real-world banking systems, managing customer accounts and financial transactions 
requires proper structure, validation, and separation of responsibilities. Basic programs that 
handle deposits and withdrawals without organized design become difficult to maintain and 
extend. Therefore, there is a need to develop a structured Mini Banking System that simulates 
real-world banking operations such as account creation, deposits, withdrawals, and fund 
transfers. The system should ensure proper balance validation, exception handling, and 
maintain transaction history. This project aims to design and implement a well-structured 
banking application using object-oriented programming principles and layered architecture to 
improve maintainability, scalability, and clarity of code.

## Target User

 Bank administrators  
 Customers 

## Core Features

 Create and manage customer accounts 
 Support multiple account types (Savings and Current) 
 Deposit and withdraw money 
 Fund transfer between accounts 
 Maintain transaction history 
 Implement custom exception handling for invalid operations 
 Input validation for secure transactions 



## OOP Concepts Used

* **Abstraction:**
  The system hides implementation details by using service classes that expose only required functionalities like deposit, withdraw, and transfer.

* **Inheritance:**
  Different account types such as `SavingsAccount` and `CurrentAccount` inherit from a base `Account` class, reusing common properties like account number, balance, etc.

* **Polymorphism:**
  Method overriding is used where different account types can have different implementations of operations like withdrawal or interest calculation.

* **Exception Handling:**
  Custom exceptions such as `InsufficientBalanceException` and `InvalidAmountException` are used to handle invalid operations and ensure program stability.

* **Collections / Threads:**
  Java Collections (like `ArrayList` or `HashMap`) are used to store and manage account data and transaction history efficiently.




## Proposed Architecture Description

The system will follow a layered architecture consisting of Model, Service, Repository, and 
Exception layers. The Model layer will define account-related classes. The Service layer will 
handle business logic such as validation and transaction processing. The Repository layer will 
manage data storage using collections and file handling. The Exception layer will define 
custom exceptions to handle error scenarios effectively. This separation ensures modularity 
and clean design. 


## How to Run


This project can be executed using either an IDE or the command line. Follow the steps below:


 System Requirements

* Java Development Kit (JDK 8 or above)
* Any Java IDE (Eclipse / IntelliJ IDEA / VS Code) *(optional but recommended)*
* Basic understanding of Java execution


1. **Download or Clone the Project**

   * Extract the project folder if downloaded as a ZIP.

2. **Open Terminal / Command Prompt**

   * Navigate to the root project directory:

     ```
     cd path/to/project
     ```

3. **Compile the Project**

   * If packages are used:

     ```
     javac -d . *.java
     ```
   * Or compile all files:

     ```
     javac */*.java *.java
     ```

4. **Run the Application**

   ```
   java Main
   

1. Open your IDE (Eclipse / IntelliJ / VS Code).
2. Select **Import Project**.
3. Choose the project folder.
4. Wait for dependencies to load (if any).
5. Locate the main class (`Main.java`).
6. Click **Run ▶️**.

---



```
/model        → Account classes  
/service      → Business logic  
/repository   → Data handling  
/exception    → Custom exceptions  
Main.java     → Entry point  
```


1. Start the program.
2. Choose options from the menu:

   * Create Account
   * Deposit Money
   * Withdraw Money
   * Transfer Funds
   * View Transactions
3. Enter required details when prompted.
4. The system will validate inputs and display results.



* Ensure correct package structure before compilation.
* Class names and file names must match.
* Handle invalid inputs carefully during execution.
* If any error occurs, recompile all files.

outputs

* Successful account creation
* Accurate balance updates
* Error messages for invalid operations
* Display of transaction history


## Git Discipline Notes
Minimum 10 meaningful commits required.
1.Initialized project structure and Added account models
2. added account model with validation and tranctions
3. created account repository with basic CRUD operations
4. added account service layer with bussiness logic
5.Added to string method in account
6.added delete account method in repository
7.added ui layer with banking menu
8. files names are fixed 
9. final wworking project is redy
10. final submmission 