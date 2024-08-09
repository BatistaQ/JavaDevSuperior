import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,B,C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double aTrianRetan, aCir, aTrape, aQua, aRet;

        aTrianRetan = (A * C)/2;
        aCir = 3.14159 * Math.pow(C,2);
        aTrape = (A + B) * C / 2;
        aQua = Math.pow(B,2);
        aRet = A * B;

        System.out.printf("TRIANGULO: %.3f%n", aTrianRetan);
        System.out.printf("CIRCULO: %.3f%n", aCir);
        System.out.printf("TRAPEZIO: %.3f%n", aTrape);
        System.out.printf("QUADRADO: %.3f%n", aQua);
        System.out.printf("RETANGULO: %.3f%n", aRet);

        sc.close();
    }
}
