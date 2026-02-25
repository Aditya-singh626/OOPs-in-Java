// Name = Aditya singh
// Class = CSE 11
// Roll No. = 2400320100093

// WAP that takes input from user through command line argument and then prints whether a number is prime or not.

import java.util.Scanner;

public class Experiment_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a Prime number.");
            sc.close();
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is not a Prime number.");

        sc.close();
    }
}

    // OUTPUT

    // Enter a number: 5
    // 5 is a Prime number.
