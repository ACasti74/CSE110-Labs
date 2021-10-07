import java.util.Random;
import java.util.Scanner;

/**
 * Author: Alejandro Castillo
 * FileName: Assignment04.java
 * Specification: MasterMind.
 * For: CSE 110 - Assignment04
 * Time Spent: 90 Minutes
 */

public class Assignment04 {

    public static void main(String[] args) {

        int guess = 0;
        int count = 0;
        String wantToPlayAgain;
        String userGuessNumber;
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        String randomNumber = String.format(("%04d"), random.nextInt(10000));
        System.out.println("-----MASTERMIND-----");
        System.out.println("Guess the 4 digit number");
        System.out.println(randomNumber);

        while (true) {
            guess++;
            System.out.println("\nGuess " + guess + ": ");
            userGuessNumber = keyboard.nextLine();

            for (int i = 0; i < 4; i++) {
                if (userGuessNumber.charAt(i) == randomNumber.charAt(i)) {
                    count++;
                }
            }
            System.out.println("You matched " + count);
            if (count == 4) {
                System.out.println("Congratulations! You guessed the right number in " + guess + " guesses");
                break;
            }
            count = 0;
        }
        System.out.println("Would you like to play again (yes/no)?");
        wantToPlayAgain = keyboard.nextLine();
        if (wantToPlayAgain.equals("yes") || wantToPlayAgain.equals("no")); {
            keyboard.close();
        }
    }
}
