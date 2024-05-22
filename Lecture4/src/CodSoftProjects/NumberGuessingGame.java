package CodSoftProjects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        int score = 0;
        boolean playAgain = true;

        System.out.println("welcome to the Guessing Game!");

        while (playAgain){
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 10;
            boolean guessCorrectly = false;

            System.out.println("\nI have selected a ramdom number between 1 and 100.");
            System.out.println("You have "+ attempts + " attempts to guess it.");

            for (int i = 1; i <= attempts ;i++){
                System.out.print("Attempt " + i + ": Enter your Guess: ");
                int userGuess = s.nextInt();

                if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                }
                else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                }
                else {
                    System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                    guessCorrectly = true;
                    score += (attempts - i + 1);   // Score based on remaining attempts
                    break;
                }
            }
            if (!guessCorrectly) {
                System.out.println("Sorry, you have used all attempts. The correct number was: " + randomNumber);
            }

            System.out.println("Do you want to play again? (yes/no):");
            String response = s.next();
            playAgain = response.equalsIgnoreCase("yes");

        }
        System.out.println("Your final score is: " + score);
        System.out.println("Thank you for playing!");
        s.close();
    }
}
