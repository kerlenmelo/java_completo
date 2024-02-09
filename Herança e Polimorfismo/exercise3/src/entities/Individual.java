package entities;

public class Individual extends TaxPayers {

    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        
        double tax;
        
        if (this.getAnualIncome() < 20000.00 ) {
            tax = (this.getAnualIncome() * (15.0/100));
        } else  {
            tax = (this.getAnualIncome() * (25.0/100));
        } 
        tax -= this.getHealthExpenditures() * (50.0/100);
        if (tax < 0.0) {
            tax = 0.0;
        }
        return tax;
    }
}
