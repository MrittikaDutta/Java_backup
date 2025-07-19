package week5_oop;

// Question 5: Define a class Student with four data members: name, roll no., sub1, and sub2.
// Define methods to initialize and display the values, and also calculate total marks and percentage.

class Student {
    private String name;
    private int rollNo;
    private int sub1;
    private int sub2;

    Student(String name, int rollNo, int sub1, int sub2) {
        this.name = name;
        this.rollNo = rollNo;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    void displayDetails() {
        int totalMarks = sub1 + sub2;
        double percentage = (totalMarks / 200.0) * 100;

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}

// Main class to test Student class
public class Main_stu {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 101, 85, 90);
        student.displayDetails();
    }
}
// Question 5: Define a class Student with four data members: name, roll no., sub1, and sub2.
// Define methods to initialize and display the values, and also calculate total marks and percentage.

class Student {
    private String name;
    private int rollNo;
    private int sub1;
    private int sub2;

    Student(String name, int rollNo, int sub1, int sub2) {
        this.name = name;
        this.rollNo = rollNo;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    void displayDetails() {
        int totalMarks = sub1 + sub2;
        double percentage = (totalMarks / 200.0) * 100;

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}

// Main class to test Student class
public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 101, 85, 90);
        student.displayDetails();
    }
}
// Name: John Doe
// Roll No: 101
// Subject 1 Marks: 85
// Subject 2 Marks: 90
// Total Marks: 175
// Percentage: 87.5%
