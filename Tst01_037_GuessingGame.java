import java.util.Scanner;

public class Tst01_037_GuessingGame {

    //Guessing Game
    //➤ Ask user to guess a random number within limited tries.
    //➤ Purpose: Loop + Scanner + randomness.

    public static void checkGuessNumber(int num, int guess){
        if (guess == num){
            System.out.println("Congratulations! You guessed the correct number.");
            System.exit(0);
        }
        else if (guess < num) {
            System.out.println("The number is greater than " + guess);
        }
        else {
            System.out.println("The number is less than " + guess);
        }

    }

    public static void main(String[] args) {

        int k = 3; //No. of attempts
        System.out.println("Hi There!! Choose a number between 1 to 100.");
        System.out.println("You have " + k + " attempts to guess the correct number.");

        Scanner sc = new Scanner(System.in);
        int num = (int) (100 * Math.random());
        //System.out.println(num);

        for (int i = 1; i <= k; i++) {

            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            checkGuessNumber(num, guess);

        }

        System.out.println("The correct number was " + num);
        System.out.println("You Lost! Better Luck Next Time");

    }
}
