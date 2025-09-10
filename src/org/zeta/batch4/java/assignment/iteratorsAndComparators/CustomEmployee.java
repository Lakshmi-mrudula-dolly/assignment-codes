package org.zeta.batch4.java.assignment.iteratorsAndComparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CustomEmployee {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>(Arrays.asList(
                new Employee("employee1","Sales",20000),
                new Employee("employee2","Sales",40000),
                new Employee("employee3","Marketing",50000),
                new Employee("employee4","Marketing",40000),
                new Employee("employee5","HR",80000)
        ));
        employees.sort(Comparator.comparing(Employee::getDepartment).thenComparing((a,b)->b.getSalary()-a.getSalary()));
        employees.forEach(System.out::println);
    }
}
