package ex04bis_improving_conditions;

import java.util.Scanner;

public class Main {

  
  public static void main(String[] args){
    

    try (Scanner scanner = new Scanner(System.in)) {

      int age;

      System.out.print("Veuillez entrer votre âge : ");

      while (!scanner.hasNextInt()) {
        System.out.print("Veuillez entrer votre âge en nombre entier uniquement : ");
        scanner.next();
      }

      age = scanner.nextInt();

        if (age < 18) {
          System.out.println("Mineur");
        } else if (age < 65) {
          System.out.println("Majeur");
        } else {
          System.out.println("Senior");
        }
      }
    }
  }
