package org.zeta.batch4.java.assignment.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NullPointer {
    public static void main(String[] args) {
        Map<Integer,Integer> hashMap=new HashMap<>();
        Map<Integer,Integer> treeMap=new TreeMap<>();
        hashMap.put(null,1);
        hashMap.put(5,10);
        hashMap.put(2,4);
        hashMap.put(9,18);
        System.out.println("Elements in HashMap : ");
        for(Map.Entry<Integer,Integer> map: hashMap.entrySet()){
            System.out.println(map.getKey()+" : "+ map.getValue());
        }
        treeMap.put(5,10);
        treeMap.put(2,4);
        treeMap.put(9,18);
        treeMap.put(null,1);
        System.out.println("Elements in TreeMap : ");
        for(Map.Entry<Integer,Integer> map: treeMap.entrySet()){
            System.out.println(map.getKey()+" : "+ map.getValue());
        }
    }
}
