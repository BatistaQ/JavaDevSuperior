import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            int prim = i;
            int quadrado = i*i;
            int cubo = i*i*i;

            System.out.printf("%d %d %d%n",prim,quadrado,cubo);
        }


        sc.close();
    }
}
