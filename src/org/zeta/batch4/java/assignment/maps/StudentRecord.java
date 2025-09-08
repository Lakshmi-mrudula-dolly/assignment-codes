package org.zeta.batch4.java.assignment.maps;

public class StudentRecord{
    private String name;
    private Double gpa;

    public StudentRecord(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public double getGpa() {
        return gpa;
    }

}
