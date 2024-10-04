import java.util.Random;
import java.util.Scanner;

public class Game {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random = new Random(); 

int low = 1;
int high = 20;
int mostattempts = 6;


System.out.println("Welcome to the Number Guessing Game");

do {
        int target = random.nextInt(high - low + 1) + low;
        int attempts = 0;
        boolean guess = false;

        System.out.println("\nGuess the number between " + low + " and " + high + ".");

        while (attempts < mostattempts && !guess) {
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();
        attempts++;

    if (userGuess == target) {
    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
    guess = true;
    }
    else if (userGuess < target) {
    System.out.println("The number is higher.");
    }
     else {
    System.out.println("The number lower.");

}
 }

if (!guess) {
    System.out.println("You have used all available guesses the number was. "+ target);

}

 System.out.print("\nWould you like to play again? (yes/no): ");
String playAgain = scanner.next().toLowerCase();

if (playAgain.equals("no")) {
break;

}

        } while (true);

        scanner.close();
    }
}