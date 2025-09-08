package org.zeta.batch4.java.assignment.employeeinfo;

public class Employee {
    private String name;
    public int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name : "+name+", salary : "+salary;
    }
}
