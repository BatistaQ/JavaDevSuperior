import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        int horaInicial,horaFinal,duracao;
        Scanner sc = new Scanner(System.in);
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if(horaFinal > horaInicial){
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        sc.close();
    }
}
