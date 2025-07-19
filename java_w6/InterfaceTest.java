package week5_oop.week_6;

interface InterfaceA {
    void methodA1();
    void methodA2();
}

interface InterfaceB {
    void methodB1();
    void methodB2();
}

interface InterfaceC {
    void methodC1();
    void methodC2();
}

interface CombinedInterface extends InterfaceA, InterfaceB, InterfaceC {
    void methodD();
}

class ConcreteClass {
    void concreteMethod() {
        System.out.println("This is a method in the concrete class.");
    }
}

class ImplementationClass extends ConcreteClass implements CombinedInterface {
    public void methodA1() {
        System.out.println("Method A1");
    }

    public void methodA2() {
        System.out.println("Method A2");
    }

    public void methodB1() {
        System.out.println("Method B1");
    }

    public void methodB2() {
        System.out.println("Method B2");
    }

    public void methodC1() {
        System.out.println("Method C1");
    }

    public void methodC2() {
        System.out.println("Method C2");
    }

    public void methodD() {
        System.out.println("Method D");
    }
}

public class InterfaceTest {
    static void takeInterfaceA(InterfaceA obj) {
        obj.methodA1();
        obj.methodA2();
    }

    static void takeInterfaceB(InterfaceB obj) {
        obj.methodB1();
        obj.methodB2();
    }

    static void takeInterfaceC(InterfaceC obj) {
        obj.methodC1();
        obj.methodC2();
    }

    static void takeCombinedInterface(CombinedInterface obj) {
        obj.methodD();
    }

    public static void main(String[] args) {
        ImplementationClass obj = new ImplementationClass();
        takeInterfaceA(obj);
        takeInterfaceB(obj);
        takeInterfaceC(obj);
        takeCombinedInterface(obj);
    }
}
