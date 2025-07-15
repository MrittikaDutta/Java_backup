//2. Write a Java program for Fibonacci series.
import java.util.*;
public class fibo {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));

    }
}
