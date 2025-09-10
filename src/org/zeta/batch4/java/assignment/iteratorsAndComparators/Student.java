package org.zeta.batch4.java.assignment.iteratorsAndComparators;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private Double gpa;
    private static int count=0;

    public Student(String name, Double gpa) {
        this.id=++count;
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public Double getGpa() {
        return gpa;
    }
    public int compareTo(Student student){
        if(student.getGpa()>this.gpa) return 1;
        else if(student.getGpa()<this.gpa) return -1;
        else return 0;
    }

    @Override
    public String toString(){
        return "[Name : "+name+" id : "+id+" GPA : "+gpa+"]";
    }

}
