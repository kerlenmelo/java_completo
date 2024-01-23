package app;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of heights: ");
        int n = input.nextInt();
        input.nextLine();

        double[] vect = new double[n];
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the %dº height: ",i+1);
            vect[i] = input.nextDouble();
            sum += vect[i];
        }
        
        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        
        input.close();
    }
}
