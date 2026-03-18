// Name = Aditya Singh
// Class = CSE 11
// Roll No. = 2400320100093

// Write a Java program to demonstrate the use of throw and throws keyword to handle user input validation.

import java.util.Scanner;

public class Experiment_14 {
    
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();

        try {
            checkAge(userAge);
        } catch (Exception e) {
            System.out.println("Caught an Exception: " + e.getMessage());
        }
        
        sc.close();
    }
}
/*
    OUTPUT 1
    Enter your age: 12
    Caught an Exception: Access denied - You must be at least 18 years old.

    OUTPUT 2
    Enter your age: 21
    Access granted - You are old enough!
*/ 