// Name = Aditya Singh
// Class = CSE 11
// Roll No. = 2400320100093

// Write a java program to implement user defined exception handling for negative amount entered.

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

public class Experiment_11 {
    
    // Method to deposit amount
    public static void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Negative amount entered: " + amount);
        } else {
            System.out.println("Successfully deposited: " + amount);
        }
    }

    public static void main(String[] args) {
        try {
            // Valid deposit
            deposit(500);

            // Invalid deposit (negative amount)
            deposit(-200);
        } catch (NegativeAmountException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

// OUTPUT

// Successfully deposited: 500.0
// Exception caught: Negative amount entered: -200.0