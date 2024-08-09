package entities;

public class AccountInfo {
    private int account;
    private String nameHolder;
    private double balance;


    public AccountInfo(int account, String nameHolder, double initialDeposit) {
        this.account = account;
        this.nameHolder = nameHolder;
        deposit(initialDeposit);
    }

    public AccountInfo(int account, String nameHolder){
        this.account = account;
        this.nameHolder = nameHolder;
    }

    public int getAccount(){
        return account;
    }

    public String getNameHolder(){
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amount){
        balance -= amount + 5.0;
    }

    public String toString(){
        return "Account " + account + ", " + "Holder: " + nameHolder + ", " + "Balance: $" + String.format("%.2f", balance);
    }


}
