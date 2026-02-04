package ex05bis_improving_loops;

public class Main {

  public static void printNumbers(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.println(i);
    }
  }


  public static void printTable(int n) {
    for (int i = 1; i <= 10; i++ ){
      System.out.println(n + " x " + i + " = " + (n * i));
    }
  }

  public static void printTableWhile(int n) {
    int i = 1;
    while (i <= 10) {
      System.out.println(n + " x " + i + " = " + (n * i));
      i++;
    }
  }

  public static void main (String[] args) {
    printNumbers(5);
    System.out.println();
    printTable(5);
    System.out.println();
    printTableWhile(7);
}
}