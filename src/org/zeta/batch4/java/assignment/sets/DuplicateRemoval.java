package org.zeta.batch4.java.assignment.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class DuplicateRemoval {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("Raju","Mohan","Abhishek","Mohan","Taylor","Raju"));
        System.out.println("List of names : ");
        names.forEach(name-> System.out.println(name));
        Set<String> uniqueNames=new HashSet<>(names);
        System.out.println("Unique names from the list are : ");
        uniqueNames.forEach(name-> System.out.println(name));
    }
}
