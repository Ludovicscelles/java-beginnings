package exercises;

/**
 * Exercise 5: Methods (Functions)
 * 
 * Learn how to create and use methods in Java.
 * 
 * Key Concepts:
 * - Method declaration and definition
 * - Parameters and arguments
 * - Return values
 * - Method overloading
 * - Void vs non-void methods
 */
public class Exercise5_Methods {
    
    /**
     * Main method - entry point of the program
     */
    public static void main(String[] args) {
        System.out.println("=== BASIC METHODS ===");
        
        // Call a method with no parameters and no return value
        greet();
        
        // Call a method with parameters
        greetPerson("Alice");
        greetPerson("Bob");
        
        System.out.println("\n=== METHODS WITH RETURN VALUES ===");
        
        // Call a method with return value
        int sum = add(5, 3);
        System.out.println("5 + 3 = " + sum);
        
        int product = multiply(4, 7);
        System.out.println("4 x 7 = " + product);
        
        // Use method in expression
        System.out.println("10 + 20 = " + add(10, 20));
        
        System.out.println("\n=== MORE COMPLEX METHODS ===");
        
        // Check if number is even
        System.out.println("Is 8 even? " + isEven(8));
        System.out.println("Is 7 even? " + isEven(7));
        
        // Find maximum of two numbers
        System.out.println("Max of 15 and 23: " + max(15, 23));
        
        // Calculate area of rectangle
        double area = calculateRectangleArea(5.0, 3.0);
        System.out.println("Area of rectangle (5 x 3): " + area);
        
        System.out.println("\n=== METHOD OVERLOADING ===");
        
        // Same method name, different parameters
        System.out.println("Sum of 2 numbers: " + sum(10, 20));
        System.out.println("Sum of 3 numbers: " + sum(10, 20, 30));
        System.out.println("Sum of 4 numbers: " + sum(10, 20, 30, 40));
        
        System.out.println("\n=== ARRAY METHODS ===");
        
        int[] numbers = {1, 2, 3, 4, 5};
        printArray(numbers);
        
        int total = sumArray(numbers);
        System.out.println("Total sum: " + total);
        
        double avg = average(numbers);
        System.out.println("Average: " + avg);
        
        System.out.println("\n=== STRING METHODS ===");
        
        String reversed = reverseString("Hello");
        System.out.println("Reversed 'Hello': " + reversed);
        
        System.out.println("Is 'radar' a palindrome? " + isPalindrome("radar"));
        System.out.println("Is 'hello' a palindrome? " + isPalindrome("hello"));
        
        System.out.println("\n=== CHALLENGES ===");
        
        // Factorial
        System.out.println("Factorial of 5: " + factorial(5));
        
        // Fibonacci
        System.out.println("10th Fibonacci number: " + fibonacci(10));
        
        // Temperature conversion
        System.out.println("25°C in Fahrenheit: " + celsiusToFahrenheit(25.0));
        System.out.println("77°F in Celsius: " + fahrenheitToCelsius(77.0));
    }
    
    // ===== METHOD DEFINITIONS =====
    
    /**
     * Simple greeting method with no parameters or return value
     */
    public static void greet() {
        System.out.println("Hello, World!");
    }
    
    /**
     * Greet a specific person
     */
    public static void greetPerson(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    /**
     * Add two numbers and return the result
     */
    public static int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Multiply two numbers and return the result
     */
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * Check if a number is even
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    /**
     * Find the maximum of two numbers
     */
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    /**
     * Calculate area of a rectangle
     */
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    
    /**
     * Sum of two numbers (overloaded)
     */
    public static int sum(int a, int b) {
        return a + b;
    }
    
    /**
     * Sum of three numbers (overloaded)
     */
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    /**
     * Sum of four numbers (overloaded)
     */
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    /**
     * Print all elements of an array
     */
    public static void printArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    /**
     * Calculate sum of array elements
     */
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    /**
     * Calculate average of array elements
     */
    public static double average(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return (double) sumArray(arr) / arr.length;
    }
    
    /**
     * Reverse a string
     */
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    
    /**
     * Check if a string is a palindrome
     */
    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }
    
    /**
     * Calculate factorial of a number
     */
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    /**
     * Calculate nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
    
    /**
     * Convert Celsius to Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
    
    /**
     * Convert Fahrenheit to Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}
