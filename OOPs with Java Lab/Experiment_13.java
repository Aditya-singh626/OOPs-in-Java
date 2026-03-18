// Name = Aditya singh
// Class = CSE 11
// Roll No. = 2400320100093

// Write a Java program to demonstrate exception handling using multiple catch blocks and finally block.

public class Experiment_13 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            // Potential ArithmeticException
            int result = 2 / 0; 
            // Potential ArrayIndexOutOfBoundsException
            a[10] = 50; 
            System.out.println(result);
            
        } catch (ArithmeticException e) {
            System.out.println("Warning: Arithmetic Error (Division by zero).");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning: Array Index out of bounds.");
        } catch (Exception e) {
            System.out.println("Warning: Some other error occurred.");
        } finally {
            System.out.println("Finally block: This always executes.");
        }
        System.out.println("Rest of the code continues...");
    }
}
/*
    OUTPUT

    Warning: Arithmetic Error (Division by zero).
    Finally block: This always executes.
    Rest of the code continues...
*/
