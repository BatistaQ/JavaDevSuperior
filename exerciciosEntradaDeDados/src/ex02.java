import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        double x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        sc.close();

        double area = 3.14159 * Math.pow(x,2);
        System.out.printf("A: %.4f", area);
    }
}
