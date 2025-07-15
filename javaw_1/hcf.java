//9. Write a Java program to find HCF of two Numbers.
import java.util.*;
public class hcf {
    public static void main(String[] args) {
        int i,h=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        System.out.println("enter a number");
        int m= sc.nextInt();
        for (i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                h = i;
            }
        }
        System.out.println("HCF is:"+h);

    }
}
