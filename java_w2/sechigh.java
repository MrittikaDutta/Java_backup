/* Week-3 Q.15) Write a Java program to find second highest element of an array. */

import java.util.*;
public class sechigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("Array must have at least two elements.");
        } else {
            int highest = Integer.MIN_VALUE;
            int secondHighest = Integer.MIN_VALUE;

            for (int num : array) {
                if (num > highest) {
                    secondHighest = highest;
                    highest = num;
                } else if (num > secondHighest && num < highest) {
                    secondHighest = num;
                }
            }

            if (secondHighest == Integer.MIN_VALUE) {
                System.out.println("There is no second highest element.");
            } else {
                System.out.println("The second highest element is: " + secondHighest);
            }
        }
        sc.close();
    }
}