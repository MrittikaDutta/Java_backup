/* Week-3 Q.17) Write a Java program to merge two float arrays.  */

import java.util.*;
public class floatarr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the first float array: ");
        int size1 = scanner.nextInt();
        float[] array1 = new float[size1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextFloat();
        }

        System.out.print("Enter the number of elements in the second float array: ");
        int size2 = scanner.nextInt();
        float[] array2 = new float[size2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextFloat();
        }

        float[] mergedArray = new float[size1 + size2];
        int index = 0;

        for (int i = 0; i < size1; i++) {
            mergedArray[index++] = array1[i];
        }

        for (int i = 0; i < size2; i++) {
            mergedArray[index++] = array2[i];
        }

        System.out.println("Merged array:");
        for (float num : mergedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}