# E-commerce System - Activity Diagram (Order Management)

## Overview
This diagram shows the process that happens after a customer places an order in an e-commerce system.

## Process

1. The process starts when an order is placed.
2. The system validates the order details.
3. If the order details are not valid, the order is rejected.
4. The system checks if the payment is confirmed.
5. If the payment is not confirmed, the process stops and the customer is notified.
6. The system checks product availability.
7. If the product is not available:
   - The order is cancelled or
   - The customer is notified.

## Order Handling

If everything is correct:
- The stock is updated or reserved.
- The system assigns a supplier or warehouse.
- The order is prepared for shipping.
- The order is shipped.

## Delivery Process

- If the delivery is successful:
  - The order is delivered to the customer.
- If the delivery fails:
  - The system may retry delivery.
  - If it fails again, the delivery is marked as failed.

## Conclusion

This diagram helps to understand the internal workflow of order processing, including validation, stock management, shipping, and delivery.