package ex03bis_improving_scanner;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // try-with-resources to ensure the scanner is closed automatically
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Prénom : ");
      String firstname = input.nextLine();

      // Loop until a valid integer is entered for age
      int age;
      // Prompt for age until a valid integer is provided
      while (true) {
        System.out.print("Âge : ");
        // Check if the next token is an integer
        // If it is, read it and break the loop
        if (input.hasNextInt()) {
          age = input.nextInt();
          break;
        }
        System.out.printf("Veuillez entrer un âge valide.%n");
        input.next();
      }

      System.out.printf("Bonjour %s, tu as %d ans.%n", firstname, age);
    }
  }
}