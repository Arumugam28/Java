import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetSearch {
    public static void main(String[] args) {
        String fileName = "Example.csv";
        HashSet<String> dataSet = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = br.readLine()) != null) {
                dataSet.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("Data loaded successfully from CSV!");
        System.out.println("Total entries: " + dataSet.size());

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter text to search: ");
        String searchTerm = sc.nextLine().toLowerCase();
        searchEntries(dataSet, searchTerm);
        sc.close();
    }
    public static void searchEntries(HashSet<String> set, String searchTerm) {
        boolean found = false;
        System.out.println("\nSearch Results:");
        for(String entry : set) {
            if(entry.toLowerCase().contains(searchTerm)) {
                System.out.println(entry);
                found = true;
            }
        }

        if(!found)
            System.out.println("No matching entries found!");
    }
}
