package entities;

public class Account {
    private String holder;
    private int numberAccount;
    private double accountBalance;
    
    public Account(String holder, int numberAccount, double initialDeposit) {
        this.holder = holder;
        this.numberAccount = numberAccount;
        this.deposit(initialDeposit);
    }

    public Account(String holder, int numberAccount) {
        this.holder = holder;
        this.numberAccount = numberAccount;
        this.accountBalance = 0.0;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder (String holder) {
        this.holder = holder;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void setBalance (double value) {
        this.accountBalance = value;
    }
    
    public void deposit (double moneyAmountDeposit) {
        this.setBalance(this.getBalance() + moneyAmountDeposit);
    }

    public void withdraw (double moneyAmountWithdraw) {
        this.setBalance(this.getBalance() - moneyAmountWithdraw - 5.00);
    }

    @Override
    public String toString() {
        return "Account " + this.getNumberAccount() 
            + ", Holder: " + this.getHolder() 
            + ", Balance: $ " + String.format("%.2f",this.getBalance()) 
            + "\n"
        ;
    }
    
}
