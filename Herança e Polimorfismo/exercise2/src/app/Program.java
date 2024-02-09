package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int numberOfProducts = input.nextInt();
        input.nextLine();

        ArrayList<Product> productsList = new ArrayList<>();

        for (int i = 1; i<=numberOfProducts; i++) {
            System.out.println("Product #" + i + " data:");
            
            System.out.print("Common, used or imported (c/u/i)? ");
            String answer = input.nextLine();

            System.out.print("Name: ");
            String productName = input.nextLine();
            System.out.print("Price: ");
            Double productPrice = input.nextDouble();
            input.nextLine();

            if (answer.equalsIgnoreCase("u")) {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dataString = input.nextLine();
                LocalDate manufactureDate = LocalDate.parse(dataString, dtf);
                UsedProduct usedProduct = new UsedProduct(productName, productPrice, manufactureDate);
                productsList.add(usedProduct);
            } else if (answer.equalsIgnoreCase("i")) {
                System.out.print("Customs fee: ");
                Double customsFee = input.nextDouble();
                input.nextLine();
                ImportedProduct importedProduct = new ImportedProduct(productName, productPrice, customsFee);
                productsList.add(importedProduct);
            } else {
                Product product = new Product(productName, productPrice);
                productsList.add(product);
            }
        }

        System.out.println("\nPRICE TAGS: ");
        for (Product p : productsList) {
            System.out.println(p.priceTag());
        }
        input.close();
    }
}
