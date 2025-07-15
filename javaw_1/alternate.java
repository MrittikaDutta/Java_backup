/* Week-3 Q.22) Write a Java program to print every alternate number of a given array.  */

import java.util.*;
public class alternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int array[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Every alternate number in the array:");
        for (int i = 0; i < n; i += 2) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}