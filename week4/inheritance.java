package week4_oop;
//1. inheritance
class Animal {
    String name; 

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.eat(); // Inherited method
        dog.bark(); // Method of Dog class
    }
}
