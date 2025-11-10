import java.util.*;

public class AdvancelevelTask3 {
    static HashMap<String,Integer> wordMap=new HashMap<>();
    static void updateFrequency(String text){
        String words[]=text.split("\\s+");
        for(String word:words){
            word=word.toLowerCase();
            if(wordMap.containsKey(word)){
                wordMap.put(word,wordMap.get(word)+1);
            }else{
                wordMap.put(word,1);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str1=sc.nextLine();
        updateFrequency(str1);
        System.out.println("Enter another sentence:");
        String str2=sc.nextLine();
        updateFrequency(str2);
        System.out.println("\nWord Frequencies:");
        for(Map.Entry<String,Integer> entry:wordMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        sc.close();
    }
}
