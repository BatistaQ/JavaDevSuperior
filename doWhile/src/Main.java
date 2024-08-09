import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ask;
        do{
            System.out.println("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double formula = (9*c/5) + 32;
            System.out.printf("Fahrenheit: %.1f%n", formula);
            System.out.printf("Deseja Repetir? (s/n)%n");
            ask = sc.next().charAt(0);
        }
        while(ask == 's');
        sc.close();
    }

}