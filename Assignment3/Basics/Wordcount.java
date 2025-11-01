import java.io.*;
import java.util.*;

public class Wordcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String filename=sc.nextLine();

        try {
            File file=new File(filename);
            BufferedReader br=new BufferedReader(new FileReader(file));
            List<String> wordsList=new ArrayList<>();
            String line;

            while((line=br.readLine())!=null){
                String[] words=line.toLowerCase().split("\\W+");
                for(String word:words){
                    if(word.length()>0){
                        wordsList.add(word);
                    }
                }
            }
            br.close();
           String[] wordsArr=wordsList.toArray(new String[0]);
            Arrays.sort(wordsArr);

            System.out.println("\nWord count (Alphabetical Order):");
            int count=1;
            for(int i=0;i<wordsArr.length;i++){
                if(i<wordsArr.length-1 && wordsArr[i].equals(wordsArr[i+1])){
                    count++;
                } else {
                    System.out.println(wordsArr[i]+" : "+count);
                    count=1;
                }
            }

        } 
        catch(FileNotFoundException e){
            System.out.println("Error: File not found.");
        } 
        catch(IOException e){
            System.out.println("Error reading the file.");
        }
        finally{
            sc.close();
        }
    }
}
