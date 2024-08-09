import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        int cod,qtd;
        double p1,p2,p3,p4,p5,total;

        p1 = 4.00;
        p2 = 4.50;
        p3 = 5.00;
        p4 = 2.00;
        p5 = 1.50;

        Scanner sc = new Scanner(System.in);
        cod = sc.nextInt();
        qtd = sc.nextInt();

        if(cod == 1){
            total = qtd * p1;
        }
        else if(cod == 2){
            total = qtd * p2;
        }
        else if (cod == 3){
            total = qtd * p3;
        }
        else if (cod == 4){
            total = qtd * p4;
        }
        else {
            total = qtd * p5;
        }

        System.out.printf("Total: R$ %.2f", total);
        sc.close();
    }
}
