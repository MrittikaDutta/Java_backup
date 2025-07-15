//2. Write a Java program to implement stack using array.
import java.util.Scanner;

public class StackUsingArray {
    private int maxSize;
    private int[] stackArray;
    private int top;
    public StackUsingArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + data);
        } else {
            stackArray[++top] = data;
            System.out.println(data + " pushed onto the stack.");
        }
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the size of the stack
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        StackUsingArray stack = new StackUsingArray(size);

        // Simple menu to perform stack operations
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if stack is empty");
            System.out.println("5. Check if stack is full");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped value: " + poppedValue);
                    }
                    break;
                case 3:
                    int topValue = stack.peek();
                    if (topValue != -1) {
                        System.out.println("Top value: " + topValue);
                    }
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 5:
                    if (stack.isFull()) {
                        System.out.println("Stack is full.");
                    } else {
                        System.out.println("Stack is not full.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
}
