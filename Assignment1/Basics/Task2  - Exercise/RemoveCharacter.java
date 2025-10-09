import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter a character to remove: ");
        char c = sc.next().charAt(0);

        String result = removechar(s, c);
        System.out.println("Output: " + result);

        sc.close();
    }

    public static String removechar(String s, char c) {
        String result = ""; 
        char lowerC = Character.toLowerCase(c);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.toLowerCase(ch) != lowerC) {
                result += ch; 
            }
        }

        return result;
    }
}
