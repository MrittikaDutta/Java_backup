//8. Write a Java program to find the sum of diagonal elements in a 2D array.

import java.util.Scanner;
public class sum_diagonal {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        int s=0;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
                if (i == j) {
                    s += array[i][j];
                }
            }
        }
        System.out.println("Sum of Primary Diagonal: " + s);
        
    }

    
}
