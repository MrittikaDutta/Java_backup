//8. Write a Java program to generate multiplication table.
import java.util.*;
public class multiplicationtable {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Enter a multiples");
        int m=sc.nextInt();
        for(i=0;i<=m;i++){
            System.out.println(n+" * "+i+" = "+n*i);

        }

    }
}
