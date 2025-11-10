import java.io.*;
import java.util.*;

public class MidlevelTask3{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("input.txt"));
        Map<String,Integer> map=new TreeMap<>();
        String line;

        while((line=br.readLine())!=null){
            String words[]=line.toLowerCase().split("\\W+");
            for(String w:words){
                if(w.length()>0){
                    map.put(w,map.getOrDefault(w,0)+1);
                }
            }
        }
        br.close();

        System.out.println("Word Count in Alphabetical Order:");
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
