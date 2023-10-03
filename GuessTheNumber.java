// Name- Anurag Bonde
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int totalScore = 0;
        boolean playAgain = true;

        System.out.println("Welcome\n");

        while (playAgain) {
            int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            int userScore = 0;

            System.out.println("thinking of a number between " + lowerBound + " and " + upperBound + "\n");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess Number: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.\n");
                    userScore = maxAttempts - attempts + 1;
                    totalScore += userScore;
                    break;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Try a higher/upper number.");
                } else {
                    System.out.println("Try a Shorter/lower number.");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've run out of attempts. The true number was " + generatedNumber + "\n");
                }
            }

            System.out.println("Your score for this round: " + userScore);
            System.out.println("Total score: " + totalScore + "\n");

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");

            System.out.println("\n");
        }

        System.out.println("Thank you for playing with us!");
        scanner.close();
    }
}