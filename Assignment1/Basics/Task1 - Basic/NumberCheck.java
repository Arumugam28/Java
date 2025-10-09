
import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        if (n > 0) System.out.println("The number is positive.");
        else if (n < 0) System.out.println("The number is negative.");
        else System.out.println("The number is zero.");
        sc.close();
    }
}
