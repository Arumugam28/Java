import java.io.*;
import java.util.*;

public class AdvancelevelTask2 {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();

        try{
            BufferedReader br=new BufferedReader(new FileReader("input.txt"));
            String line;
            while((line=br.readLine())!=null){
                list.add(line);
            }
            br.close();
        }catch(IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }
        System.out.println("File Content:\n");
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
