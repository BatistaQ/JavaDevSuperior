import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();

        int resultado = x + y;

        System.out.printf("RESULTADO: %d",resultado );

    }
}