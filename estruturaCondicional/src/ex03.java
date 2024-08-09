import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if(a%b == 0 || b%a == 0){
            System.out.println("Sao Multiplos");
        } else{
            System.out.println("Nao Sao Multiplos");
        }
        sc.close();
    }
}
