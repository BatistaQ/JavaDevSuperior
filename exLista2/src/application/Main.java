package application;
import entities.Employee;

import java.sql.Array;
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
        System.out.println();

        for (int i = 0; i < n; i++){
            System.out.printf("Employee #%d%n", i+1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            //Verificar existencia de ID já cadastrada
            while(hasId(list, id)){
                System.out.println("Id already been taken! Try again");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();

            Employee employee = new Employee(id,name,salary);
            list.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();

        //Verificação de id's para aumentar salário
        Employee employee = list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);
        if(employee == null){
            System.out.println("This id does not exist");
        } else {
            System.out.print("Enter the percentage: ");
            int percentage = sc.nextInt();
            employee.increaseSalary(percentage);
        }
        System.out.println();

        System.out.println("List of Employees:");
        for(Employee employees : list){
            System.out.println(employees);
        }


        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id){
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}