/*  Q.16) Write a Java program which counts the non-zero elements in an integer array.  */

import java.util.*;
public class nonzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int array[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        int countNonZero = 0;
        for (int num : array) {
            if (num != 0) {
                countNonZero++;
            }
        }
        System.out.println("The number of non-zero elements in the array is: " + countNonZero);
        sc.close();
    }
}