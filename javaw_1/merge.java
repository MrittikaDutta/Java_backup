/* Week-3 Q.23) Given are two one-dimensional arrays A & B, which are sorted in ascending order.
                Write a Java program to merge them into single sorted array C that contains every
                item from arrays A & B, in ascending order.  */

import java.util.*;
public class merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array A: ");
        int nA = sc.nextInt();
        int A[] = new int[nA];
        System.out.println("Enter the elements of array A (sorted in ascending order):");
        for (int i = 0; i < nA; i++) {
            A[i] = sc.nextInt();
        }
                
        System.out.print("Enter the number of elements in array B: ");
        int nB = sc.nextInt();
        int B[] = new int[nB];
        System.out.println("Enter the elements of array B (sorted in ascending order):");
                        for (int i = 0; i < nB; i++) {
                            B[i] = sc.nextInt();
                        }
                        int C[] = mergeSortedArrays(A, B);
                        System.out.println("Merged sorted array C:");
                        for (int num : C) {
                            System.out.print(num + " ");
                        }
                        sc.close();
                    }
                    public static int[] mergeSortedArrays(int[] A, int[] B) {
                        int nA = A.length;
                        int nB = B.length;
                        int C[] = new int[nA + nB];
                        int i = 0, j = 0, k = 0;
                
                        while (i < nA && j < nB) {
                            if (A[i] <= B[j]) {
                                C[k++] = A[i++];
                            } else {
                                C[k++] = B[j++];
                            }
                        }
                        while (i < nA) {
                            C[k++] = A[i++];
                        }
                
        while (j < nB) {
        C[k++] = B[j++];
        }
        return C;
    }
}