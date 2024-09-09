package entities;

public class IndividualPayer extends Payer {
    private Double healthExpenditures;

    public IndividualPayer(){
        super();
    }

    public IndividualPayer(String name, Double anualIncome, Double healthExpenditures) {
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
    public double taxesPaid() {
        double basicTax;
        if(getAnualIncome() < 20000){
            basicTax = getAnualIncome() * 0.15;
        } else {
            basicTax = getAnualIncome() * 0.25;
        }
        basicTax -= getHealthExpenditures() * 0.5;
        if(basicTax < 0.0){
            basicTax = 0.0;
        }
        return basicTax;

    }

}
