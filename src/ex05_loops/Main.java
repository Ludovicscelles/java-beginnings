package ex05_loops;

public class Main {

  public static void main (String[] args) {
    // loop to print numbers from 1 to 10
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    // loop to print multiplication table of 7
    int n = 7;
    for (int i = 1; i <= 10; i++ ){
      System.out.println(n + " x " + i + " = " + (n * i));
    }
    System.out.println("\n");

    // while loop to print multiplication table of 5
    int number = 5;
    int j = 1;
    while (j <= 10) {
      System.out.println(number + " x " + j + " = " + (number * j));
      j++;
    }

  }
}