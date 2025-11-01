import java.util.*;

public class WordFrequency {
    private HashMap<String, Integer> wordCount = new HashMap<>();

    public void addWords(String text) {
        String[] words = text.toLowerCase().split("\\W+");
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
    }

    public void displayFrequencies() {
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        WordFrequency wf = new WordFrequency();
        wf.addWords("Java is fun and Java is powerful");
        wf.addWords("I love learning Java programming");
        wf.displayFrequencies();
    }
}
