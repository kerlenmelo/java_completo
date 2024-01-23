package app;

import java.util.Scanner;

import entities.Account;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bank");
        
        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();
        input.nextLine();

        System.out.print("Enter account holder: ");
        String holderName = input.nextLine();
        
        Account newAccount;
        
        System.out.print("Is there a initial deposit (y/n)? ");
        String choice = input.nextLine();
        
        if (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = input.nextDouble();
            input.nextLine();
            newAccount = new Account(holderName, accountNumber, initialDeposit);
        } else {
            newAccount = new Account(holderName, accountNumber);
        }

        System.out.println("Account data:");
        System.out.println(newAccount);
        
        System.out.println("Deposit");    
        System.out.print("Enter a deposit value: ");
        double moneyAmountDeposit = input.nextDouble();
        input.nextLine();
        newAccount.deposit(moneyAmountDeposit);
        System.out.println("Updated account data: ");
        System.out.println(newAccount);

        System.out.println("Withdraw");
        System.out.print("Enter a withdraw value: ");
        double moneyAmountWithdraw = input.nextDouble();
        input.nextLine();
        newAccount.withdraw(moneyAmountWithdraw);
        System.out.println("Updated account data: ");
        System.out.println(newAccount);
        input.close();
    }
}
