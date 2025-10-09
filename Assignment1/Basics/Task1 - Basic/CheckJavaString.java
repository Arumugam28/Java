
import java.util.Scanner;
public class CheckJavaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        if (s.contains("Java")) System.out.println("The string contains Java.");
        else System.out.println("The string does not contain Java.");
        sc.close();
    }
}
