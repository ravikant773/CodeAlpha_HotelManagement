# 📈 Stock Trading Platform

![Java](https://img.shields.io/badge/Language-Java-orange)
![Project](https://img.shields.io/badge/Project-Stock%20Trading%20System-blue)
![License](https://img.shields.io/badge/License-Educational-green)

## 📌 Project Overview

**Stock Trading Platform** is a console-based Java application that simulates a basic stock market trading system.

Users can login, view available stocks, buy and sell shares, manage their portfolio, check transaction history, and save trading records using file handling.

The project demonstrates **Java Object-Oriented Programming (OOP)** concepts with practical implementation.

---

# 🚀 Features

## 🔐 Login System

* User authentication using username and password.
* Default credentials:

```
Username: admin
Password: 1234
```

---

## 📊 Market Data

Displays available stocks with company details and prices.

| Symbol | Company     | Price |
| ------ | ----------- | ----- |
| TATA   | Tata Motors | ₹800  |
| INFY   | Infosys     | ₹1500 |
| REL    | Reliance    | ₹2500 |

---

## 🛒 Buy Stocks

* Purchase stocks from the market.
* Checks available balance.
* Automatically updates portfolio.
* Stores transaction details.

---

## 💰 Sell Stocks

* Sell owned shares.
* Checks stock availability.
* Updates account balance.
* Records selling transactions.

---

## 📂 Portfolio Management

Displays:

* Owned stocks
* Number of shares
* Available balance

---

## 📝 Transaction History

Maintains complete trading records:

* Transaction ID
* Transaction Type (BUY/SELL)
* Stock Name
* Quantity
* Amount
* Status
* Date & Time

---

## 💾 File Storage

Transaction data is stored in:

```
portfolio.txt
```

Implemented using Java **File Handling (FileWriter)**.

---

# 🛠️ Technologies Used

* ☕ Java
* Object-Oriented Programming (OOP)
* Collections Framework

  * HashMap
  * ArrayList
* File Handling
* Java Date-Time API
* Scanner Class

---

# 📂 Project Structure

```
StockTradingPlatform
│
├── StockTradingPlatform.java
│      Main application & menu system
│
├── Stock.java
│      Stock information management
│
├── StockMarket.java
│      Stock price updates
│
├── User.java
│      User details management
│
├── Portfolio.java
│      Buy/Sell operations & portfolio handling
│
├── Transaction.java
│      Transaction record management
│
├── LoginSystem.java
│      User authentication
│
├── FileStorage.java
│      File data storage
│
└── portfolio.txt
       Saved transaction records
```

---

# ▶️ How to Run

### 1. Compile Java Files

```bash
javac *.java
```

### 2. Run Application

```bash
java StockTradingPlatform
```

---

# 📋 Application Menu

```
===== STOCK TRADING PLATFORM =====

1. Show Market Data
2. Buy Stock
3. Sell Stock
4. Show Portfolio
5. Transaction History
6. Exit
```

---

# 👤 Default User

```
Name: Demo User
Initial Balance: ₹50000
```

---

# 🎯 OOP Concepts Used

### Classes & Objects

Implemented using:

* Stock
* User
* Portfolio
* Transaction

### Encapsulation

Combines data and methods inside classes.

### Object Relationship

* User has a Portfolio
* Portfolio contains Transactions
* Trading system manages Stocks

### Collections

* HashMap → Stores user stocks
* ArrayList → Stores transaction history

---

# 🔄 Application Flow

```
Login
  ↓
View Market Data
  ↓
Buy / Sell Stocks
  ↓
Update Portfolio
  ↓
Save Transaction
  ↓
View History
```

---

# 🔮 Future Enhancements

* Database connectivity (MySQL)
* Multiple user support
* Real-time stock price updates
* GUI application using JavaFX/Swing
* Stock charts and analytics
* Admin dashboard
* Online trading simulation

---

# 👨‍💻 Author

Developed as a Java OOP Project

---

# 📄 License

This project is created for educational purposes.
