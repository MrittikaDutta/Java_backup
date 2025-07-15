//3. Write a Java program to change temperature from Celsius to Fahrenheit.

import java.util.Scanner;
public class celsiustof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature in celsius: ");
        double ce = sc.nextDouble();
        double fa= (9*ce/5)+32;
        System.out.println("Enter a temperature in farenheit:   "+fa);
    }
}
