package app;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Employee;

public class Program {
    static Scanner input = new Scanner(System.in);
    
    public static int menu() {
        System.out.println("\n--------  MENU  --------");
        System.out.println("1. Register new Employee");
        System.out.println("2. Salary increase");
        System.out.println("3. List of Employees");
        System.out.println("4. Exit the program");
        System.out.print("Choose an option: ");
        int choice = input.nextInt();
        input.nextLine();
        return choice;
    }
    
    public static void main(String[] args) {
    
        ArrayList<Employee> listEmployees = new ArrayList<>();
        Integer idCount = 0;
        
        while (true) {
            switch (menu()) {
                case 1:{
                    idCount ++;
                    System.out.println("\n--- Register new Employee ---");
                    System.out.print("Enter the name: ");
                    String name = input.nextLine();
                    System.out.print("Enter the salary: ");
                    Double salary = input.nextDouble();
                    input.nextLine();
                    Employee newEmployee = new Employee(name, idCount, salary);
                    System.out.println("\nNew employee successfully registered!");
                    listEmployees.add(newEmployee);
                    break;
                }
                case 2: {
                    System.out.println("\n--- Salary Increase ---");
                    System.out.print("Enter employee ID: ");
                    Integer idSearch = input.nextInt();
                    input.nextLine();
                    for (Employee empS : listEmployees) {
                        if (idSearch == empS.getId()) {
                            System.out.println(empS);
                            System.out.print("Enter the percentage %: ");
                            Double percentageIncrease = input.nextDouble();
                            input.nextLine();
                            empS.increaseSalary(percentageIncrease);
                            System.out.println("The salary was increased successfully!"
                                + "\nThe new salary is $ " + String.format("%.2f",empS.getSalary()));
                            break;
                        } else {
                            System.out.println("\nID not found");
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    for(Employee employees : listEmployees) {
                        System.out.println(employees);
                    }
                    break;
                }
                default:{
                    return;
                }
            }
        }
    }
}
