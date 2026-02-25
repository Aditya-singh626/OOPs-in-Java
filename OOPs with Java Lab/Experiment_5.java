// Name = Aditya singh
// Class = CSE 11
// Roll No. = 2400320100093

// Write a Java program to create a Student class, initialize student details using a parameterized constructor, 
// and display the student information using class objects and member functions.

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }
    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Experiment_5 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul", 85.5);
        Student s2 = new Student(102, "Anita", 90.0);

        System.out.println("Student 1 Details:");
        s1.display();
        System.out.println("\nStudent 2 Details:");
        s2.display();
    }
}/*
    OUTPUT

    Student 1 Details:
    Roll Number: 101
    Name: Rahul
    Marks: 85.5

    Student 2 Details:
    Roll Number: 102
    Name: Anita
    Marks: 90.0
*/