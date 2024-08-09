import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qtd1, qtd2;
        double preco1, preco2, total;

        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = preco1 * qtd1 + preco2 * qtd2;

        System.out.printf("TATAL PORRA: %.2f", total);
        sc.close();
    }
}
