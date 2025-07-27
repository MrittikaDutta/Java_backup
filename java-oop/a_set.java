import java.util.*;
public class a_set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Operations
        set.add(10);           // Add element
        set.add(20);
        set.add(30);
        set.add(20);           // Duplicate elements are ignored
        System.out.println(set); // Output: [10, 20, 30] (order may vary)

        set.remove(20);        // Remove element
        System.out.println(set); // Output: [10, 30]

        System.out.println(set.contains(10)); // Check if element exists: true
        System.out.println(set.isEmpty());
    }
}
