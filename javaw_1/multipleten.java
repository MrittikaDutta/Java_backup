//7. Write a Java program to print all multiple of 10 between a given interval.
import java.util.*;

public class multipleten {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter lower bound:");
        int n1=sc.nextInt();
        System.out.println("enter upper bound:");
        int n2=sc.nextInt();
        int i=n1+1;
        while(i>n1 && i<n2){
            if(i%10==0){
                System.out.println(i);
                i=i+10;
            }
            else{
                i++;
            }
        }

    }
}
