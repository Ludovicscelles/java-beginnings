package exercises;

/**
 * Exercise 4: Arrays
 * 
 * Learn about arrays in Java - how to create, initialize, and manipulate them.
 * 
 * Key Concepts:
 * - Array declaration and initialization
 * - Accessing array elements
 * - Array length property
 * - Iterating through arrays
 * - Multi-dimensional arrays
 */
public class Exercise4_Arrays {
    
    public static void main(String[] args) {
        System.out.println("=== ARRAY BASICS ===");
        
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Access array elements (index starts at 0)
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        System.out.println("Last element: " + numbers[4]);
        
        // Array length
        System.out.println("Array length: " + numbers.length);
        
        // Modify array element
        numbers[2] = 35;
        System.out.println("Modified third element: " + numbers[2]);
        
        System.out.println("\n=== ITERATING THROUGH ARRAYS ===");
        
        // Using a for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        
        // Using enhanced for loop (for-each)
        System.out.println("\nUsing for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
        
        System.out.println("\n=== STRING ARRAYS ===");
        
        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grape"};
        System.out.println("Fruits in the array:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
        
        System.out.println("\n=== CREATING ARRAYS WITH NEW ===");
        
        // Create array with specific size
        double[] prices = new double[5];
        prices[0] = 9.99;
        prices[1] = 19.99;
        prices[2] = 29.99;
        prices[3] = 39.99;
        prices[4] = 49.99;
        
        System.out.println("Prices:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Item " + (i + 1) + ": $" + prices[i]);
        }
        
        System.out.println("\n=== ARRAY OPERATIONS ===");
        
        // Find maximum value
        int[] values = {45, 12, 78, 34, 90, 23, 67};
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Maximum value: " + max);
        
        // Find minimum value
        int min = values[0];
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        System.out.println("Minimum value: " + min);
        
        // Calculate average
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        double average = (double) sum / values.length;
        System.out.println("Average: " + average);
        
        System.out.println("\n=== 2D ARRAYS ===");
        
        // Create a 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n=== CHALLENGES ===");
        
        // Challenge 1: Count even numbers
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);
        
        // Challenge 2: Reverse print an array
        System.out.println("\nArray in reverse:");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
        // Challenge 3: Find a specific value
        int searchValue = 7;
        int position = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == searchValue) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("\nFound " + searchValue + " at index " + position);
        } else {
            System.out.println("\n" + searchValue + " not found");
        }
    }
}
