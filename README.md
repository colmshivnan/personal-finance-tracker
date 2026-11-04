# Personal Finance Tracker

A Java project for tracking income, expenses, and bank account transactions.

I am building this project to practise object-oriented programming and develop my Java skills.

## Features

- Record income and deposit it into a bank account.
- Record expenses and withdraw money when sufficient funds are available.
- Keep a history of successful transactions.
- Display transaction descriptions, amounts, and types.
- Validate income and expense amounts, rejecting zero, negative values, NaN, and infinity.

## Project Structure

Place these files in the `src` folder:

- `BankAccount.java` — stores account details and handles deposits and withdrawals.
- `Transaction.java` — stores a transaction's description, amount, and type.
- `FinanceTracker.java` — connects the bank account to the transaction history.

## How It Works

The finance tracker uses a BankAccount object to manage the balance and an
ArrayList of Transaction objects to store transaction history.

Adding income increases the account balance and records an income transaction.

Adding an expense attempts a withdrawal. If the withdrawal succeeds, the tracker
records the expense and returns true. Otherwise, it returns false without
recording a transaction.

## Requirements

- Java Development Kit (JDK) 8 or later.

## Project Status

Work in progress. The core classes are implemented. A runnable entry point and
interactive menu are planned.

## Planned Improvements

- Add a console menu for entering income and expenses.
- Display the current account balance.
- Calculate total income and total expenses.
- Add transaction dates and spending categories.
- Save and load transactions from a file.

## Author

Colm Shivnan  
Mathematical Science student at the University of Galway
