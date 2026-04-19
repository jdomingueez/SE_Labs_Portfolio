# Medical System - Class Diagram

## Overview
This diagram represents the structure of a medical system using different classes and their relationships.

## Classes

### Person
- Attributes:
  - id
  - name
- Methods:
  - getDetails()

### Patient
- Attributes:
  - insuranceNumber
- Methods:
  - requestAppointment()

### Doctor
- Attributes:
  - specialization
- Methods:
  - diagnose()

### Appointment
- Attributes:
  - appointmentId
  - dateTime
- Methods:
  - confirm()

### MedicalRecord
- Attributes:
  - recordId
  - diagnosis
- Methods:
  - updateRecord()

## Relationships

- **Patient** and **Doctor** inherit from **Person**.
- A **Patient** can request an **Appointment**.
- A **Doctor** is related to appointments and medical records.
- **MedicalRecord** stores information about diagnoses.

## Conclusion

This diagram shows how the main parts of a medical system are organized and how patients, doctors, and records are connected.