/* Week-3 Q.21) Write a Java program to find duplicate elements in a 1D array and find their frequency of occurrence. */

import java.util.*;
public class dupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int array[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        findDuplicates(array);
        sc.close();
    }
    private static void findDuplicates(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Duplicate elements and their frequencies:");
        boolean hasDuplicates = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element: " + entry.getKey() + " - Frequency: " + entry.getValue());
                hasDuplicates = true;
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicate elements found.");
        }
    }
}