/* Q.18) Write a Java program where elements of two integer arrays get added index wise and get
                stored into a third array.   */

                import java.util.*;
                public class INDEXADD {
                    public static void main(String[] args) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Enter the number of elements in the arrays: ");
                        int size = scanner.nextInt();
                        int[] array1 = new int[size];
                        int[] array2 = new int[size];
                        int[] sumArray = new int[size];
                
                        System.out.println("Enter the elements of the first array:");
                        for (int i = 0; i < size; i++) {
                            System.out.print("Element " + (i + 1) + ": ");
                            array1[i] = scanner.nextInt();
                        }
                
                        System.out.println("Enter the elements of the second array:");
                        for (int i = 0; i < size; i++) {
                            System.out.print("Element " + (i + 1) + ": ");
                            array2[i] = scanner.nextInt();
                        }
                
                        for (int i = 0; i < size; i++) {
                            sumArray[i] = array1[i] + array2[i];
                        }
                
                        System.out.println("Resulting array after index-wise addition:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(sumArray[i] + " ");
                        }
                        System.out.println();
                        scanner.close();
                    }
                }