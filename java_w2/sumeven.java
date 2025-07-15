//7. Write a Java program to find the sum of even numbers in an integer array.

import java.util.Scanner;

public class sumeven {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int s=0;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(array[i]%2==0){
                s=s+array[i];

            }
        }
        System.out.println("SUM:    "+s);
    }
}
