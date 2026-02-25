// Name = Aditya singh
// Class = CSE 11
// Roll No. = 2400320100093

// Write a Java program to demonstrate Single Inheritance by creating a Person class and deriving a 
// Student class from it, and display the details of the student using inherited properties and methods.

import java.util.Scanner;

// Parent Class
class Person {

    String name;
    int age;

    // Constructor of Person
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child Class
class Student extends Person {

    int rollNo;
    String course;

    // Constructor of Student
    Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}

// Main Class
public class Experiment_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        Student s = new Student(name, age, rollNo, course);

        System.out.println("\nStudent Details:");
        s.displayStudentDetails();

        sc.close();
    }
}
/*
    OUTPUT

    Enter Name: Rahul
    Enter Age: 21
    Enter Roll Number: 137
    Enter Course: B.Tech

    Student Details:
    Name: Rahul
    Age: 21
    Roll Number: 137
    Course: B.Tech
*/