/* Week-3 Q.27) Write a class, Grader, which has an instance variable, score, an appropriate constructor
                and appropriate methods. A method, letterGrade() that returns the letter grade as O/E/A/B/C/F.
                Now write a demo class to test the Grader class by reading a score from the user, using it to
                create a Grader object after validating that the value is not negative and is not greater than 100.
                Finally, call the letterGrade() method to get and print the grade. */

//Grader.java

import java.util.Scanner;

public class GraderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the score (0-100): ");
        int score = scanner.nextInt();

        // Validate the score
        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Please enter a score between 0 and 100.");
        } else {
            // Create a Grader object and get the letter grade
            Grader grader = new Grader(score);
            char grade = grader.letterGrade();
            System.out.println("The letter grade is: " + grade);
        }

        scanner.close();
    }
}
