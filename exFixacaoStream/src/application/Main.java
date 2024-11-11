package application;

import entities.Employee;
import services.SumService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        System.out.print("Enter Salary: ");
        Double salary = sc.nextDouble();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            //Filtrar emails que tenham o salario maior que o informado pelo usuario:
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary)+ ":");
            List<String> emails = list.stream()
                    .filter(employee -> employee.getSalary() > salary)
                    .map(employee -> employee.getEmail())
                    .sorted()
                    .collect(Collectors.toList());
            emails.forEach(System.out::println);

            //realizar a soma dos salarios que iniciam com a letra M:
            SumService sumService = new SumService();
            double sum = sumService.filteredSum(list, employee -> employee.getName().charAt(0) == 'M');
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
        } catch (IOException e){
            System.out.printf("Error: " + e.getMessage());
        }
        sc.close();
    }
}