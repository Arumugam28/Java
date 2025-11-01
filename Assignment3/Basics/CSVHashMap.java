import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CSVHashMap {
    public static void main(String[] args) {
        String csvFile = "data.csv";
        String line;
        String[] headers = null;
        List<HashMap<String, String>> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (isFirstLine) {
                    headers = values;
                    isFirstLine = false;
                } else {
                    HashMap<String, String> rowMap = new HashMap<>();
                    for (int i = 0; i < headers.length; i++) {
                        rowMap.put(headers[i], values[i]);
                    }
                    data.add(rowMap);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (HashMap<String, String> row : data) {
            System.out.println(row);
        }
    }
    
}
