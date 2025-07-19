package week5_oop;

// Question 16: Read ten numbers, compute their average, and find out how many are above the average.

import java.util.Scanner;

public class Main_10num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double sum = 0;

        // Read ten numbers
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        // Calculate average
        double average = sum / numbers.length;
        System.out.println("Average: " + average);

        // Count numbers above average
        int countAboveAverage = 0;
        for (double number : numbers) {
            if (number > average) {
                countAboveAverage++;
            }
        }

        System.out.println("Number of values above average: " + countAboveAverage);
    }
}

/*
Sample Output:
Enter ten numbers:
10 20 30 40 50 60 70 80 90 100
Average: 55.0
Number of values above average: 5
*/
