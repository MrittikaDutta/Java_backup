/* Week-3 Q.24) Write a Java program to show 0-arguments constructor. */

import java.util.*;
class DefaultConstructorExample {
    private int number;
    private String text;
    public DefaultConstructorExample() {
        this.number = 0;
        this.text = "Default";
    }
    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }
}
public class cons {
    public static void main(String[] args) {
        DefaultConstructorExample example = new DefaultConstructorExample();
        example.display();
    }
}