// Name = Aditya singh
// Class = CSE 11
// Roll No. = 2400320100093

// Write a Java program to create a BankAccount class using encapsulation 
// (private data members) and perform operations such as deposit, withdraw, 
// and display balance using menu-driven choices.

import java.util.Scanner;

class BankAccount {

    // Private data members (Encapsulation)
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(int accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Display balance method
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class Experiment_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, name, initialBalance);

        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the banking system.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
/*
    OUTPUT
    Enter Account Number: 2003547813
    Enter Account Holder Name: Aditya Singh
    Enter Initial Balance: 10,00,00,000$

    ----- MENU -----
    1. Deposit
    2. Withdraw
    3. Display Balance
    4. Exit
    Enter your choice: 1
    Enter amount to deposit: 500
    Amount deposited successfully.

    ----- MENU -----
    1. Deposit
    2. Withdraw
    3. Display Balance
    4. Exit
    Enter your choice: 2
    Enter amount to withdraw: 1000
    Amount withdrawn successfully.

    ----- MENU -----
    1. Deposit
    2. Withdraw
    3. Display Balance
    4. Exit
    Enter your choice: 3
    Account Number: 2003547813
    Account Holder: Akshat Rastogi
    Current Balance: 500.0

    ----- MENU -----
    1. Deposit
    2. Withdraw
    3. Display Balance
    4. Exit
    Enter your choice: 4
    Thank you for using the banking system.
 */