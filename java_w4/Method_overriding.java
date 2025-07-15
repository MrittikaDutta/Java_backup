package week4_oop;

// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Method_overriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Calls the overridden method
    }
}
