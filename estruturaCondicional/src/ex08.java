import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double total;

        if (salario <= 2000){
            total = 0.0;
        }
        else if (salario <= 3000){
            total = (salario - 2000) * 0.08;
        }
        else if (salario <= 4500){
            total = ((salario - 3000) * 0.18) +  1000 * 0.08;
        } else {
            total = ((salario - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
        }

        if(total == 0){
            System.out.println("Isento");
        } else{
            System.out.printf("R$ %.2f%n", total);
        }


        sc.close();
    }
}
