package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        Department department = new Department(input.nextLine());
        
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = input.nextLine();
        System.out.print("Level: ");
        String workerLevel = input.nextLine();
        System.out.print("Base salary: ");
        Double workerSalary = input.nextDouble();
        input.nextLine();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, department);

        System.out.print("How many contracts to this worker? ");
        int quantity = input.nextInt();
        input.nextLine();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        for (int i = 0; i < quantity; i++) {
            System.out.printf("Enter contract #%d data: ", i+1);
            
            System.out.print("Date (DD/MM/YYYY): ");
            String date = input.nextLine();
            LocalDate contractDate = LocalDate.parse(date, fmt1);

            System.out.print("Value per hour: ");
            Double valuePerH = input.nextDouble();
            input.nextLine();

            System.out.print("Duration (hours): ");
            Integer duration = input.nextInt();
            input.nextLine();

            HourContract hContract = new HourContract(contractDate, valuePerH, duration);
            worker.addContract(hContract);
        }
        
        System.out.print("\nEnter month and the year to calculate income (MM/YYYY): ");
        String monthAndYear = input.nextLine();
        String inputDate = String.format("%s","01/"+ monthAndYear);
        LocalDate incomDate = LocalDate.parse(inputDate, fmt1); 

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(incomDate.getYear(), incomDate.getMonthValue())));
        input.close();
    }
}
