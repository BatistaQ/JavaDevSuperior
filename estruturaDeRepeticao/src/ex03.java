import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,g,d,end,x;
        a = 0;
        g = 0;
        d = 0;
        end = 4;
        x = sc.nextInt();
        while (x != 4){
            if(x>4 || x < 0){
                System.out.println("Digite um número entre 1 e 4");
                x = sc.nextInt();
            }
            if(x == 1){
                a += 1;
            }
            else if (x == 2){
                g += 1;
            }
            else if (x == 3){
                d += 1;
            }
            x = sc.nextInt();
        }
        sc.close();

        System.out.println("Muito obrigado!");
        System.out.println("Alcool: " + a);
        System.out.println("Gasolina: " + g);
        System.out.println("Diesel: " + d);
    }
}
