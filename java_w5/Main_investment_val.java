package week5_oop;

// Question 14: Create a test program that prints a table displaying the future value for the years from 1 to 30.

import java.util.Scanner;

public class Main_investment_val {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the investment amount: ");
        double investmentAmount = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (e.g., 9 for 9%): ");
        double annualInterestRate = scanner.nextDouble() / 100;

        System.out.println("Years  Future Value");
        for (int year = 1; year <= 30; year++) {
            double futureValue = investmentAmount * Math.pow(1 + annualInterestRate, year);
            System.out.printf("%-6d %.2f\n", year, futureValue);
        }
    }
}

/*
Sample Output:
Enter the investment amount: 1000
Enter the annual interest rate (e.g., 9 for 9%): 9
Years  Future Value
1      1093.80
2      1196.41
3      1308.16
...
29     13467.25
30     14730.57
*/

