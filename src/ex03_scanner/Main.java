package ex03_scanner;

import java.util.Scanner;

public class Main {

 // Entry point of the program
  public static void main(String[] args) {

    // Read input from keyboard
    Scanner data = new Scanner(System.in);

    // prompting the user for their first name and age and storing the inputs
    System.out.print("Prénom : ");
    String firstname = data.nextLine();

    System.out.print("Âge : ");
    int age = data.nextInt();

    // displaying a greeting message that includes the user's first name and age
    System.out.println("Bonjour " + firstname + ", tu as " + age + " ans." );
     
    data.close();

  }
}