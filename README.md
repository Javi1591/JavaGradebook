# Java GradeBook Project – Final Application

A Java console application that simulates a **GradeBook system**, allowing users to manage student names, scores, and calculate averages.  
This project demonstrates modular object-oriented design, integration between multiple classes, and core concepts such as arrays, encapsulation, and input handling.

---

## Project Overview

### Description
The GradeBook program allows users to enter and process student grades for a course.  
It uses two primary classes:  
- **GradeBook_Start.java** – defines the GradeBook logic and encapsulates data management.  
- **Main.java** – acts as the program driver, handling user interaction, input/output, and control flow.  

The application stores student names and grades, calculates averages, and displays formatted results.  
It demonstrates the integration of multiple Java programming principles into a cohesive, functional application.

---

## Features
- Allows entry of student names and their corresponding grades.  
- Calculates the average score across all students.  
- Uses arrays or array-like structures to store data.  
- Validates user input and handles exceptions gracefully.  
- Displays formatted output of student data and calculated results.  
- Demonstrates clean separation between business logic (GradeBook) and application control (Main).  

---

## Learning Objectives
- Apply **object-oriented programming** principles using multiple classes.  
- Reinforce concepts of **encapsulation** and **data abstraction**.  
- Use **arrays** and **loops** for storing and processing multiple data points.  
- Implement modular design with method-based organization.  
- Practice **exception handling** and **input validation** in Java applications.  

---

## Program Structure
1. **GradeBook Class**  
   - Encapsulates arrays or lists for student names and grades.  
   - Provides methods for adding data, computing averages, and displaying results.  
   - Uses private fields with accessor and mutator methods where necessary.

2. **Main Class**  
   - Contains the `main()` method to start program execution.  
   - Manages user input through the console.  
   - Calls GradeBook methods to perform calculations and present results.  

3. **Output Phase**  
   - Displays student names, individual scores, and overall class average.  
   - Provides a clear and formatted output for readability.  

---

## How to Compile and Run

### Requirements
- Java Development Kit (JDK) 17 or newer  
- A Java-compatible IDE (IntelliJ IDEA, VS Code, Eclipse) or terminal environment

### Command Line Instructions
```bash
javac GradeBook_Start.java Main.java
java Main
