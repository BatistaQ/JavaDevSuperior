package application;

import entities.CompanyPayer;
import entities.IndividualPayer;
import entities.Payer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Payer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <=n; i++){
            System.out.printf("Tax payer #%d date:%n", i);
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            double anualIncome = sc.nextDouble();

            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new IndividualPayer(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new CompanyPayer(name, anualIncome, employees));
            }
        }
        System.out.println();
        System.out.println("Taxes Paid:");

        for (Payer payer : list){
            System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.taxesPaid()));
        }
        System.out.println();

        double sum = 0;
        for(Payer payers : list){
            sum += payers.taxesPaid();
        }

        System.out.println("TOTAL TAXES: $ " + String.format("%.2f",sum));
        sc.close();
    }
}