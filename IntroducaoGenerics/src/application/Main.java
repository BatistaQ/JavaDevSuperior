package application;

import PrintService.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Caso queira inserir textos, é só alterar Integer por String
        PrintService<Integer> ps = new PrintService<Integer>();
        System.out.print("How many values? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());
        sc.close();

    }
}