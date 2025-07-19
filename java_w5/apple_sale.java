package week5_oop;

// Question 20: Accept apple sales for each day of the week and calculate the average sale.

import java.util.Scanner;

public class apple_sale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] sales = new float[7]; // 7 days in a week

        // Input sales for each day
        System.out.println("Enter apple sales for each day of the week:");
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            sales[i] = scanner.nextFloat();
        }

        // Calculate average
        float sum = 0;
        for (float sale : sales) {
            sum += sale;
        }
        float average = sum / sales.length;
        System.out.println("Average sale for the week: " + average);
    }
}

/*
Sample Output:
Enter apple sales for each day of the week:
Day 1: 10.5
Day 2: 12.0
Day 3: 14.5
Day 4: 13.0
Day 5: 15.5
Day 6: 11.0
Day 7: 16.0
Average sale for the week: 13.71
*/
