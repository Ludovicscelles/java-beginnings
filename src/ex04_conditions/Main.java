package ex04_conditions;

import java.util.Scanner;

public class Main {

  public static void main (String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Âge : ");
    int age = input.nextInt();

    // checking conditions
    if (age < 18) {
      System.out.println("Mineur");
    } else if (age >= 65) {
      System.out.println("Senior");
    } else {
      System.out.println("Majeur");
    }
    input.close();
  }
}