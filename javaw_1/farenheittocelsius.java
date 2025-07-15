//4. Write a Java program to change temperature from Fahrenheit to Celsius.
import java.util.Scanner;
public class farenheittocelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature in farenheit: ");
        double fa = sc.nextDouble();
        double ce= (fa-32)*5/9;
        System.out.println("Enter a temperature in celsius:   "+ce);
    }
}
