package ex08bis_improving_oop;

// define a Person class
class Person {
  private String name;
  private int age;

  // constructor
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // method to present oneself
  void introduce() {
    System.out.printf("Je m'appelle %s et j'ai %d ans.%n", name, age);
  }

  // getter for name
  public String getName() {
    return name;
  }

  // getter for age 
   public int getAge() {
    return age;
  }


  // setter for name
  public void setName(String name) {
    this.name = name;

}

  // setter for age
  public void setAge(int age) {
    this.age = age;
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

    // access attributes using getters
    System.out.printf("%s a %d ans.%n", p1.getName(), p1.getAge());
    System.out.printf("%s a %d ans.%n", p2.getName(), p2.getAge());

    // modify attributes using setters
    p1.setName("Ludo");
    p1.setAge(31);
   }
  }


