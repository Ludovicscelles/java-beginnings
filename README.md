# Java Beginnings - Java Exercises

Welcome to Java Beginnings! This repository contains a collection of Java exercises designed for beginners to learn and practice fundamental Java programming concepts.

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- A text editor or IDE (Eclipse, IntelliJ IDEA, VS Code, etc.)

## Project Structure

```
java-beginnings/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── exercises/
│   │           ├── Exercise1_HelloWorld.java
│   │           ├── Exercise2_Variables.java
│   │           ├── Exercise3_ControlFlow.java
│   │           ├── Exercise4_Arrays.java
│   │           └── Exercise5_Methods.java
│   └── test/
│       └── java/
│           └── exercises/
└── README.md
```

## Exercises

### Exercise 1: Hello World
Learn the basic structure of a Java program and how to print output to the console.

### Exercise 2: Variables and Data Types
Practice declaring and using different data types in Java (int, double, String, boolean, etc.).

### Exercise 3: Control Flow
Work with conditional statements (if/else) and loops (for, while).

### Exercise 4: Arrays
Learn how to create, initialize, and manipulate arrays in Java.

### Exercise 5: Methods
Practice creating and calling methods with parameters and return values.

## How to Run

### Compile a single exercise:
```bash
javac src/main/java/exercises/Exercise1_HelloWorld.java
```

### Run a compiled exercise:
```bash
java -cp src/main/java exercises.Exercise1_HelloWorld
```

### Or compile and run all exercises:
```bash
# Compile all
javac -d bin src/main/java/exercises/*.java

# Run a specific exercise
java -cp bin exercises.Exercise1_HelloWorld
```

## Learning Tips

1. Start with Exercise 1 and work your way through sequentially
2. Read the comments in each exercise file carefully
3. Modify the code and experiment to understand how it works
4. Try to solve the challenges before looking at the solutions

## Contributing

Feel free to add more exercises or improve existing ones!

## License

This project is for educational purposes.