# E-commerce System - State Diagram

## Overview
This diagram shows the different states of an order in an e-commerce system, from browsing products to completing or failing the order.

## States

- Initial state
- Browsing
- Cart updated
- Checkout
- Payment processing
- Order confirmed
- Order failed
- Final state

## Process

1. The process starts in the initial state.
2. The user browses products.
3. When a product is added, the system moves to **Cart updated**.
4. The user proceeds to **Checkout**.
5. The system enters **Payment processing**.

## Transitions

- If the payment is successful:
  - The order moves to **Order confirmed**.
  - Then it reaches the final state.

- If the payment fails:
  - The order moves to **Order failed**.
  - Then it reaches the final state.

## Conclusion

This diagram helps to understand how an order changes state during the purchase process, depending on the result of the payment.