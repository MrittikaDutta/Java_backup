package week5_oop;
// Question 4: Define a class with a 3-digit number as a data member. Initialize and display the reverse of that number.

class ReverseNumber {
    private int num;

    ReverseNumber(int num) {
        if (num < 100 || num > 999) {
            throw new IllegalArgumentException("Number must be a 3-digit number.");
        }
        this.num = num;
    }

    void displayReverse() {
        int reverse = 0, temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reverse of " + num + " is: " + reverse);
    }
}

// Main class to test ReverseNumber
public class Main_rev {
    public static void main(String[] args) {
        ReverseNumber number = new ReverseNumber(123);
        number.displayReverse();
    }
}
//Reverse of 123 is: 321
