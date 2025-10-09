import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeSpaces(input);

        System.out.println("String after removing white spaces: " + result);

        scanner.close();
    }

    public static String removeSpaces(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && ch != '\t' && ch != '\n') {
                result += ch;
            }
        }

        return result;
    }
}
