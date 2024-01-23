package app;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers from 1 to 10: ");
        int num = input.nextInt();
        input.nextLine();

        int[] vect = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.printf("Enter the %dº number: ", i+1);
            int n = input.nextInt();
            input.nextLine();
            if (n < 0) {
                vect[i] = n;
            }
        }

        System.out.println("NEGATIVE NUMBERS: ");
        for (int numbers : vect) {
            if (numbers < 0) {
                System.out.println(numbers);
            }
        }

        input.close();
    }
}
