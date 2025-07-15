// Q.14) Write a Java program to count the prime numbers in an array. */

import java.util.*;
public class countprime {
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

        int primeCount = 0;
        for (int num : array) {
            if (isPrime(num)) {
                primeCount++;
            }
        }
        System.out.println("The number of prime numbers in the array is: " + primeCount);
    }
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}