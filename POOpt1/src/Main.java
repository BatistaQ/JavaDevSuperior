import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA,yB,yC;
        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextFloat();
        xB = sc.nextFloat();
        xC = sc.nextFloat();
        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextFloat();
        yB = sc.nextFloat();
        yC = sc.nextFloat();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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