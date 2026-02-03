package exercises;

/**
 * Exercise 2: Variables and Data Types
 * 
 * Learn about different data types in Java and how to declare and use variables.
 * 
 * Key Concepts:
 * - Primitive data types (int, double, boolean, char)
 * - String (reference type)
 * - Variable declaration and initialization
 * - Basic operations
 */
public class Exercise2_Variables {
    
    public static void main(String[] args) {
        // Integer (whole numbers)
        int age = 25;
        int year = 2026;
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        
        // Double (decimal numbers)
        double price = 19.99;
        double pi = 3.14159;
        System.out.println("Price: $" + price);
        System.out.println("Pi: " + pi);
        
        // Boolean (true or false)
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);
        
        // Character (single character)
        char grade = 'A';
        char initial = 'J';
        System.out.println("Grade: " + grade);
        System.out.println("Initial: " + initial);
        
        // String (text)
        String firstName = "Java";
        String lastName = "Programmer";
        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);
        
        // Basic arithmetic operations
        int a = 10;
        int b = 3;
        System.out.println("\nArithmetic Operations:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division (integer)
        System.out.println("a % b = " + (a % b));  // Modulus (remainder)
        
        // Challenge: Create variables for your personal information
        // and print them out
        String myName = "Student";
        int myAge = 20;
        double myHeight = 1.75;
        System.out.println("\nMy Information:");
        System.out.println("Name: " + myName);
        System.out.println("Age: " + myAge);
        System.out.println("Height: " + myHeight + "m");
    }
}
