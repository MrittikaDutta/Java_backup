/* Q.26) Write a Java program to show constructor overloading. */

import java.util.*;
class OverloadedConstructorExample {
    private int number;
    private String text;
    public OverloadedConstructorExample() {
        this.number = 0;
        this.text = "Default";
    }
    public OverloadedConstructorExample(int number) {
        this.number = number;
        this.text = "Default";
    }
    public OverloadedConstructorExample(int number, String text) {
        this.number = number;
        this.text = text;
    }
    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }
}

public class cons3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a constructor:");
        System.out.println("1. Default Constructor");
        System.out.println("2. Constructor with one integer argument");
        System.out.println("3. Constructor with an integer and a string argument");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = sc.nextInt();

        OverloadedConstructorExample example;

        switch (choice) {
            case 1:
                example = new OverloadedConstructorExample();
                break;
            case 2:
                System.out.print("Enter an integer number: ");
                int number = sc.nextInt();
                example = new OverloadedConstructorExample(number);
                break;
            case 3:
                System.out.print("Enter an integer number: ");
                number = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter a text string: ");
                String text = sc.nextLine();
                example = new OverloadedConstructorExample(number, text);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        example.display();
        sc.close();
    }
}