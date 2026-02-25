// Name = Aditya singh
// Class = CSE 11
// Roll No. = 2400320100093

// Write a Java program to demonstrate Compile-time Polymorphism (Method Overloading)
// by creating a class Calculator that performs addition of integers, floating values,
// and three numbers using overloaded methods.

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Experiment_7 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int sum1 = calc.add(10, 20);
        double sum2 = calc.add(5.5, 4.5);
        int sum3 = calc.add(10, 20, 30);

        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of two floating numbers: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
    }
}

    // OUTPUT

    // Sum of two integers: 30
    // Sum of two floating numbers: 10.0
    // Sum of three integers: 60