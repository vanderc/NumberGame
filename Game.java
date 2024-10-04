import java.util.Random;
import java.util.Scanner;

public class Game {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random = new Random(); 
// The low range for the numbers
int low = 1;
// The high range for the numbers
int high = 20;
// Amount of guesses allowed
int mostattempts = 6;

// A welcome to the program
System.out.println("Welcome to the Number Guessing Game");

do {
        // This how the number is picked
        int target = random.nextInt(high - low + 1) + low;
        int attempts = 0;
        boolean guess = false;

        // Prompt given to the user
        System.out.println("\nGuess the number between " + low + " and " + high + ".");

        // As long as you are within the available amount of tries this will continue
        while (attempts < mostattempts && !guess) {
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();
        attempts++;
    
    // This happens when you guess right
    if (userGuess == target) {
    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
    guess = true;
    }
    // The number guessed was to low
    else if (userGuess < target) {
    System.out.println("The number is higher.");
    }
    // The number guessed was to high
     else {
    System.out.println("The number lower.");

}
 }

 // You ran out of guesses
if (!guess) {
    System.out.println("You have used all available guesses the number was. "+ target);

}
// Asks if you want to continue and if so will run the program again
 System.out.print("\nWould you like to play again? (yes/no): ");
String playAgain = scanner.next().toLowerCase();

// Will end program
if (playAgain.equals("no")) {
break;

}

        } while (true);

        scanner.close();
    }
}