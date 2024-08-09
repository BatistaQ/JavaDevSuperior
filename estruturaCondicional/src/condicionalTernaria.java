import java.util.Scanner;

public class condicionalTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco = sc.nextDouble();
        double desconto = (preco < 20.00)? preco * 0.1: preco * 0.05;

        preco -= desconto;
        System.out.printf("Valor a pagar: R$ %.2f%n ", preco);
        sc.close();
    }
}
