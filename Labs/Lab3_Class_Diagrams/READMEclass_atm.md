# ATM System - Class Diagram

## Overview
This diagram represents the structure of an ATM system using classes and their relationships.

## Classes

### Customer
- Attributes:
  - customerId
  - name
- Methods:
  - authenticate()

### Account
- Attributes:
  - accountNumber
  - balance
- Methods:
  - withdraw()

### ATM
- Attributes:
  - atmID
  - location
- Methods:
  - dispenseCash()

### Transaction
- Attributes:
  - transactionId
  - amount
- Methods:
  - execute()

### Withdrawal
- Methods:
  - execute()

## Relationships

- A **Customer** is related to an **Account**.
- The **ATM** interacts with **Transaction** to perform operations.
- **Transaction** is a parent class, and **Withdrawal** is a child class (inheritance).
- The system uses transactions to process operations like withdrawing money.

## Conclusion

This diagram helps to understand how the different parts of the ATM system are structured and how they work together to perform operations.