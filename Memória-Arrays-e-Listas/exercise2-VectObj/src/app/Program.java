package app;

import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the quantity of products: ");
        int n = input.nextInt();
        input.nextLine();
        
        Product[] vect = new Product[n];
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.printf("%dº Product:\n",i+1);
            System.out.print("Enter the name: ");
            String name = input.nextLine();
            System.out.print("Enter the price: $ ");
            double price = input.nextDouble();
            input.nextLine();
            vect[i] = new Product(name, price);
            sum += vect[i].getPrice();
        }
        
        double avg = sum / n;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        input.close();
    }
}
