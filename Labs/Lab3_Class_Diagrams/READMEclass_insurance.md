# Car Insurance System - Class Diagram

## Overview
This diagram represents the structure of a Car Insurance System using different classes and their relationships.

## Classes

### Policy
- Attributes:
  - policyNumber
  - premium
- Methods:
  - calculatePremium()

### Claim
- Attributes:
  - claimId
  - amount
- Methods:
  - submitClaim()

### Customer
- Attributes:
  - customerId
  - name
- Methods:
  - applyForPolicy()

### InsuranceCompany
- Attributes:
  - companyId
  - companyName
- Methods:
  - issuePolicy()

### Vehicle
- Attributes:
  - vin
  - plateNumber
- Methods:
  - getVehicleInfo()

## Relationships

- A **Customer** can apply for a **Policy**.
- A **Policy** is related to **Claim**, since claims are made for a policy.
- The **InsuranceCompany** manages policies and interacts with customers.
- A **Vehicle** is associated with the policy.
  
## Conclusion

This diagram shows how the main elements of an insurance system are connected and how they interact with each other.