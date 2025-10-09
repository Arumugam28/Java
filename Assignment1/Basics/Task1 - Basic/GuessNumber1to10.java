
import java.util.Random;
import java.util.Scanner;
public class GuessNumber1to10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(10) + 1; 
        Scanner sc = new Scanner(System.in);
        int guesses = 0;
        System.out.println("Guess a number between 1 and 10:");
        while (true) {
            System.out.print("Your guess: ");
            int g = sc.nextInt();
            guesses++;
            if (g == target) {
                System.out.println("Correct! You guessed in " + guesses + " tries.");
                break;
            } else if (g < target) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }
        sc.close();
    }
}
