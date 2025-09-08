package org.zeta.batch4.java.assignment.sets;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
        public String name;
        public int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "name : "+name+", salary : "+salary;
        }

    @Override
    public int compareTo(Employee o) {
        return o.salary-this.salary;
    }
}
