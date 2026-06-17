<div align="center">

<!-- Animated wave header -->
<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=200&section=header&text=Bank%20Application&fontSize=50&fontColor=ffffff&fontAlignY=38&desc=Java%20OOP%20Console%20Banking%20System&descAlignY=58&descColor=a0c4ff&animation=fadeIn" width="100%"/>

<!-- Typing animation -->
<a href="#">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=22&pause=1000&color=2C8FE7&center=true&vCenter=true&width=600&lines=Deposit+%7C+Withdraw+%7C+Transfer;OOP+Principles+in+Action;Clean+%7C+Simple+%7C+Validated" alt="Typing SVG" />
</a>

<br/>

<!-- Badges -->
![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Encapsulation-4CAF50?style=for-the-badge&logo=abstract&logoColor=white)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

</div>

---

## 🏦 About

A **console-based Java banking application** built using core Object-Oriented Programming principles. Customers can check balances, deposit/withdraw funds, and transfer money between accounts — all with proper validation and custom exception handling.

---

## ✨ Features

| Feature | Description |
|---|---|
| 💰 **View Balance** | Check the balance of any account instantly |
| ➕ **Deposit** | Add funds to an account with validation |
| ➖ **Withdraw** | Withdraw funds with balance checks |
| 🔁 **Transfer** | Move money between accounts securely |
| ⚠️ **Exception Handling** | Custom exceptions for invalid operations |
| 🧾 **Transaction Record** | Every transfer is logged as a `Transaction` |

---

## 🗂️ Project Structure

```
bankaap/
│
├── BankAccount.java              # Core account class (data + methods)
├── bank.java                     # Manages all accounts, handles transfers
├── Transaction.java              # Records transfer details
├── AccountNotFoundException.java # Thrown when account doesn't exist
├── insufficientBalanceException.java # Thrown when balance is too low
└── bankApplication.java          # Main entry point (demo)
```

---

## 🧩 Class Overview

<div align="center">

```
┌─────────────────────────────────┐
│          BankAccount            │
├─────────────────────────────────┤
│ - accountNumber : String        │
│ - accountHolderName : String    │
│ - accountType : String          │
│ - balance : double              │
├─────────────────────────────────┤
│ + BankAccount(...)              │
│ + getBalance()                  │
│ + deposit(amount)               │
│ + withdraw(amount)              │
│ + transferAmount(receiver, amt) │
│ + displayAccountDetails()       │
└─────────────────────────────────┘
         used by ▼
┌─────────────────────────────────┐
│              bank               │
├─────────────────────────────────┤
│ + addAccount(account)           │
│ + findAccount(accountNumber)    │
│ + transfer(from, to, amount)    │
└─────────────────────────────────┘
```

</div>

---

## ✅ Transfer Validation Rules

> The following checks run **in order** before any transfer is processed:

1. 🔍 Sender account must exist
2. 🔍 Receiver account must exist
3. 🔢 Amount must be **greater than zero**
4. 💳 Sender must have **sufficient balance**

---

## 🚀 How to Run

```bash
# Compile all files
javac *.java

# Run the application
java bankApplication
```

---

## 📋 Sample Output

```
Account added: ACC001
Account added: ACC002

Account Number : ACC001
Account Holder : Dhruv Sengar
Account Type   : Savings
Balance        : Rs 50000.0

Transfer of Rs 10000.0 successful.
Your new balance: Rs 40000.0

Transaction Details:
  From    : ACC001
  To      : ACC002
  Amount  : Rs 10000.0

Error: Insufficient balance. Requested: Rs 999999.0
Error: Account not found: ACC999
```

---

## 🧠 OOP Concepts Used

| Concept | Where Used |
|---|---|
| **Encapsulation** | `private` fields + public getters in `BankAccount` |
| **Classes & Objects** | `BankAccount`, `bank`, `Transaction` |
| **Constructors** | All classes use parameterised constructors |
| **Inheritance** | Custom exceptions extend `Exception` |
| **Object Interaction** | `bank` operates on `BankAccount` objects |

---

<div align="center">

<!-- Animated footer wave -->
<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,50:203a43,100:0f2027&height=120&section=footer" width="100%"/>

*Built with ☕ Java — Week 2 OOP Project*

</div>
