package week5_oop.week_6;

// Q 19
interface Exam {
    double Percent_cal();
}

// Class Student
class Student {
    String name;
    int roll_no;
    double marks1;
    double marks2;

    public Student(String name, int roll_no, double marks1, double marks2) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}

// Class Result which extends Student and implements Exam
class Result extends Student implements Exam {
    double per;

    public Result(String name, int roll_no, double marks1, double marks2) {
        super(name, roll_no, marks1, marks2);
        this.per = Percent_cal();
    }

    @Override
    public double Percent_cal() {
        return (marks1 + marks2) / 2;  // Assuming percentage is calculated as average of two marks
    }

    void display() {
        show();  // Display student details
        System.out.println("Percentage: " + per + "%");
    }
}

// Driver class to test the implementation
public class TestResult {
    public static void main(String[] args) {
        // Creating an instance of Result class
        Result result = new Result("John Doe", 101, 85.5, 90.0);
        result.display();  // Displaying the result details
    }
}
