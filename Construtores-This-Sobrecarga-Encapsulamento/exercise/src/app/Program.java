package app;

import java.util.Scanner;

import entities.Product;

public class Program {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter product data: ");
        
        System.out.print("Name: ");
        String name = input.nextLine();
        
        System.out.print("Price: ");
        double price = input.nextDouble();
        input.nextLine();
    
        System.out.print("Quantity in stock: ");
        int quantity = input.nextInt();
        input.nextLine();

        Product product = new Product(name, price, quantity);

        System.out.println("\nProduct data: " + product);
        
        System.out.print("Enter the number of products to be added in stock: ");
        int quantityAdded = input.nextInt();
        input.nextLine();
        product.addProducts(quantityAdded);
        System.out.println("\nUpdate data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        int quantityRemoved = input.nextInt();
        input.nextLine();
        product.removeProducts(quantityRemoved);
        System.out.println("\nUpdate data: " + product);
        
        input.close();
    }
}