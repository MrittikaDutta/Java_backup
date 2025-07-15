//4. Admission to a professional course is subject to the following conditions:

// (a) marks in Mathematics >= 60 (b) marks in Physics >=50
// (c) marks in Chemistry >=40 (d) Total in all 3 subjects >=200

// (Or)
// Total in Maths & Physics>=150
// Given the marks in the 3 subjects of n (user input) students, write a program to process the
// applications to list the eligible candidates.
import java.util.Scanner;
public class proffcourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] mathMarks = new int[n];
        int[] physicsMarks = new int[n];
        int[] chemistryMarks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Mathematics: ");
            mathMarks[i] = sc.nextInt();
            System.out.print("Physics: ");
            physicsMarks[i] = sc.nextInt();
            System.out.print("Chemistry: ");
            chemistryMarks[i] = sc.nextInt();
        }
        System.out.println("\nList of eligible candidates:");
        for (int i = 0; i < n; i++) {
            int totalMarks = mathMarks[i] + physicsMarks[i] + chemistryMarks[i];
            int mathAndPhysicsTotal = mathMarks[i] + physicsMarks[i];

            if ((mathMarks[i] >= 60 && physicsMarks[i] >= 50 && chemistryMarks[i] >= 40 && totalMarks >= 200) 
                || mathAndPhysicsTotal >= 150) {
                System.out.println("Student " + (i + 1) + " is eligible.");
            } else {
                System.out.println("Student " + (i + 1) + " is not eligible.");
            }
        }
    }
}
