package NumberGame;

import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    static int score = 0;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            int number;
            int randomNum = random.nextInt(2) + 1;
            int i = 10;
            boolean guessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("You have 10 attempts to guess a number between 1 and 100.");

            while (i > 0) {
                System.out.println("\nAttempts left: " + i);
                System.out.print("Enter your guess: ");


                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next(); // Consume invalid input
                }

                number = scanner.nextInt();

                if (number == randomNum) {
                    System.out.println("Correct! You guessed it!");
                    score++;
                    System.out.println("Your current score: " + score);
                    guessedCorrectly = true;
                    break;
                } else if (number > randomNum) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }

                i--;
            }

            if (!guessedCorrectly) {
                System.out.println("\nYou've run out of attempts!");
            }

            scanner.nextLine();
            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes");

        } while (playAgain);

        scanner.close();
        System.out.println("\nThank you for playing! Your final score: " + score);
    }
}
