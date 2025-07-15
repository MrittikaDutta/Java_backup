//14. Write a Java program to check whether a number is divisible by 5 or not.
import java.util.Scanner;
public class divbyfive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("divisible by 5");
        }
        else{
            System.out.println("not divisible by 5 ");
        }
    }
    
}
