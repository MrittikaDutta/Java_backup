package week5_oop;

// Question 17: Read ten integers and display them in reverse order.

import java.util.Scanner;

public class Main_10integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Read ten integers
        System.out.println("Enter ten integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Display in reverse order
        System.out.println("Numbers in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}

/*
Sample Output:
Enter ten integers:
1 2 3 4 5 6 7 8 9 10
Numbers in reverse order:
10
9
8
7
6
5
4
3
2
1
*/
