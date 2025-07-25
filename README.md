# Console-Based Banking Application

## 📖 Description

A robust and user-friendly console-based banking application built entirely in Java. This project demonstrates core object-oriented programming (OOP) principles, effective exception handling, and data persistence through file I/O. Users can create accounts, deposit and withdraw funds, check balances, and all data is saved between sessions.

---

## ✨ Features

* Account Management: Create new bank accounts with unique, automatically generated account numbers.
* **Transaction Handling**: Perform deposits and withdrawals with validation.
* **Balance Inquiry**: Check the current balance of any account.
* **Data Persistence**: Account information is saved to a `data.csv` file upon exit and loaded at startup, ensuring no data is lost.
* **Robust Error Handling**: Gracefully handles common issues such as invalid user input (e.g., text instead of numbers) and business logic errors (e.g., insufficient funds for a withdrawal).
* **User-Friendly Interface**: A clear and simple command-line menu for easy navigation and operation.

---

## 🛠️ Technologies Used

* **Java**: Core application logic.
* **Java I/O Streams**: For reading from and writing to files (`FileReader`, `FileWriter`, etc.).
* **Java Collections Framework**: `ArrayList` for in-memory management of bank accounts.

---

## 🚀 Getting Started

### Prerequisites

* Java Development Kit (JDK) 8 or higher installed and configured.

### How to Compile and Run

1.  **Clone the repository:**
    ```sh
    git clone [YOUR_GITHUB_REPOSITORY_URL]
    ```

2.  **Navigate to the project directory:**
    ```sh
    cd [YOUR_PROJECT_FOLDER_NAME]
    ```

3.  **Compile the Java source files:**
    ```sh
    javac *.java
    ```

4.  **Run the application:**
    ```sh
    java Main
    ```
    The application will start, and you will see the main menu in the console.

---

## 🔮 Upcoming Features

* [ ] Implement a transaction history for each account.
* [ ] Add functionality for transferring funds between accounts.
* [ ] Introduce different account types (e.g., Savings, Checking).

