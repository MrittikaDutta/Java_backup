package week5_oop;

// Question 11: Define a class called Circle with the specified properties and methods.

class Circle {
    private double radius;
    private String color;

    // Default constructor
    Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor with radius parameter
    Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Main class to test Circle class
public class Main_circ {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);

        System.out.println("Circle 1: Radius = " + circle1.getRadius() + ", Area = " + circle1.getArea());
        System.out.println("Circle 2: Radius = " + circle2.getRadius() + ", Area = " + circle2.getArea());
    }
}

/*
Sample Output:
Circle 1: Radius = 1.0, Area = 3.141592653589793
Circle 2: Radius = 5.0, Area = 78.53981633974483
*/
