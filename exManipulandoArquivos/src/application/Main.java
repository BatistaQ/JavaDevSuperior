package application;
import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");

        String filePath = sc.nextLine();
        String line = "";
        String separador = ",";

        File sourceFile = new File(filePath);
        String sourceFolder = sourceFile.getParent();
        String newFileStr = sourceFolder + "\\out\\summary.csv";

        List<Product> productList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while((line = br.readLine()) != null){
                String[] data = line.split(separador);

                String productName = data[0];
                double price = Double.parseDouble(data[1]);
                int qtd = Integer.parseInt(data[2]);

                Product product = new Product(productName, price, qtd);
                productList.add(product);

                boolean newDir = new File(sourceFolder + "\\out").mkdir();
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFileStr))){
                    for(Product item : productList){
                        bw.write(item.getProductName() + ',' + String.format("%.2f",item.totalPrice()));
                        bw.newLine();
                    }
                }
                catch (IOException e){
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(newFileStr + " Success");
        sc.close();


    }
}