
import java.util.Arrays;
import java.util.Scanner;
public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many names? ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n <= 0) {
            System.out.println("No names to sort.");
            sc.close();
            return;
        }
        String[] names = new String[n];
        System.out.println("Enter " + n + " names (one per line):");
        for (int i = 0; i < n; i++) names[i] = sc.nextLine();
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted names:");
        for (String name : names) System.out.println(name);
        sc.close();
    }
}
