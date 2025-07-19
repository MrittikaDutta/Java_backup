package week5_oop.week_6;
//5. Create three interfaces, each with two methods. Inherit a new interface from the three, adding a
//new method. Create a class by implementing the new interface and also inheriting from a concrete
// class. Now write four methods, each of which takes one of the four interfaces as an argument. In
// main ( ), create an object of your class and pass it to each of the methods.

interface Interface1 {
    void method1A();
    void method1B();
}

// Interface 2
interface Interface2 {
    void method2A();
    void method2B();
}

// Interface 3
interface Interface3 {
    void method3A();
    void method3B();
}

// Combined Interface inheriting from Interface1, Interface2, and Interface3
interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void methodD();
}

// Concrete class with its own method
class ConcreteClass {
    void concreteMethod() {
        System.out.println("This is a method in the concrete class.");
    }
}

// Implementation class that inherits from ConcreteClass and implements CombinedInterface
class ImplementationClass extends ConcreteClass implements CombinedInterface {
    // Implementation of Interface1 methods
    public void method1A() {
        System.out.println("Method 1A from Interface1");
    }

    public void method1B() {
        System.out.println("Method 1B from Interface1");
    }

    // Implementation of Interface2 methods
    public void method2A() {
        System.out.println("Method 2A from Interface2");
    }

    public void method2B() {
        System.out.println("Method 2B from Interface2");
    }

    // Implementation of Interface3 methods
    public void method3A() {
        System.out.println("Method 3A from Interface3");
    }

    public void method3B() {
        System.out.println("Method 3B from Interface3");
    }

    // Implementation of CombinedInterface method
    public void methodD() {
        System.out.println("Method D from CombinedInterface");
    }
}

public class q5 {
    // Method that takes Interface1 as an argument
    static void takeInterface1(Interface1 obj) {
        obj.method1A();
        obj.method1B();
    }

    // Method that takes Interface2 as an argument
    static void takeInterface2(Interface2 obj) {
        obj.method2A();
        obj.method2B();
    }

    // Method that takes Interface3 as an argument
    static void takeInterface3(Interface3 obj) {
        obj.method3A();
        obj.method3B();
    }

    // Method that takes CombinedInterface as an argument
    static void takeCombinedInterface(CombinedInterface obj) {
        obj.methodD();
    }

    public static void main(String[] args) {
        ImplementationClass obj = new ImplementationClass();

        // Passing the object to each method
        takeInterface1(obj);
        takeInterface2(obj);
        takeInterface3(obj);
        takeCombinedInterface(obj);
    }
}
