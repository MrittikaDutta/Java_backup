package week5_oop.week_6;
//2. Write a program in Java to illustrate the use of interface in Java.
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class q2 {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}
