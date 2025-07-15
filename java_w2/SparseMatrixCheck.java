//13. Write a Java program to check whether a given matrix is sparse or not.
import java.util.Scanner;

public class SparseMatrixCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean isSparse = isSparseMatrix(matrix, rows, cols);
        
        if (isSparse) {
            System.out.println("The matrix is sparse.");
        } else {
            System.out.println("The matrix is not sparse.");
        }

        scanner.close();
    }

    private static boolean isSparseMatrix(int[][] matrix, int rows, int cols) {
        int zeroCount = 0;
        int totalElements = rows * cols;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        return zeroCount > totalElements / 2;
    }
}
