# E-commerce System - Sequence Diagram

## Overview
This diagram shows how a customer interacts with an e-commerce platform to browse products, add them to the cart, and complete a purchase.

## Process

1. The customer can log in (optional).
2. The customer browses products.
3. The system displays the product list and details.
4. The customer adds a product to the shopping cart.
5. The customer proceeds to checkout.
6. The platform retrieves the cart items.
7. The payment process is started.

## Payment Flow

- If the payment is successful:
  - The payment is confirmed.
  - The order details are sent to the supplier.
  - The supplier accepts the order.
  - The system confirms the order to the customer.
  - The shopping cart is cleared.

- If the payment fails:
  - A payment failure message is shown to the customer.

## Conclusion

This diagram helps to understand the interaction between the customer, the e-commerce platform, the shopping cart, the payment system, and the supplier during a purchase process.