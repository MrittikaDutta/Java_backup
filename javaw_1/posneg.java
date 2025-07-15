//8. Write a Java Program to check if a number is Positive or Negative.
import java.util.*;
public class posneg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the number: ");
        int m = sc.nextInt();
        System.out.println("Enter the number: ");
        int p = sc.nextInt();
        System.out.println("the maximum is: ");
        if(n>=m && n>=p){
            System.out.println(n);
        }
        else{
            if(m>n && m>p){
                System.out.println(m);
            }
            else{
                System.out.println(p);
            }
        }
    }
}
