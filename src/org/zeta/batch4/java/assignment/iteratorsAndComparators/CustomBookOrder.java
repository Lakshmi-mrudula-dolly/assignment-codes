package org.zeta.batch4.java.assignment.iteratorsAndComparators;

import java.util.*;

public class CustomBookOrder {
    public static void main(String[] args) {
        List<Book> books=new ArrayList<>(Arrays.asList(
                new Book("It ends with us","Coolen Hover",2019),
                new Book("Harry Potter","JK Rowling",1997),
                new Book("Hunger games","Suzanne",2008),
                new Book("The Fault in the Stars","John Green",2012)
        ));
       Collections.sort(books,(a,b)->Integer.compare(b.getYear(),a.getYear()));
       for(Book book:books) System.out.println(book);
    }
}
