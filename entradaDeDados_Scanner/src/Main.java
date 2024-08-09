import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Captura de textos
        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

         */

        // Captura de Número Inteiros

        /*
        int x;

        x = sc.nextInt();
        System.out.println("Voce digitou o número: " + x);
        */


        // captura de números Double
        /*double x;

        x = sc.nextDouble();
        System.out.println("Voce digitou o numero: " + x);

        */

        // captura de char
        /*
        char x;

        x = sc.next().charAt(0);
        System.out.println("Voce digitou: " + x);
        */

        // Ler varios dados na mesma linha

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}