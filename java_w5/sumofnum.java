package week5_oop;

// Question 21: Find the sum of numbers formed by consecutive digits.

import java.util.Scanner;

public class sumofnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numberStr = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < numberStr.length() - 1; i++) {
            for (int j = i + 2; j <= numberStr.length(); j++) {
                int num = Integer.parseInt(numberStr.substring(i, j));
                sum += num;
            }
        }

        System.out.println("Sum of numbers formed by consecutive digits: " + sum);
    }
}

/*
Sample Output:
Enter a number: 2415
Sum of numbers formed by consecutive digits: 80
*/
