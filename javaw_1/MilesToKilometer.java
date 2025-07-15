//11. Write a Java program to convert miles to kilometers.
import java.util.*;
public class MilesToKilometer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double MILES_TO_KILOMETERS = 1.60934;

        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();
        double kilometers = miles * MILES_TO_KILOMETERS;
        System.out.printf("Distance in kilometers: %.2f%n", kilometers);
    }
}
