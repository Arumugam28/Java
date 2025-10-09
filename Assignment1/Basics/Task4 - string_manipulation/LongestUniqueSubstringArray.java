import java.util.Scanner;

public class LongestUniqueSubstringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int maxLength = findLongestUniqueSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + maxLength);

        scanner.close();
    }

    public static int findLongestUniqueSubstring(String str) {
        int n = str.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256]; 
            int length = 0;
            for (int j = i; j < n; j++) {
                char current = str.charAt(j);

                if (visited[current]) { 
                    break;
                } else {
                    visited[current] = true;
                    length++;
                    maxLength = Math.max(maxLength, length);
                }
            }
        }
        return maxLength;
    }
}
