
import java.util.Scanner;
public class RangeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 100: ");
        int n = sc.nextInt();
        if (n >= 1 && n <= 50) System.out.println("The number is in the lower half.");
        else if (n >= 51 && n <= 100) System.out.println("The number is in the upper half.");
        else System.out.println("Invalid number.");
        sc.close();
    }
}
