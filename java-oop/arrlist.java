import java.util.*;


public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer>  l= new ArrayList<>();
        l.add(8);
        l.add(7);
        l.add(1,78);
        System.out.println(l);
        l.remove(1);
        System.out.println(l);

        Stack<Integer> stack = new Stack<>();

        // Operations
        stack.push(10);        // Push element
        stack.push(20);
        stack.push(30);
        System.out.println(stack); // Output: [10, 20, 30]

        System.out.println(stack.peek()); // Top element: 30
        stack.pop();           // Remove top element
        System.out.println(stack); // Output: [10, 20]

        System.out.println(stack.isEmpty());


        Queue<Integer> queue = new LinkedList<>();

        // Operations
        queue.add(10);         // Enqueue element
        queue.add(20);
        queue.add(30);
        System.out.println(queue); // Output: [10, 20, 30]

        System.out.println(queue.peek()); // Front element: 10
        queue.remove();        // Dequeue element
        System.out.println(queue); // Output: [20, 30]

        System.out.println(queue.isEmpty());
    }
}
