package ex02_variables;

public class Main {
  public static void main(String[] args) {
    String firstname = "Ludovic";
    int age = 30;
    double height = 1.80;

    System.out.println("Je m'appelle " + firstname + ", j'ai " + age + " ans et je mesure " + String.format("%.2f", height) + " m.");
    System.out.println("Dans 10 ans, j'aurais " + (age + 10) + " ans.");
  
}
}
