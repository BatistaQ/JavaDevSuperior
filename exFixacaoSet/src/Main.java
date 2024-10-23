import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> A = new TreeSet<>();
        Set<Integer> B = new TreeSet<>();
        Set<Integer> C = new TreeSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();

        for (int i = 0; i<n;i++){
            int num = sc.nextInt();
            A.add(num);
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();

        for (int i = 0; i<n; i++){
            int num = sc.nextInt();
            B.add(num);
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();

        for (int i = 0; i<n;i++){
            int num = sc.nextInt();
            C.add(num);
        }

        Set<Integer> total = new TreeSet<>(A);
        total.addAll(B);
        total.addAll(C);
        System.out.println();

        System.out.println(total.size());

        sc.close();
    }
}