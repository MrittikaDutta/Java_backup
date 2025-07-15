//2. Write a Java program to add two numbers.
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = sc.nextInt();
        System.out.println("Enter a number:");
        int num2 = sc.nextInt();
        int s=num1+num2;
        System.out.println("sum is:"+s);
    }
}
