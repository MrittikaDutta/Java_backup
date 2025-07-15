/*28. Write a class, Commission, which has an instance variable, sales; an appropriate constructor;
and a method, commission() that returns the commission.
Now write a demo class to test the Commission class by reading a sale from the user, using
it to create a Commission object after validating that the value is not negative. Finally, call
the commission() method to get and print the commission. If the sales are negative, your
demo should print the message “Invalid Input”.*/

import java.util.Scanner;

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sales amount: ");
        double sales = scanner.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commissionObj = new Commission(sal
            double commission = commissionObj.commission();
            System.out.println("The commission is: $" + commission);
        }

        scanner.close();
    }
}
