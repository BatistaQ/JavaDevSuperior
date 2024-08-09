package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double dollarBought = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n",CurrencyConverter.Calculator(dollarPrice, dollarBought));

        sc.close();

    }
}