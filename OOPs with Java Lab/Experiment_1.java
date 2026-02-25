// Name = Aditya singh 
// Class = CSE 11
// Roll No. = 2400320100093

// WAP to print Addition of two matrices in java.

import java.util.Scanner;

public class Experiment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n, p, q;

        System.out.print("Enter the order of first matrix (rows columns): ");
        m = sc.nextInt();
        n = sc.nextInt();

        System.out.print("Enter the order of second matrix (rows columns): ");
        p = sc.nextInt();
        q = sc.nextInt();

        if (m == p && n == q) {
            int[][] a = new int[m][n];
            int[][] b = new int[p][q];
            int[][] sum = new int[m][n];

            // Taking matrix input
            System.out.println("Enter the elements of first matrix: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the elements of second matrix: ");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            // Matrix Addition logic
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }

            // Printing resultant matrix
            System.out.println("The sum of the two matrices is: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(sum[i][j] + "\t");
                }
                System.out.println();
            }
        } 
        else {
            System.out.println("Matrix addition not possible.");
        }
        
        sc.close();
    }
}
/*
    OUTPUT

    Enter the order of first matrix (rows columns): 2
    2
    Enter the order of second matrix (rows columns): 2
    2
    Enter the elements of first matrix: 
    2
    5
    6
    3
    Enter the elements of second matrix: 
    1
    8 
    9
    2
    The sum of the two matrices is: 
    3       13
    15      5
*/