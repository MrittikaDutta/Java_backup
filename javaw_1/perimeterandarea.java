//6. Write a Java program to find area and perimeter of a circle.
import java.util.*;
public class perimeterandarea {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        r = sc.nextInt();
        double p= 2*3.14*r;
        double a= 3.14*r*r;
        System.out.println("PERIMETER: "+p);
        System.out.println("AREA: "+a);


    }
}
