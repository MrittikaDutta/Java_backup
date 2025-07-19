import java.util.*;

public class listex {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(18);
        System.out.println("Element at index 1: " + l.get(1));

        // Remove an element
        l.remove(1);
        System.out.println("List after removal: " + l);

        // Check the size of the list
        System.out.println("List size: " + l.size());
    }
}
