package org.zeta.batch4.java.assignment.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsExample {
        public static void main(String[] args) {
            List<String> songs=new ArrayList<>(Arrays.asList("Butter","Dynamic","Standing Next to you"));
            System.out.println("List of songs in the PlayList : ");
            PlayList btsPlaylist=new PlayList(songs);
            System.out.println("---------------------");

            System.out.println("Add a new song Life goes on at the beginning of the list : ");
            btsPlaylist.addSongAtBeginning("Life goes on");
            System.out.println("---------------------");

            System.out.println("Add a new song seven at the end of the list : ");
            btsPlaylist.addSongAtEnd("Seven");
            System.out.println("---------------------");

            System.out.println("Remove dynamic form the list : ");
            btsPlaylist.remove("Dynamic");
            System.out.println("---------------------");

        }
    }
