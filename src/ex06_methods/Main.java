package ex06_methods;

public class Main {

  public static void main(String[] args) {

    // testing the methods
    System.out.println("Le résultat de l'addition est de " + addition(3, 5));
    System.out.println("Le résultat de la multiplication est de " + multiplication(4, 6));
    System.out.println("Le résultat de la multiplication de trois nombres est de " + multiplyThree(2, 3, 4));
    System.out.println("Le plus grand nombre est " + max(10, 20));
    System.out.println("Le nombre 7 est-il pair ? " + isEven(7));
    System.out.println("Le nombre 8 est-il pair ? " + isEven(8));
  }

  static int addition(int a, int b) {
      return a + b;
  }

  static int multiplication(int a, int b) {
    return a * b;
  }

  static int multiplyThree(int a, int b, int c) {
    return a * b * c;
  }

  static int max(int a, int b) {
    return a > b ? a : b ; 
  }


  static boolean isEven(int n){
    return n % 2 == 0;
  }

}