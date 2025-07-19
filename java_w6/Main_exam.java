package week5_oop.week_6;
// q 16 
interface Exam {
    void takeExam();
}

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}

class Result implements Exam {
    int marks;

    Result(int marks) {
        this.marks = marks;
    }

    @Override
    public void takeExam() {
        System.out.println("Exam taken. Marks obtained: " + marks);
    }

    void displayResult() {
        System.out.println("Result: " + marks + " marks");
    }
}

class ExamResult extends Student {
    Result result;

    ExamResult(String name, int rollNo, int marks) {
        super(name, rollNo);
        result = new Result(marks);
    }

    void displayDetails() {
        displayStudent();
        result.takeExam();
        result.displayResult();
    }
}

public class Main_exam {
    public static void main(String[] args) {
        ExamResult er = new ExamResult("Alice", 202, 85);
        er.displayDetails();
    }
}
