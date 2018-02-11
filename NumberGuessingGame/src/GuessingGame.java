import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    Random random = new Random();
    private int secret;
    private int bestScore;

    public GuessingGame() {
        secret = random.nextInt(20);
        bestScore = 5;
    }

    public void Play() {
        int n = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 20");
        int guess = input.nextInt();

        while (guess < 0 || guess > 20 || guess < secret || guess > secret) {
            if (guess < 0 || guess > 20) {
                System.out.println("Sorry, your value needs to be in [0, 20]");
                System.out.println("Enter a number between 0 and 20");
                guess = input.nextInt();
            } else if (n > 10) {
                System.out.println("You have reached 10 attempts and did not beat your best score");
                System.exit(0);
            }
            if (guess < secret && guess > -1 && guess < 21) {
                System.out.println("Too Small");
                n++;
                System.out.println("Enter a number between 0 and 20");
                guess = input.nextInt();
            } else if (guess > secret && guess > -1 && guess < 21) {
                System.out.println("Too Large");
                n++;
                System.out.println("Enter a number between 0 and 20");
                guess = input.nextInt();
            }
        }

        System.out.println("You guessed the secret number!");

        if (n >= bestScore) {
            System.out.println("You did not beat your best score");
        } else if (n < bestScore) {
            System.out.println("New best score!");
        }
    }
}
