/* Week-3 Q.19) Write a Java program to multiply two matrices.   */

import java.util.*;
public class MUL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for  A:");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();

        int matrixA[][] = new int[rowsA][colsA];
        System.out.println("Enter the elements of Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns for  B:");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. " +
                    "Number of columns in Matrix A must equal number of rows in Matrix B.");
            return;
        }

        int matrixB[][] = new int[rowsB][colsB];
        System.out.println("Enter the elements of Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        int result[][] = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
