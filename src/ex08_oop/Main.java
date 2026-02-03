package ex08_oop;

// define a Person class
class Person {
  String name;
  int age;

  // constructor
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // method to present oneself
  void introduce() {
    System.out.println("Je m'appelle " + name + " et j'ai " + age + " ans.");
  }
}

public class Main {

  // main method
  // create Person objects and call their methods
   public static void main(String[] args){
    Person p1 = new Person("Ludovic", 30);
    Person p2 = new Person("Alice", 25);

    // present oneself
    // call the method for each person
    p1.introduce();
    p2.introduce();
   }
}