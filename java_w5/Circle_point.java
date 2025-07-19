package week5_oop;

// Question 1: Create a “circle” class & a “point” class. The coordinates of the circle are given and used within
// the “circle” class as an object of the “point” class. Display the area of the circle.

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point center;
    double radius;

    Circle(double x, double y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void displayArea() {
        System.out.println("Area of the circle: " + calculateArea());
    }
}

// Main class to test the Circle and Point classes
public class Circle_point {
    public static void main(String[] args) {
        Circle circle = new Circle(3, 4, 5);
        circle.displayArea();
    }
}
//Area of the circle: 78.53981633974483

