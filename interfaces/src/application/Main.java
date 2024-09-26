package application;

import Model.entities.CarRental;
import Model.entities.Vehicle;
import Model.services.BrazilTaxServices;
import Model.services.RentalService;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental carRental = new CarRental(start,finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxServices());

        rentalService.processInvoice(carRental);
        System.out.println("Fatura:");
        System.out.println("Pagamento basico: $" + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Imposto: $" + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Pagamento Total: $" + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        sc.close();
    }
}