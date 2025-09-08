package org.zeta.batch4.java.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        integerList=reverse(integerList);
        System.out.println(integerList);
    }
    public static List<Integer> reverse(List<Integer> integerList){
        List<Integer> reverseList=new ArrayList<>();
        for(int index=integerList.size()-1;index>=0;index--) reverseList.add(integerList.get(index));
        return reverseList;
    }
}
