package exercises;

/**
 * Exercise 3: Control Flow
 * 
 * Learn about conditional statements and loops in Java.
 * 
 * Key Concepts:
 * - if, else if, else statements
 * - Comparison operators (==, !=, <, >, <=, >=)
 * - Logical operators (&&, ||, !)
 * - for loops
 * - while loops
 */
public class Exercise3_ControlFlow {
    
    public static void main(String[] args) {
        System.out.println("=== IF/ELSE STATEMENTS ===");
        
        // Simple if statement
        int temperature = 25;
        if (temperature > 30) {
            System.out.println("It's hot outside!");
        } else if (temperature > 20) {
            System.out.println("It's a nice day!");
        } else {
            System.out.println("It's cold outside!");
        }
        
        // Multiple conditions
        int age = 18;
        boolean hasLicense = true;
        if (age >= 18 && hasLicense) {
            System.out.println("You can drive!");
        } else {
            System.out.println("You cannot drive yet.");
        }
        
        // Check if number is even or odd
        int number = 7;
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
        
        System.out.println("\n=== FOR LOOPS ===");
        
        // Count from 1 to 5
        System.out.println("Counting 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        
        // Count backwards
        System.out.println("\nCounting backwards from 5 to 1:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        
        // Print even numbers
        System.out.println("\nEven numbers from 0 to 10:");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        
        System.out.println("\n=== WHILE LOOPS ===");
        
        // While loop example
        int count = 0;
        System.out.println("Counting with while loop:");
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }
        
        // Do-while loop (executes at least once)
        int x = 0;
        System.out.println("\nDo-while loop:");
        do {
            System.out.println("x = " + x);
            x++;
        } while (x < 3);
        
        System.out.println("\n=== CHALLENGES ===");
        
        // Challenge 1: Print multiplication table for 5
        System.out.println("Multiplication table for 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
        
        // Challenge 2: Find sum of numbers 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("\nSum of 1 to 10: " + sum);
        
        // Challenge 3: Grade calculator
        int score = 85;
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("\nScore: " + score + " - Grade: " + grade);
    }
}
