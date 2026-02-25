// Name = Aditya singh
// Class = CSE 11
// Roll No. = 2400320100093

// Write a Java program to justify that Java does not support multiple inheritance using classes, but multiple 
// inheritance can be achieved using interfaces by implementing more than one interface in a single class.


// Multiple Inheritance Using Classes (Not Supported)

class A {
    void show() {
        System.out.println("Class A");
    }
}

class B {
    void show() {
        System.out.println("Class B");
    }
}

// // This will cause ERROR
// class C extends A, B {   //  Not Allowed
// }


// Multiple Inheritance Using Interfaces (Supported)

// First Interface
interface Father {
    void showFather();
}

// Second Interface
interface Mother {
    void showMother();
}

// Class implementing multiple interfaces
class Child implements Father, Mother {

    public void showFather() {
        System.out.println("This is Father's method.");
    }

    public void showMother() {
        System.out.println("This is Mother's method.");
    }

    void display() {
        System.out.println("Child inherits from both interfaces.");
    }
}

// Main Class
public class Experiment_10 {
    public static void main(String[] args) {

        Child c = new Child();

        c.showFather();
        c.showMother();
        c.display();
    }
}
/*
    OUTPUT

    This is Father's method.
    This is Mother's method.
    Child inherits from both interfaces.
 */