package org.zeta.batch4.java.assignment.sets;

import java.util.*;


public class SortedNames {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("Raju","Mohan","Abhishek","Mohan","Taylor","Raju"));
        System.out.println("List of names : ");
        names.forEach(name-> System.out.println(name));
        Set<String> sortedNames=new TreeSet<>(names);
        System.out.println("Sorted names: ");
        sortedNames.forEach(name-> System.out.println(name));
    }
}
