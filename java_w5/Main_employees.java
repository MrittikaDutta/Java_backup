package week5_oop;

// Question 10: Define a class 'Employee' with data members empid, name, and salary. 
// Accept data for 5 objects using an array of objects and print it.

import java.util.Scanner;

class Employee {
    private int empId;
    private String name;
    private double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.printf("Employee ID: %d, Name: %s, Salary: %.2f\n", empId, name, salary);
    }
}
public class Main_employees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            System.out.print("Enter Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();
            employees[i] = new Employee(empId, name, salary);
        }

        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.display();
        }
    }
}

/*
Sample Output:
Enter Employee ID: 101
Enter Employee Name: Alice
Enter Employee Salary: 50000

Enter Employee ID: 102
Enter Employee Name: Bob
Enter Employee Salary: 60000

Enter Employee ID: 103
Enter Employee Name: Charlie
Enter Employee Salary: 55000

Enter Employee ID: 104
Enter Employee Name: David
Enter Employee Salary: 65000

Enter Employee ID: 105
Enter Employee Name: Eve
Enter Employee Salary: 70000

Employee Details:
Employee ID: 101, Name: Alice, Salary: 50000.00
Employee ID: 102, Name: Bob, Salary: 60000.00
Employee ID: 103, Name: Charlie, Salary: 55000.00
Employee ID: 104, Name: David, Salary: 65000.00
Employee ID: 105, Name: Eve, Salary: 70000.00
*/

