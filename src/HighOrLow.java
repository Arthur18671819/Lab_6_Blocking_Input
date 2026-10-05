import java.util.Random   ;
import java.util.Scanner;
public class HighOrLow {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;
        boolean correct = false;

        System.out.println("Welcome to the High or Low game!");
        System.out.println("I'm thinking of a number between 1 and 10   .");

        while (!correct) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                attempts++;
                if (guess == secretNumber) {
                    correct = true;
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
