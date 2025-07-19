package week5_oop.week_6;

// Q 14
interface Gross {
    double calculateGross();
}

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

class Salary implements Gross {
    double basicPay;
    double da;
    double hra;

    Salary(double basicPay, double da, double hra) {
        this.basicPay = basicPay;
        this.da = da;
        this.hra = hra;
    }

    @Override
    public double calculateGross() {
        return basicPay + da + hra;
    }

    void displaySalary() {
        System.out.println("Gross Salary: " + calculateGross());
    }
}

class GrossSalary extends Employee {
    Salary salary;

    GrossSalary(String name, int id, double basicPay, double da, double hra) {
        super(name, id);
        salary = new Salary(basicPay, da, hra);
    }

    void displayDetails() {
        displayEmployee();
        salary.displaySalary();
    }
}

public class Main_multiple_inheritance {
    public static void main(String[] args) {
        GrossSalary gs = new GrossSalary("John Doe", 101, 50000, 10000, 5000);
        gs.displayDetails();
    }
}
