
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci series up to " + n + ": ");

        if (n >= 0) System.out.print(a + " ");
        if (n >= 1) System.out.print(b + " ");

        while (true) {
            int c = a + b;
            if (c > n) break;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        System.out.println();
        sc.close();
    }
}
