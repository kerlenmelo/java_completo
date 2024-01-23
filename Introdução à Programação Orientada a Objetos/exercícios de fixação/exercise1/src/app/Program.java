package app;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Rectangle rectangle = new Rectangle();
        
        System.out.println("Enter rectangle width and height:");
        double width = input.nextDouble();
        double height = input.nextDouble();
        input.nextLine();
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        
        System.out.println("AREA = " + String.format("%.2f", rectangle.area()));
        System.out.println("PERIMETER = " + String.format("%.2f", rectangle.perimeter()));
        System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.diagonal()));
        
        input.close();
    }
}
