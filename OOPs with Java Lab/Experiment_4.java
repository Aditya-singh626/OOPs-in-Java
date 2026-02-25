// Name = Aditya singh
// Class = CSE 11
// Roll No. = 2400320100093

// Write a program to enter number through command line and check whether it is palindrome or not.

import java.util.Scanner;

public class Experiment_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num; 
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;  
            reverse = reverse * 10 + digit;  
            num = num / 10;        
        }

        if (original == reverse)
            System.out.println(original + " is a Palindrome number.");
        else
            System.out.println(original + " is not a Palindrome number.");

        sc.close();
    }
}

    // OUTPUT

    // Enter a number: 12321
    // 12321 is a Palindrome number.