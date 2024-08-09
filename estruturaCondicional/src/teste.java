import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num <= 100) {
            System.out.println("Valor a pagar: R$ 50.00");
        } else {
            double calculo = 50;
            calculo += ((num - 100) * 2);
            System.out.printf("Valor a pagar: R$ %.2f%n", calculo);
        }
        sc.close();
    }
}
