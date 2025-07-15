//13. Write a Java program for following grading system. Note:
// Percentage>=90% : Grade A
// Percentage>=80% : Grade B
// Percentage>=70% : Grade C
// Percentage>=60% : Grade D
// Percentage>=40% : Grade E
// Percentage<40% : Grade F
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is: " + grade);
    }
}
