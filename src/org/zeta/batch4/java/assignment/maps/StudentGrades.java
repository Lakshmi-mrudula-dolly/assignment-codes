package org.zeta.batch4.java.assignment.maps;

import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        List<StudentRecord> students =new ArrayList(Arrays.asList(
                new StudentRecord("Rahul",8.2),
                new StudentRecord("Arpana",8.6),
                new StudentRecord("Siri",7.9),
                new StudentRecord("Madhuri",9.7),
                new StudentRecord("Madhu",9.7)
        ));
        Map<Double,List<String>> sortedGPA=new TreeMap<>(Comparator.reverseOrder());
        for(StudentRecord student:students){
            if(sortedGPA.containsKey(student.getGpa())){
                List<String> names=sortedGPA.get(student.getGpa());
                names.add(student.getName());
                sortedGPA.put(student.getGpa(), names);
            }
            else {
                List<String> names=new ArrayList<>();
                names.add(student.getName());
                sortedGPA.put(student.getGpa(), names);
            }
        }
        for(Map.Entry<Double,List<String>> map: sortedGPA.entrySet()){
            System.out.print(map.getKey()+" : ");
            map.getValue().forEach(name-> System.out.print(name+" "));
            System.out.println();
        }
    }
}
