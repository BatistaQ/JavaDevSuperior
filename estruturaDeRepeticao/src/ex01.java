import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while(x != 2002){
            System.out.println("Senha Inválida");
            x = sc.nextInt();
        }
        sc.close();
        System.out.println("Acesso Permitido");
    }
}
