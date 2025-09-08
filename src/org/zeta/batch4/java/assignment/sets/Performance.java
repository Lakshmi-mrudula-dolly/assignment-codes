package org.zeta.batch4.java.assignment.sets;

import java.util.*;


public class Performance {
    public static void main(String[] args) {
        Set<Integer> hashSet=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();
        Random random=new Random();
        for(int counter=0;counter<10000;counter++){
            hashSet.add(random.nextInt(100000));
        }
        hashSet.forEach(number-> System.out.print(number+" "));
        System.out.println();
        for(int counter=0;counter<10000;counter++){
            treeSet.add(random.nextInt(100000));
        }
        treeSet.forEach(number-> System.out.print(number+" "));
        System.out.println();
    }
}
