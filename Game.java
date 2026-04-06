package placement;
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int secretnumber = 7;
		int guess;
		System.out.println("Welcome to number guessing game!");
		while(true) {
			System.out.println("Enter your guess number:");
			guess = sc.nextInt();
			if(guess == secretnumber) {
				System.out.println("Correct! you guessed the number");
				break;
			}
			else if(guess<secretnumber) {
				System.out.println("too small! try again.");
			}
			else {
				System.out.println("too large! try again.");
			}
		}
		System.out.println("Game over.");
	}

}
