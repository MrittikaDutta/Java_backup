//11.

import java.util.Scanner;
public class oddsum {
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
                if (array[i][j]%2!=0) {
                    s += array[i][j];
                }
            }
        }
        System.out.println("Sum of odd elements: " + s);
        
    }

    
}
