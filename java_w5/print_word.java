package week5_oop;

// Question 12: Accept an integer from the user and pass it to a method that prints its word equivalent.

import java.util.Scanner;

public class print_word {
    static void printNumberInWord(int number) {
        switch (number) {
            case 0: System.out.println("ZERO"); break;
            case 1: System.out.println("ONE"); break;
            case 2: System.out.println("TWO"); break;
            case 3: System.out.println("THREE"); break;
            case 4: System.out.println("FOUR"); break;
            case 5: System.out.println("FIVE"); break;
            case 6: System.out.println("SIX"); break;
            case 7: System.out.println("SEVEN"); break;
            case 8: System.out.println("EIGHT"); break;
            case 9: System.out.println("NINE"); break;
            default: System.out.println("INVALID INPUT"); break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 9: ");
        int number = scanner.nextInt();
        printNumberInWord(number);
    }
}

/*
Sample Output:
Enter an integer between 0 and 9: 5
FIVE
*/

