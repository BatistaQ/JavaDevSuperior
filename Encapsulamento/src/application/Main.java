package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.println("Name: ");
        //Joga o dado inserido pelo usuário
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
//        System.out.println("Quantity in Stock: ");
//        int quantity = sc.nextInt();

        Product product = new Product(name,price);

//        product.setName("Computer");
//        System.out.println("Updated name: " + product.getName());
//
//        product.setPrice(990.00);
//        System.out.println("Updated price: " + product.getPrice());



        System.out.println("Product Data: " + product);
        System.out.println();


        // Adicionar produtos no estoque
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated Data: " + product);
        System.out.println();

        //Remover produtos no estoque
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Updated Data: " + product);
        sc.close();
    }
}
