package week5_oop;

// Question 18: Demonstrate use of 'this' keyword.

class MyClass {
    private int value;

    // Constructor
    MyClass(int value) {
        this.value = value; // 'this' keyword refers to the current object
    }

    // Method to display value
    void displayValue() {
        System.out.println("Value: " + this.value); // 'this' is optional here but used for clarity
    }
}

// Main class to test 'this' keyword
public class Mainthis {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        obj.displayValue();
    }
}

/*
Sample Output:
Value: 10
*/
