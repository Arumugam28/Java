import java.io.*;

public class FileCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("Input.txt"));
        String line;
        int lineCount=0, wordCount=0;
        while ((line = br.readLine())!=null) {
            lineCount++;
            String[] words = line.trim().split("\\s+");
            if(!line.trim().equals("")){
                wordCount+=words.length;
            }

        }
        br.close();
        System.out.println("Line count : "+lineCount);
        System.out.println("Word count : "+wordCount);
    }
}
