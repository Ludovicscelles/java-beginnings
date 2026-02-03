package ex06_methods;

public class Main {

  public static void main(String[] args) {

    // testing the methods
    System.out.println(addition(3, 5));
    System.out.println(max(48, 22));
    System.out.println(isEven(22));
  }

  // method to add two integers
  static int addition(int a, int b) {
      return a + b;
  }

  // method to find the maximum of two integers
  static int max(int a, int b) {
    return a > b ? a : b ; 
  }


  // method to check if a number is even
  static boolean isEven(int n){
    return n % 2 == 0;
  }

}