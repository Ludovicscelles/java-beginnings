package ex07_arrays;

public class Main {

   public static void main(String[] args) {
    // declare and initialize an array of integers
    int [] numbers = {12, 15, 9, 18, 14, 21};

    int sum = 0;
    int max = numbers[0];

    for (int number : numbers) {
      System.out.println(number);
      sum += number;
      if (number > max) {
        max = number;
      }
    }

    System.out.println("La Somme de ces nombres est de : " + sum);

    // calculate the average
    // double is used to get a precise result
    double average = (double) sum / numbers.length;

    System.out.println("La Moyenne de ces nombres est de : " + String.format("%.3f", average));

    System.out.println("Le plus grand nombre est de : " + max);
  }
}