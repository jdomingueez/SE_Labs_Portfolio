# ATM System - Sequence Diagram

## Overview
This diagram shows how an ATM system works step by step when a customer withdraws money.

## Process

1. The customer inserts the card into the ATM.
2. The ATM verifies the card with the bank server.
3. If the card is valid, the ATM asks for the PIN.
4. The customer enters the PIN.
5. The ATM verifies the PIN with the bank server.
6. If the PIN is correct, the customer enters the amount.
7. The ATM sends the request to the bank server to check the account balance.
8. If there are enough funds:
   - The money is withdrawn.
   - The ATM dispenses the cash.
   - The transaction is completed successfully.
9. If there are not enough funds:
   - The transaction fails.

## Alternative Flows

- If the card is invalid, the ATM ejects the card.
- If the PIN is incorrect, the ATM ejects the card.
- If there are insufficient funds, the transaction is unsuccessful.

## Conclusion

This diagram helps to understand the sequence of actions between the customer, the ATM, and the bank system during a transaction.