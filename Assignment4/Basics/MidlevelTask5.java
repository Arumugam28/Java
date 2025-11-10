import java.io.*;
import java.util.*;

public class MidlevelTask5{
    public static void main(String args[]){
        String fileName="data.csv";
        List<Map<String,String>> dataList=new ArrayList<>();

        try(BufferedReader br=new BufferedReader(new FileReader(fileName))){
            String headerLine=br.readLine();
            if(headerLine==null){
                System.out.println("Empty CSV file");
                return;
            }

            String headers[]=headerLine.split(",");
            String line;

            while((line=br.readLine())!=null){
                String values[]=line.split(",");
                Map<String,String> map=new HashMap<>();

                for(int i=0;i<headers.length&&i<values.length;i++){
                    map.put(headers[i].trim(),values[i].trim());
                }
                dataList.add(map);
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        for(Map<String,String> row:dataList){
            System.out.println(row);
        }
    }
}
