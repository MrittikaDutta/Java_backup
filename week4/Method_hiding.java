package week4_oop;
//4. Java Program to Show Method Hiding
// Superclass
class Animal {
    static void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Hiding the static method from Animal class
    static void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Method_hiding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Calls Animal's sound method

        Dog dog = new Dog();
        dog.sound(); // Calls Dog's sound method

        Animal animalDog = new Dog();
        animalDog.sound(); // Calls Animal's sound method, not Dog's
    }
}
