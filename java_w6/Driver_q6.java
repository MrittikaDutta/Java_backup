package week5_oop.week_6;

//6. Create an interface Department containing attributes deptName and deptHead. It also has abstract
// methods for printing the attributes. Create a class hostel containing hostelName, hostelLocation
// and numberofRooms. The class contains methods for getting and printing the attributes. Then write
// Student class extending the Hostel class and implementing the Department interface. This class
// contains attributes studentName, regdNo, electiveSubject and avgMarks. Write suitable getData
// and printData methods for this class. Also implement the abstract methods of the Department
// interface. Write a driver class to test the Student class. The program should be menu driven
// containing the options:
// i) Admit new student
// ii) Migrate a student
// iii) Display details of a student
// For the third option a search is to be made on the basis of the entered registration number.

import java.util.ArrayList;
import java.util.Scanner;

// Department Interface
interface Department {
    String deptName = "";
    String deptHead = "";

    void printDepartmentDetails();
}

// Hostel Class
class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    void getHostelData(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    void printHostelDetails() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

// Student Class
class Student extends Hostel implements Department {
    String studentName;
    String regdNo;
    String electiveSubject;
    double avgMarks;
    String departmentName;
    String departmentHead;

    void getData(String studentName, String regdNo, String electiveSubject, double avgMarks,
                 String hostelName, String hostelLocation, int numberOfRooms,
                 String departmentName, String departmentHead) {
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
        getHostelData(hostelName, hostelLocation, numberOfRooms);
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }

    void printData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        printHostelDetails();
        printDepartmentDetails();
    }

    // Implementing the abstract method from Department interface
    public void printDepartmentDetails() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Department Head: " + departmentHead);
    }
}

// Driver Class
public class Driver_q6 {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Admit new student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display details of a student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    admitNewStudent();
                    break;
                case 2:
                    migrateStudent();
                    break;
                case 3:
                    displayStudentDetails();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to admit a new student
    private static void admitNewStudent() {
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter registration number: ");
        String regdNo = scanner.nextLine();

        System.out.print("Enter elective subject: ");
        String electiveSubject = scanner.nextLine();

        System.out.print("Enter average marks: ");
        double avgMarks = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter hostel name: ");
        String hostelName = scanner.nextLine();

        System.out.print("Enter hostel location: ");
        String hostelLocation = scanner.nextLine();

        System.out.print("Enter number of rooms: ");
        int numberOfRooms = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();

        System.out.print("Enter department head: ");
        String deptHead = scanner.nextLine();

        Student student = new Student();
        student.getData(studentName, regdNo, electiveSubject, avgMarks, hostelName, hostelLocation, numberOfRooms, deptName, deptHead);
        students.add(student);
        System.out.println("Student admitted successfully!");
    }

    // Method to migrate a student
    private static void migrateStudent() {
        System.out.print("Enter registration number of the student to migrate: ");
        String regdNo = scanner.nextLine();

        for (Student student : students) {
            if (student.regdNo.equals(regdNo)) {
                System.out.print("Enter new hostel name: ");
                student.hostelName = scanner.nextLine();

                System.out.print("Enter new hostel location: ");
                student.hostelLocation = scanner.nextLine();

                System.out.print("Enter new number of rooms: ");
                student.numberOfRooms = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.println("Student migrated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to display details of a student
    private static void displayStudentDetails() {
        System.out.print("Enter registration number: ");
        String regdNo = scanner.nextLine();

        for (Student student : students) {
            if (student.regdNo.equals(regdNo)) {
                student.printData();
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
