package week5_oop.week_6;

//1. Design an abstract class having two methods. Create Rectangle and Triangle classes by inheriting
// the shape class and override the above methods to suitably implement for Rectangle and Triangle
// class.

abstract class Shape {
    // Abstract methods for area and perimeter
    abstract double area();
    abstract double perimeter();
}

// Rectangle class inheriting from Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override area method
    @Override
    double area() {
        return length * width;
    }

    // Override perimeter method
    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    private double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}

public class q1 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
    }
}
