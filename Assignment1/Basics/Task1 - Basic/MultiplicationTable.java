
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for its multiplication table: ");
        int num = sc.nextInt();
        System.out.print("Enter the limit (e.g., 10 for 1..10): ");
        int limit = sc.nextInt();
        for (int i = 1; i <= limit; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}
