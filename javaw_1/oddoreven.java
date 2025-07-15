//7. Write a Java Program to display whether a number is odd or even.
import java.util.*;
public class oddoreven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("EVEN ");
        }
        else{
            System.out.println("ODD ");
        }

    }
}
