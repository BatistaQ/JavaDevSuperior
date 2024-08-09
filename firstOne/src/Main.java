public class Main {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        System.out.println("Hello World!");
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n", x);

//      Concatenação

        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resultado = %.2f metros%n", x);

//      Concatenação com vários elementos
        /*
        * %f = float
        * %d = inteiro
        * %s = String(texto)
        * %n = quebra de linha */

        String nome = "Maria";
        int idade = 32;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e tem uma renda de R$ %.2f reais%n", nome,idade,renda);

//      Exercicio

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("");
        System.out.println("Product:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.printf("\nRecord: %d years old, code %d and gender: %s%n", age,code,gender);

        System.out.printf("\nMeasure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f", measure);

    }
}
