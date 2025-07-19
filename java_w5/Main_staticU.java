package week5_oop;

// Question 19: Demonstrate use of 'static' keyword.

class Counter {
    private static int count = 0; // Static variable

    // Static method
    public static void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

// Main class to test 'static' keyword
public class Main_staticU {
    public static void main(String[] args) {
        Counter.increment();
        Counter.increment();
        System.out.println("Count: " + Counter.getCount()); // Accessing static method and variable
    }
}

/*
Sample Output:
Count: 2
*/
