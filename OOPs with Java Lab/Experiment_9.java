// Name = Aditya singh
// Class = CSE 11
// Roll No. = 2400320100093

// Write a Java program to demonstrate Runtime Polymorphism (Method Overriding) by creating
// a base class Shape and derived classes Circle and Rectangle to override the area() method 
// and display the area of each shape

// Base Class
class Shape {
    void area() {
        System.out.println("Area method of Shape class");
    }
}

// Derived Class - Circle
class Circle extends Shape {
    
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    // Overriding area() method
    @Override
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Derived Class - Rectangle
class Rectangle extends Shape {

    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    // Overriding area() method
    @Override
    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main Class
public class Experiment_9 {
    public static void main(String[] args) {

        Shape s;

        s = new Circle(5);
        s.area();

        s = new Rectangle(4, 6);
        s.area();
    }
}
/*
    OUTPUT

    Area of Circle: 78.53981633974483
    Area of Rectangle: 24.0
 */