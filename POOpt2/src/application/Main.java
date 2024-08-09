package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();


        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextFloat();
        x.b = sc.nextFloat();
        x.c = sc.nextFloat();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextFloat();
        y.b = sc.nextFloat();
        y.c = sc.nextFloat();


        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: Triangle X");
        }
        else{
            System.out.println("Larger area: Triangle Y");
        }


        sc.close();
    }
}