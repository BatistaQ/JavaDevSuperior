package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.printf("Product #%d data:%n", i);
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            if(ch == 'i'){
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                Product product = new ImportedProduct(name, price,customsFee);
                list.add(product);

            } else if (ch == 'u') {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());

                Product product = new UsedProduct(name,price, manufactureDate);
                list.add(product);
            } else{
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                Product product = new Product(name, price);
                list.add(product);
            }


        }

        System.out.println("Price Tags:");
        for(Product product : list){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}