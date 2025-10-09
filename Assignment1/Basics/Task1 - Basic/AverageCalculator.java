
import java.util.*;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Count must be positive.");
            sc.close();
            return;
        }
        double sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            sum += sc.nextDouble();
        }
        System.out.println("Average = " + (sum / n));
        sc.close();
    }
}
