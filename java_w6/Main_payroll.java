package week5_oop.week_6;
//18. Performing Payroll Using Interface (Multiple Inheritance)
interface Payroll {
    double calculatePay();
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

class PayrollImpl implements Payroll {
    double basicPay;
    double deductions;
    double bonus;

    PayrollImpl(double basicPay, double deductions, double bonus) {
        this.basicPay = basicPay;
        this.deductions = deductions;
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return basicPay - deductions + bonus;
    }

    void displayPayroll() {
        System.out.println("Net Pay: " + calculatePay());
    }
}

class EmployeePayroll extends Employee {
    PayrollImpl payroll;

    EmployeePayroll(String name, int id, double basicPay, double deductions, double bonus) {
        super(name, id);
        payroll = new PayrollImpl(basicPay, deductions, bonus);
    }

    void displayDetails() {
        displayEmployee();
        payroll.displayPayroll();
    }
}

public class Main_payroll {
    public static void main(String[] args) {
        EmployeePayroll ep = new EmployeePayroll("David", 303, 60000, 5000, 8000);
        ep.displayDetails();
    }
}
