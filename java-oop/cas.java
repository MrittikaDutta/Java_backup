// Compile-time Polymorphism (Method Overloading)
class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class cas {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // Calls the overridden method in Dog
    }
}

