import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<1 || x >1000){
            System.out.println("Escolha um valor de 1 a 1000");
        } else{
            for(int i = 0; i <= x; i++){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
