package application;

import Model.entities.Account;
import Model.exceptions.noBalanceException;
import Model.exceptions.withdrawLimitException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data:");

            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            double limit = sc.nextDouble();
            System.out.println();

            Account account = new Account(number, name, balance, limit);

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println(account);
        } catch (noBalanceException | withdrawLimitException e){
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Unexpected error");
        }


        sc.close();
    }
}