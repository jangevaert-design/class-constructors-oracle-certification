package edu.cnm.deepdive;

class Dog {
  private String color;

  public Dog(String color) {
    System.out.println("constructor");
    this.color = color;//without this color on the left side would refer to the parameter color on
    // line 10. With 'this' we refer to the instance variable color on line 4.
  }

  public void printColor() {
    System.out.println("color = " + this.color);//the 'this' key word is only needed when the constructor
    //parameter is the same as the instance variable identifier.
  }
}

class Cat {
  private String color;
  private int height;
  private int length;

  public Cat(String color, int height, int length) {
    this.color = color;
    this.height = height;
    this.length = length;

  }

  public void printDetails() {
    System.out.println("color of the cat = " + this.color);
    System.out.println("height of the cat = " + this.height + " meters");
    System.out.println("length of the cat = " + this.length + " ton");
  }



}

public class ClassConstructors {

  public static void main(String[] args) {
    Dog dog = new Dog("gray");
    dog.printColor();

    Cat cat = new Cat("white", 440, 300_000);
    System.out.println();
    cat.printDetails();
  }
}
