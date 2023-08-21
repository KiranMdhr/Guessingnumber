import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void
    guessingNumberGame()
    {
        // Scanner Class
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);


        int K = 5;

        int i, guess;

        System.out.println(
                "A number is chosen"
                        + " between  0 to 99"
                        + "Guess the number"
                        + " within 5 trials.");

        // Iterate over K Trials
        for (i = 0; i < K; i++) {

            System.out.println(
                    "Guess the number:");

            // Take input for guessing
            guess = sc.nextInt();

            // If the number is guessed
            if (number == guess) {
                System.out.println(
                        "Congratulations!"
                                + " You guessed the number.");
                break;
            }
            else if (number > guess
                    && i != K - 1) {
                System.out.println(
                        "The number is "
                                + "greater than " + guess);
            }
            else if (number < guess
                    && i != K - 1) {
                System.out.println(
                        "The number is"
                                + " less than " + guess);
            }
        }

        if (i == K) {
            System.out.println(
                    "You have exhausted"
                            + " K trials.");

            System.out.println(
                    "The number was " + number);
        }
    }

    public static void main(String arg[])
    {
        guessingNumberGame();
    }
}