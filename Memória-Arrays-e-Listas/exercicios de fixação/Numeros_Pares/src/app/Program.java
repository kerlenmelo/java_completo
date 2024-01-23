package app;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int num = input.nextInt();
        input.nextLine();

        int[] vect = new int[num];
        int numbersOfPairs = 0;
        String pairNumbers = "";

        for (int i = 0; i < num; i++) {
            System.out.printf("Enter the %dº number: ", i+1);
            int number = input.nextInt();
            input.nextLine();
            vect[i] = number;
            if (vect[i] % 2 == 0) {
                pairNumbers += vect[i] + " ";
                numbersOfPairs += 1;
            }
        }

        System.out.println("\nPAIR NUMBERS:\n" + pairNumbers + "\n");
        System.out.println("NUMBERS OF PAIRS: " + numbersOfPairs);
        
        input.close();
    }
}
