import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        findMostFrequentChar(input);

        scanner.close();
    }

    public static void findMostFrequentChar(String str) {
        int[] freq = new int[256]; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && ch != '\t' && ch != '\n') { 
                freq[ch]++;
            }
        }
        int maxFreq = 0;
        char mostFreqChar = ' ';

        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFreqChar = (char) i;
            }
        }
        if (maxFreq > 0)
            System.out.println("Most frequent character: '" + mostFreqChar + "' appears " + maxFreq + " times.");
        else
            System.out.println("No valid characters found in the string.");
    }
}
