package week5_oop.week_6;
//3. Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone from it.
// The class ThreeDObject has methods wholeSurfaceArea ( ) and volume(). Override these two
// methods in each of the derived classes to calculate the volume and whole surface area of each
// type of three-dimensional objects. The dimensions of the objects are to be taken from the
// users and passed through the respective constructors of each derived class. Write a main method
// to test these classes.

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    private double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    private double side;

    Cube(double side) {
        this.side = side;
    }

    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    private double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    private double radius, height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    double volume() {
        return Math.PI * radius * radius * height / 3;
    }
}

public class q3 {
    public static void main(String[] args) {
        Box box = new Box(5, 4, 3);
        Cube cube = new Cube(4);
        Cylinder cylinder = new Cylinder(3, 7);
        Cone cone = new Cone(3, 5);

        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());
    }
}
