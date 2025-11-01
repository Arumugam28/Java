import java.io.*;
import java.util.*;

public class ArrayListreadfile {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Iterator<String> it = lines.iterator();
        System.out.println("File Content:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
