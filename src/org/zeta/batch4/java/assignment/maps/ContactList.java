package org.zeta.batch4.java.assignment.maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ContactList {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Map<String,String> contactList=new TreeMap<>();
        contactList.put("Mrudula","9112933560");
        contactList.put("Dolly","9012345678");
        contactList.put("Bhavishya","9182736450");
        int option=0;
        do{
            System.out.println("1. Add a contact\n2.Remove a contact\n3.Show contact list\n4.Quit");
            System.out.print("Enter a number : ");
            option=input.nextInt();
            System.out.println();
            switch(option){
                case 1:
                    System.out.print("Enter the name of contact: ");
                    String name=input.next();
                    System.out.println();
                    System.out.print("Enter mobile number : ");
                    String number=input.next();
                    System.out.println();
                    contactList.put(name,number);
                    break;
                case 2:
                    System.out.print("Enter the name of the contact you want to remove : ");
                    String contact=input.next();
                    System.out.println();
                    contactList.remove(contact);
                    break;
                case 3:
                    for(Map.Entry<String,String> map:contactList.entrySet()){
                        System.out.println(map.getKey()+" : "+map.getValue());
                    }
                    break;
            }
        }while(option!=4);
    }
}
