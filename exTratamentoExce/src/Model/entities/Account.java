package Model.entities;

import Model.exceptions.noBalanceException;
import Model.exceptions.withdrawLimitException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }


    public String getHolder() {
        return holder;
    }


    public Double getBalance() {
        return balance;
    }


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }


    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount) throws noBalanceException, withdrawLimitException{
        if(amount > withdrawLimit){
            throw new withdrawLimitException("The amount exceeds withdraw limit");
        }
        if(amount > balance){
            throw new noBalanceException("Insufficient balance");
        }
        balance -= amount;
    }

    @Override

    public String toString(){
        return "Account Number: " + number
                + ", Holder: " + holder
                + ", Balance: $" + String.format("%.2f", getBalance());
    }
}
