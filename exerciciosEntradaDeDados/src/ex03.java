import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        int A,B,C,D;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        sc.close();

        int diferenca = (A*B)-(C*D);

        System.out.printf("DIFERENCA: %d",diferenca);


    }
}
