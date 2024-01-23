package app;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.println("Main diagonal: ");
        for(int i = 0; i<n; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        int count = 0;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(matriz[i][j] < 0) {
                    count ++;
                }
            }
        }
        System.out.println("\nNegative numbers = " + count);

        input.close();
    }
}
