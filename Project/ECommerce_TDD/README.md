# E-commerce TDD Project

## Overview
This project applies Test Driven Development (TDD) to a core feature of the e-commerce system: the shopping cart and checkout process.

The goal is to demonstrate how functionality can be developed using tests first, followed by minimal implementation.

## Implemented Features

- Adding products to the shopping cart
- Removing products from the cart
- Calculating the total price
- Processing checkout
- Handling payment success and failure
- Clearing the cart after successful checkout

## Test Cases

The following test cases have been implemented:

- The cart starts empty
- A product can be added to the cart
- A product can be removed from the cart
- The total price is calculated correctly
- The total is zero when the cart is empty
- Checkout fails if the cart is empty
- Checkout succeeds when payment is successful
- Checkout fails when payment is not approved

## TDD Approach

The project follows the TDD cycle:

1. Write a failing test
2. Implement the minimum code required to pass the test
3. Refactor the code if needed

This process ensures that the system is always tested and validated during development.

## Project Structure

- `Product` → represents a product with a name and price
- `ShoppingCart` → manages products and calculates total
- `PaymentService` → simulates payment processing
- `CheckoutService` → handles the checkout logic
- `ECommerceTest` → contains all unit tests

## Relation with SRS

This project is directly related to:

- **Shopping Cart (Section 5.3)**
- **Order Processing (Section 5.4)**

It supports requirements such as:

- Users can add and remove products from the cart
- The system processes payments correctly
- Orders are completed only after successful payment

## How to Run

To execute the tests, run the following command:

```bash
mvn clean test