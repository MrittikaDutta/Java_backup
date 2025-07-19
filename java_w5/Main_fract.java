package week5_oop;

// Question 7: Define a class Fraction having data members numerator and denominator.
// Initialize three objects using different constructors and display its fractional value.

class Fraction {
    private int numerator;
    private int denominator;

    // Constructor with default denominator as 1
    Fraction(int numerator) {
        this(numerator, 1); 
    }

    // Constructor with numerator and denominator
    Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void displayFraction() {
        System.out.println("Fraction: " + numerator + "/" + denominator);
    }
}

// Main class to test Fraction class
public class Main_fract {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3);
        Fraction fraction2 = new Fraction(4, 5);
        Fraction fraction3 = new Fraction(7, 8);

        fraction1.displayFraction();
        fraction2.displayFraction();
        fraction3.displayFraction();
    }
}

/*
Sample Output:
Fraction: 3/1
Fraction: 4/5
Fraction: 7/8
*/
