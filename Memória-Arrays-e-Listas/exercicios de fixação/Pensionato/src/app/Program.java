package app;

import java.util.Scanner;

import entities.Rent;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= n; i ++) {
            System.out.printf("%nRent #%d:%n", i);
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Room: ");
            int room = input.nextInt();
            input.nextLine();
            vect[room] = new Rent(name, email);
        }
        
        System.out.println("\nBusy rooms: ");
        for (int i = 0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        input.close();
    }
}
