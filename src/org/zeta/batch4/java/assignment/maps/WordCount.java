package org.zeta.batch4.java.assignment.maps;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        try(FileReader fileReader=new FileReader("src/org/zeta/batch4/java/assignment/maps/SampleFile")){
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();
            Map<String,Integer> wordFrequency=new HashMap<>();
            while(line!=null){
               line.toLowerCase();
               line.replaceAll("[^a-z ]","");
               String[] words=line.split(" ");
               for(String word:words){
                   wordFrequency.put(word,wordFrequency.getOrDefault(word,0)+1);
               }
               line=br.readLine();
            }
            for(Map.Entry<String,Integer> map:wordFrequency.entrySet()){
                System.out.println(map.getKey()+" : "+map.getValue());
            }

        }
      catch(FileNotFoundException e){
          System.out.println(e.getMessage());
      }
      catch (IOException e){
          System.out.println(e.getMessage());
      }
    }
}
