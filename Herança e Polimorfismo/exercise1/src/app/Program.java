package app;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;


public class Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = input.nextInt();
        input.nextLine();

        ArrayList<Employee> employeesList = new ArrayList<>();

        for (int i = 1; i<= numberOfEmployees; i++) {
            System.out.println("Employee #" + i + " data:");
            
            System.out.print("Outsorced (y/n)? ");
            String answer = input.nextLine();

            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Hours: ");
            Integer hours = input.nextInt();
            input.nextLine();
            System.out.print("Value per hour: ");
            Double valuePerHour = input.nextDouble();
            input.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.print("Additional charge: ");
                Double additionalCharge = input.nextDouble();
                input.nextLine();
                OutsourcedEmployee outEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employeesList.add(outEmployee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employeesList.add(employee);
            }

        }

        System.out.println("\nPAYMENTS:");
        for (Employee e : employeesList) {
            System.out.println(e);
        }

        input.close();
    }
}
