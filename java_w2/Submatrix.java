/* Week-3 Q.20) Write a Java program to subtract two matrices. */

import java.util.*;
public class Submatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        int matrixA[][] = new int[rows][cols];
        int matrixB[][] = new int[rows][cols];
        int resultMatrix[][] = new int[rows][cols];

        System.out.println("Enter elements for matrix A:");
        readMatrix(sc, matrixA, rows, cols);
        System.out.println("Enter elements for matrix B:");
        readMatrix(sc, matrixB, rows, cols);

        subtractMatrices(matrixA, matrixB, resultMatrix, rows, cols);

        System.out.println("Result of matrix subtraction:");
        printMatrix(resultMatrix, rows, cols);
        sc.close();
    }
    private static void readMatrix(Scanner sc, int matrix[][], int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    private static void subtractMatrices(int matrixA[][], int matrixB[][], int[][] resultMatrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
    }
    private static void printMatrix(int matrix[][], int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}