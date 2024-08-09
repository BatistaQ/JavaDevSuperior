import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //criar matriz cada '[]' cria uma dimensão na matriz, no caso ela é bidimensional
        int [][] mat = new int[n][n];

        // um for lê as linhas e o outro lê as colunas
         for(int i = 0; i<mat.length; i++){
            for (int j = 0; j<mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

         //imprimir diagonal da matriz
        System.out.println("Main diagonal:");
         for (int i = 0; i<mat.length; i++){
             System.out.print(mat[i][i] + " ");
         }
        System.out.println();
         //contar numeros negativos

        int count = 0;
         for(int i = 0; i<mat.length;i++){
             for (int j=0; j<n; j++){
                 if (mat[i][j] < 0){
                     count++;
                 }
             }
         }
        System.out.println("Negative numbers: " + count);


        sc.close();
    }
}