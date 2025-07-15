/* Week-3 Q.25) Write a Java program to show parameterized constructor. */

import java.util.*;
class ParameterizedConstructorExample {
    private int number;
    private String text;
    public ParameterizedConstructorExample(int number, String text) {
        this.number = number;
        this.text = text;
    }
    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }
}

public class para {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Enter a text string: ");
        String text = scanner.nextLine();

        ParameterizedConstructorExample example = new ParameterizedConstructorExample(number, text);
        example.display();
        scanner.close();
    }
}