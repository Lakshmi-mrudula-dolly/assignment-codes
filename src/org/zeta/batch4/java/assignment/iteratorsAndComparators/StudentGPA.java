package org.zeta.batch4.java.assignment.iteratorsAndComparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentGPA {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>(Arrays.asList(
                new Student("Madhuri",9.5),
                new Student("Manisha",9.8),
                new Student("Sailaja",9.3),
                new Student("Malavika",9.1)
        ));
        Collections.sort(students);
        for(Student student : students) System.out.println(student);
    }
}
