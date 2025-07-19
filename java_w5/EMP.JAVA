// Question 6: Define a class Employee to accept emp_id, emp_name, basic_salary from the user and display the gross_salary.

import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double basicSalary;
    private double grossSalary;

    void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        empName = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        basicSalary = scanner.nextDouble();
        calculateGrossSalary();
    }

    private void calculateGrossSalary() {
        // Assuming some standard allowances
        double hra = 0.15 * basicSalary; // House Rent Allowance
        double da = 0.10 * basicSalary; // Dearness Allowance
        grossSalary = basicSalary + hra + da;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

// Main class to test Employee class
public class Main_EMP {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.inputDetails();
        employee.displayDetails();
    }
}

/*
Sample Output:
Enter Employee ID: 123
Enter Employee Name: Alice Smith
Enter Basic Salary: 50000
Employee ID: 123
Employee Name: Alice Smith
Basic Salary: 50000.0
Gross Salary: 62500.0
*/
