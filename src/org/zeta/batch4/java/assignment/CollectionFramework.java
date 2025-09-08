package org.zeta.batch4.java.assignment;

import javax.xml.catalog.Catalog;
import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        studentNames();
        uniqueEmails();
        countryCodes();
        catalog();
    }
    public static void studentNames(){
        List<String> student_names=new ArrayList<>();
        student_names.add("Mrudula");
        student_names.add("Rithika");
        student_names.add("Madhuri");
        student_names.add("Akshitha");
        student_names.add("Alekhya");
        System.out.println("Printing names using list: ");
        student_names.forEach(name-> System.out.println(name));
    }
    public static void uniqueEmails(){
        Set<String> emails=new HashSet<>();
        emails.add("lakshmi@gmail.com");
        emails.add("mrudula@gmail.com");
        emails.add("dolly@gmail.com");
        emails.add("21251A66@gmail.com");
        emails.add("bhavi@gmail.com");
        System.out.println("Printing unique mails using set: ");
        emails.forEach(email-> System.out.println(email));
    }
    public static void countryCodes(){
        Map<String,String> country_codes=new HashMap<>();
        country_codes.put("CAN","Canada");
        country_codes.put("IND","India");
        country_codes.put("DEU","Germany");
        country_codes.put("JPN","Japan");
        System.out.println("Printing countries and their codes using map: ");
        for(Map.Entry<String,String> map:country_codes.entrySet()){
            System.out.println(map.getKey()+" : "+map.getValue());
        }
    }
    public static void catalog(){
        Set<String> catalogBooks=new TreeSet<>();
        catalogBooks.add("Wings of fire");
        catalogBooks.add("Harry Potter");
        catalogBooks.add("Variety");
        catalogBooks.add("It ends with us");
        System.out.println("Books in the alphabetical order : ");
        catalogBooks.forEach(book-> System.out.println(book));
    }
}
