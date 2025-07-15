//3. Write a Java program to reverse a number.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reversedNumber = reverse(number);

        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit; 
            number /= 10;
        }

        return reversed;
    }
}
