import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCountSimple{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        sc.close();

        String[] words = new String[1000];
        int[] count = new int[1000];
        int size = 0;

        try{
            Scanner file = new Scanner(new File(fileName));

            while(file.hasNext()){
                String w = file.next().toLowerCase().replaceAll("[^a-z]", "");
                if(w.equals("")) continue;

                int i;
                for(i=0;i<size;i++){
                    if(words[i].equals(w)){
                        count[i]++;
                        break;
                    }
                }
                if(i==size){
                    words[size]=w;
                    count[size]=1;
                    size++;
                }
            }

            file.close();

        }catch(FileNotFoundException e){
            System.out.println("File not found!");
            return;
        }

        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(words[i].compareTo(words[j])>0){
                    String tempW = words[i];
                    words[i] = words[j];
                    words[j] = tempW;

                    int tempC = count[i];
                    count[i] = count[j];
                    count[j] = tempC;
                }
            }
        }

        System.out.println("\nWord counts in alphabetical order:");
        for(int i=0;i<size;i++){
            System.out.println(words[i]+" : "+count[i]);
        }
    }
}
