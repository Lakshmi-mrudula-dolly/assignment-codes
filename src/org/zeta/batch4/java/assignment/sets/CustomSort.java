package org.zeta.batch4.java.assignment.sets;


import java.util.*;

public class CustomSort {
        public static void main(String[] args) {
            List<Employee> employees=new ArrayList<>(Arrays.asList(
                    new Employee("Mrudula",20000),
                    new Employee("Dolly",30000),
                    new Employee("Divya",5000)
            ));
            employees.sort((a,b)->b.salary-a.salary);
            System.out.println("Sorting in descending order: ");
            employees.forEach(System.out::println);
            System.out.println("Sorted in descending order using Tree set : ");


            employees=new ArrayList<>(Arrays.asList(
                    new Employee("Mrudula",2000),
                    new Employee("Dolly",3000),
                    new Employee("Divya",50000)
            ));
            Set<Employee> treeSet=new TreeSet<>(employees);
            treeSet.forEach(employee-> System.out.println(employee));

        }

}
