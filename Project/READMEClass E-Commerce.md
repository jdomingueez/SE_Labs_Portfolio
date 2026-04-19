# E-commerce System - Class Diagram

## Overview
This diagram represents the structure of an e-commerce system using different classes and their relationships.

## Classes

### Customer
- Attributes:
  - userId
  - name
  - email
- Methods:
  - login()
  - register()

### ShoppingCart
- Attributes:
  - cartId
- Methods:
  - addProduct()
  - removeProduct()

### Product
- Attributes:
  - productId
  - name
  - price

### Order
- Attributes:
  - orderId
  - totalAmount
- Methods:
  - createOrder()

### Payment
- Attributes:
  - paymentId
  - status
- Methods:
  - processPayment()

### Supplier
- Attributes:
  - supplierId
- Methods:
  - fulfillOrder()

## Relationships

- A **Customer** has a **ShoppingCart**.
- The **ShoppingCart** contains **Products**.
- A **Customer** places an **Order**.
- An **Order** is associated with a **Payment**.
- The **Supplier** fulfills the order.

## Conclusion

This diagram shows how the main components of an e-commerce system are connected and how they interact to complete a purchase.