package ex02bis_improving_variables;

public class Main {

  public static void main(String[] args) {
    String firstname = "Ludovic";
    int age = 30;
    int futureAge = age + 10;
    double height = 1.80;

    // simple example of variable usage 
    System.out.printf("Je m'appelle %s, j'ai %d ans et je mesure %.2f m.%n", firstname, age, height);
    System.out.printf("Dans 10 ans, j'aurais %d ans.%n", futureAge);
  }
}

