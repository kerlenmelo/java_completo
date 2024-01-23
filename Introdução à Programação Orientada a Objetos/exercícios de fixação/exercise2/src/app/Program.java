package app;

import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        String name = input.nextLine();
        employee.setName(name);
        
        System.out.print("Gross salary: ");
        double grossSalary = input.nextDouble();
        input.nextLine();
        employee.setGrossSalary(grossSalary);
        
        System.out.print("Tax: ");
        double tax = input.nextDouble();
        input.nextLine();
        employee.setTax(tax);
        
        System.out.println();
        System.out.println(employee);

        System.out.print("Wich percentage to increase salary? ");
        double percentage = input.nextDouble();
        input.nextLine();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println(employee);

        input.close();
    }
}
