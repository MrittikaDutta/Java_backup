package week5_oop;

// Question 13: Design a class named Account with specified data fields and methods.

import java.util.Date;

class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 0; // All accounts share the same interest rate
    private Date dateCreated;

    // No-arg constructor
    Account() {
        this.id = 0;
        this.balance = 0;
        this.dateCreated = new Date();
    }

    // Constructor with id and initial balance
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    // Accessor methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Method to return monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Method to return monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to deposit amount
    public void deposit(double amount) {
        balance += amount;
    }
}

// Main class to test Account class
public class Main_acc {
    public static void main(String[] args) {
        Account.setAnnualInterestRate(0.05);

        Account acc1 = new Account(1, 1000);
        acc1.deposit(500);
        acc1.withdraw(200);
        System.out.println("Account ID: " + acc1.getId());
        System.out.println("Balance: " + acc1.getBalance());
        System.out.println("Monthly Interest: " + acc1.getMonthlyInterest());
        System.out.println("Date Created: " + acc1.getDateCreated());
    }
}

/*
Sample Output:
Account ID: 1
Balance: 1300.0
Monthly Interest: 5.416666666666667
Date Created: [current date]
*/
