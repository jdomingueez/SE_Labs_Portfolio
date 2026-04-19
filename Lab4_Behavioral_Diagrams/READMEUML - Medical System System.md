 # Medical Clinic System - State Diagram

## Overview
This diagram shows the different states of the Medical Clinic System and how it moves from one state to another.

## Main States

- Powered Off
- System Check
- Unavailable
- Maintenance Mode
- Waiting for Patient

## Process

1. The system starts in the initial state.
2. It moves to the **Powered Off** state.
3. When the system is turned on, it performs a **System Check**.
4. If the diagnostic fails, the system becomes **Unavailable**.
5. After technician service, it goes to **Maintenance Mode**.
6. When the reset is complete, the system moves to **Waiting for Patient**.
7. If the diagnostic passes, the system can also go directly to **Waiting for Patient**.
8. Finally, the system reaches the final state.

## Patient Service

Inside the patient service process, the system follows these steps:

1. Verify Patient
2. Register Visit
3. Consultation
4. Billing/Checkout

## Conclusion

This diagram helps to understand the different states of the medical system and how the system behaves before and during patient service.