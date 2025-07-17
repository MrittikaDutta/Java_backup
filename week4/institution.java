package week4_oop;
//7. Java Program for Educational Institution Employee Database
class Staff {
    int code;
    String name;

    Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }

    void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }
}

class Teacher extends Staff {
    String subject;
    String publication;

    Teacher(int code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}

class Officer extends Staff {
    String grade;

    Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Grade: " + grade);
    }
}

class Typist extends Staff {
    int speed;

    Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Speed: " + speed + " words per minute");
    }
}

class RegularTypist extends Typist {
    double remuneration;

    RegularTypist(int code, String name, int speed, double remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Remuneration: $" + remuneration);
    }
}

class CasualTypist extends Typist {
    double dailyWages;

    CasualTypist(int code, String name, int speed, double dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Daily Wages: $" + dailyWages);
    }
}

// Main class to test the classes
public class institution {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(101, "Alice", "Mathematics", "Pearson");
        Officer officer = new Officer(102, "Bob", "A");
        RegularTypist regularTypist = new RegularTypist(103, "Charlie", 75, 2000.0);
        CasualTypist casualTypist = new CasualTypist(104, "David", 60, 50.0);

        System.out.println("Teacher:");
        teacher.display();

        System.out.println("\nOfficer:");
        officer.display();

        System.out.println("\nRegular Typist:");
        regularTypist.display();

        System.out.println("\nCasual Typist:");
        casualTypist.display();
    }
}

