package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;
import model.entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Birth date (dd/MM/yyyy): ");
        String sBirthDate = input.nextLine();
        LocalDate birthDate = LocalDate.parse(sBirthDate, dtf);
        
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(input.nextLine());
        
        Order order = new Order(LocalDate.now(), status, client);

        System.out.print("How many items to this order? ");
        Integer quantityItems = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= quantityItems; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String productName = input.nextLine();
            System.out.print("Product price: ");
            Double productPrice = input.nextDouble();
            input.nextLine();
            
            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            Integer productQuantity = input.nextInt();
            input.nextLine();
            
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);

            order.addItem(orderItem);

        }

        System.out.println("\nORDER SUMARY:");
        System.out.println(order);
        
        input.close();
    }
}
