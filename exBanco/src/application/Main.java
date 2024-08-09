package application;

import java.util.Locale;
import java.util.Scanner;
import entities.AccountInfo;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AccountInfo accountInfo;

        System.out.print("Enter account number: ");
        int account = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String nameHolder = sc.nextLine();
        System.out.print("Is there an initial deposit? (y/n) ");
        char reply = sc.next().charAt(0);
        if(reply == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            accountInfo = new AccountInfo(account, nameHolder, initialDeposit);

        }else{
            accountInfo = new AccountInfo(account, nameHolder);

        }

        System.out.println();
        System.out.println("Account Data:");
        System.out.println(accountInfo);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        accountInfo.deposit(amount);
        System.out.println("Updated account data:");
        System.out.println(accountInfo);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();
        accountInfo.withDraw(amount);
        System.out.println("Updated account data:");
        System.out.println(accountInfo);

        sc.close();

    }
}