package services;

import entities.Employee;

import java.util.List;
import java.util.function.Predicate;

public class SumService {
    public double filteredSum(List<Employee> list, Predicate<Employee> criteria){
        double sum = 0.0;
        for (Employee employee : list){
            if (criteria.test(employee)){
                sum += employee.getSalary();
            }
        }
        return sum;
    }
}
