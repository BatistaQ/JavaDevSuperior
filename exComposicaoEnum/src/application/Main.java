package application;

import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Client Data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        sc.nextLine();

        Client client = new Client(name,email,birthDate);
        System.out.println();

        System.out.println("Enter Order Data:");
        System.out.print("Status: ");
        String orderStatus = sc.nextLine();

        Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++){
            System.out.printf("Enter #%d item data:%n", i);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity,productPrice, product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);
        sc.close();

    }
}