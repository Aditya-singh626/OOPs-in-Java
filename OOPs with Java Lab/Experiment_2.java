// Name = Aditya singh
// Class = CSE 11
// Roll No. = 2400320100093

// Write a program in java which creates the variable size array (Jagged Array) and print all the values using loop statement.

import java.util.Scanner;

public class Experiment_2 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] jaggedArray = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols];

            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value for position [" + i + "][" + j + "]: ");
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nJagged Array Elements:");

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
   
}
/*
    OUTPUT

    Enter number of rows: 2
    Enter number of columns for row 0: 1
    Enter value for position [0][0]: 5
    Enter number of columns for row 1: 3
    Enter value for position [1][0]: 4
    Enter value for position [1][1]: 8
    Enter value for position [1][2]: 9

    Jagged Array Elements:
    5 
    4 8 9 
*/