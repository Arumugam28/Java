import java.io.*;
import java.util.*;

public class AdvancelevelTask7{
    public static HashSet<String> readCSV(String filename){
        HashSet<String> data=new HashSet<String>();
        try{
            BufferedReader br=new BufferedReader(new FileReader(filename));
            String line;
            while((line=br.readLine())!=null){
                String[] values=line.split(",");
                for(String val:values){
                    data.add(val.trim());
                }
            }
            br.close();
        }catch(IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }
        return data;
    }
    public static void searchData(HashSet<String> data,String key){
        boolean found=false;
        for(String item:data){
            if(item.equalsIgnoreCase(key)){
                System.out.println("Match found: "+item);
                found=true;
            }
        }
        if(!found){
            System.out.println("No match found for '"+key+"'");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String filename="dataadvance.csv";
        HashSet<String> records=readCSV(filename);
        System.out.println("Data loaded from CSV: "+records.size()+" entries");
        System.out.print("Enter a word to search: ");
        String key=sc.nextLine();
        searchData(records,key);
    }
}
