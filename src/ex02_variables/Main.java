// package declaration
// defining the package name for this Java file
package ex02_variables;

// class declaration
public class Main {
  // main method - entry point of the program
  // method signature
  // defining the main method which takes an array of Strings as arguments
  public static void main(String[] args) {
    // variable declarations and initializations - string, integer, and double types
    String firstname = "Ludovic";
    int age = 30;
    double height = 1.80;

    // printing formatted output to the console
    System.out.println("Je m'appelle " + firstname + ", j'ai " + age + " ans et je mesure " + String.format("%.2f", height) + " m.");
    System.out.println("Dans 10 ans, j'aurais " + (age + 10) + " ans.");
  
}
}
