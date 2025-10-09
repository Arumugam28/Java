import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = capitalizeWords(input);
        System.out.println("String after capitalization: " + result);
        scanner.close();
    }

    public static String capitalizeWords(String str) {
        String result = "";
        boolean capitalizeNext = true; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ' || ch == '\t' || ch == '\n') {
                result += ch;
                capitalizeNext = true;
            } else {
                if (capitalizeNext && ch >= 'a' && ch <= 'z') {
                    result += (char) (ch - 32);
                    capitalizeNext = false;
                } else {
                    result += ch;
                    capitalizeNext = false;
                }
            }
        }

        return result;
    }
}
