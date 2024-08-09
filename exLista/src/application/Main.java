package application;
import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            System.out.printf("Employee #%d%n", i+1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while(hasId(list,id)){
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);

        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();
        Integer pos = idPosition(list,idIncrease);
        if(pos == null){
            System.out.println("This ID does not exist!");
        }else{
            System.out.print("Enter the percentage: ");
            double percent= sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee emp : list){
            System.out.println(emp);
        }

        sc.close();

    }

    public static Integer idPosition(List<Employee> list, int id){
        for(int i =0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}