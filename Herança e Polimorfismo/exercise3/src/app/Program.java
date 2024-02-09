package app;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayers;

public class Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        ArrayList<TaxPayers> payersList = new ArrayList<>();

        System.out.print("Enter te number of tax payers: ");
        int numberPayers = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= numberPayers; i++) {
            System.out.println("Tax payers #" + i + " data: ");
            
            System.out.print("Individual or Company (i/c)? ");
            String answer = input.nextLine();

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Anual income: ");
            Double anualIncome = input.nextDouble();
            input.nextLine();

            if (answer.equalsIgnoreCase("i")) {
                System.out.print("Health expenditures: ");
                Double healthExpenditure = input.nextDouble();
                input.nextLine();
                
                Individual individual = new Individual(name, anualIncome, healthExpenditure);
                payersList.add(individual);
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = input.nextInt();
                input.nextLine();

                Company company = new Company(name, anualIncome, numberOfEmployees);
                payersList.add(company);
            }
        }

        System.out.println("\nTAXES PAID:");
        for (TaxPayers t : payersList) {
            System.out.println(t.getName() + ": $ " + String.format("%.2f", t.tax()));
        }

        Double sum = 0.0;
        for (TaxPayers tp : payersList) {
            sum += tp.tax();
            
        }
        System.out.printf("\nTOTAL TAXES: $ %.2f", sum);
        input.close();
    }
}
