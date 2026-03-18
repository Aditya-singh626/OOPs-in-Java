// Name = Aditya singh
// Class = CSE 11
// Roll No. = 2400320100093

// Write a Java program which creates two threads, “Even” thread and “Odd” thread and prints 
// even numbers using Even Thread after every 2 seconds and odd numbers using Odd Thread 
// after every 5 seconds.

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            try {
                System.out.println("Even Thread: " + i);
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            try {
                System.out.println("Odd Thread: " + i);
                Thread.sleep(5000); // 5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Experiment_12 {
    public static void main(String[] args) {
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();
        
        t1.start();
        t2.start();
    }
}
/*  
    OUTPUT
    Odd Thread: 1
    Even Thread: 2
    Even Thread: 4
    Even Thread: 6
    Odd Thread: 3
    Even Thread: 8
    Even Thread: 10
    Odd Thread: 5
    Odd Thread: 7
    Odd Thread: 9
*/