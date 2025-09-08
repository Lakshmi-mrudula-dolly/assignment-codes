package org.zeta.batch4.java.assignment.lists;

import java.util.List;

public class PlayList {
        private List<String> songs;

        public PlayList(List<String> songs) {
            this.songs = songs;
            System.out.println("PlayList is created!!");
            System.out.println(songs);
        }
        public void addSongAtBeginning(String song){
            songs.addFirst(song);
            System.out.println(song+" is added at beginning of the list");
            System.out.println("Modified Playlist : ");
            System.out.println(songs);
        }
        public void addSongAtEnd(String song){
            songs.addLast(song);
            System.out.println(song+" is added at the end of the list");
            System.out.println("Modified Playlist : ");
            System.out.println(songs);
        }
        public void remove(String song){
            songs.remove(song);
            System.out.println(song +" is removed from play list");
            System.out.println("Modified Playlist : ");
            System.out.println(songs);
        }

        @Override
        public String toString() {
            return super.toString();
        }

}
