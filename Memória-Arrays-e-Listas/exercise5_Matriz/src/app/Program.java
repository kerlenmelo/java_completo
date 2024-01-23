package app;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the matrix: ");
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter a number: ");
        int x = input.nextInt();

        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Position " + i+","+j +":");
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: "+ matrix[i-1][j]);
                    }
                    if (j < matrix[i].length-1) {
                        System.out.println("Right: " + matrix[i][j+1]);
                    }
                    if (i < matrix.length-1) {
                        System.out.println("Down: " + matrix[i+1][j]);
                    }
                }
            }
        }

        input.close();
    }
}
