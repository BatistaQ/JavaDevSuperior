import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int c= sc.nextInt();

        int[][] mat = new int[l][c];

        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j<mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int numPosition = sc.nextInt();

        //Ler as linhas e colunas
        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j<mat[i].length; j++){
                //Verificar se existe algum número igual ao digitado em alguma posição da matriz.
                //Caso exista, mostrar linha e coluna.
                if (mat[i][j] == numPosition){
                    System.out.printf("Position %d,%d:%n",i,j);

                    //Verificar os números ao redor do valor digitado pelo usuário
                    if(j - 1 >= 0){
                        System.out.printf("Left: %d%n",  mat[i][j-1]);
                    }
                    if(j + 1 < mat[i].length){
                        System.out.printf("Right: %d%n",  mat[i][j+1]);
                    }
                    if (i - 1>=0){
                        System.out.printf("Up: %d%n", mat[i-1][j]);
                    }
                    if (i + 1 < mat.length){
                        System.out.printf("Down: %d%n", mat[i+1][j]);
                    }

                }
            }
        }
        sc.close();
    }
}