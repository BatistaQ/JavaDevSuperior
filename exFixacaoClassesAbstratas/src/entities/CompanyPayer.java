package entities;

public class CompanyPayer extends Payer{

    private Integer employees;

    public CompanyPayer(){
        super();
    }

    public CompanyPayer(String name, Double anualIncome, Integer employees) {
        super(name, anualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public double taxesPaid() {
        double tax = 0;
        if(employees <= 10){
            tax = 0.16;
        } else {
            tax = 0.14;
        }

        return getAnualIncome() * tax;

    }

}
