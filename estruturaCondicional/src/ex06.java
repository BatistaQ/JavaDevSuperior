import java.sql.SQLOutput;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        if(x < 0 || x > 100){
            System.out.println("Fora do Intervalo");

        }
        else if (x <= 25){
            System.out.println("Intervalo (0;25)");
        }
        else if (x <= 50){
            System.out.println("Intervalo (25;50)");
        }
        else if (x <= 75){
            System.out.println("Intervalo (50;75)");
        }
        else{
            System.out.println("Intervalo (75;100)");
        }

        sc.close();
    }
}
