package app;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter how many numbers from 1 to 10: ");
        int num = input.nextInt();
        input.nextLine();

        double[] vect = new double[num];
        double sum = 0.0;
        for (int i = 0; i < num; i++) {
            System.out.printf("Enter the %dº number: ", i+1);
            double n = input.nextDouble();
            input.nextLine();
            vect[i] = n;
            sum += n;
        }
        double avg = sum / num;
        String str= "";
        for (int i = 0; i < vect.length; i++) {
            str += String.format("%.1f ",vect[i]);
        }

        System.out.println("Values = " + str);
        System.out.printf("SUM = %.2f%n", sum);
        System.out.printf("AVERAGE = %.2f", avg);
        input.close();
    }
}
