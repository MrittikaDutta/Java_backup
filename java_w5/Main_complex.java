package week5_oop;

// Question 3: Create a class called Complex, which has two private instance variables – real and imaginary.
// It contains a method called add() which takes one Complex object as a parameter and prints the added value
// of the calling Complex object and passes the Complex object. In the main method, declare two Complex objects
// and assign values using the constructor and call the add() method.

class Complex {
    private double real, imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void add(Complex c) {
        double realSum = this.real + c.real;
        double imaginarySum = this.imaginary + c.imaginary;
        System.out.println("Added Complex Number: " + realSum + " + " + imaginarySum + "i");
    }
}

// Main class to test the Complex class
public class Main_complex {
    public static void main(String[] args) {
        Complex complex1 = new Complex(4.5, 3.2);
        Complex complex2 = new Complex(1.5, 2.8);
        complex1.add(complex2);
    }
}
//Added Complex Number: 6.0 + 6.0i

