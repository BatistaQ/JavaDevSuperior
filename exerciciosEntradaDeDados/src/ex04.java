import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        int number, hours;
        double hSalary;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        hours = sc.nextInt();
        hSalary = sc.nextDouble();

        sc.close();

        double salary = hSalary * hours;
        System.out.printf("NUMBER: %d%n", number);
        System.out.printf("SALARY: U$ %.2f",salary);

    }
}
