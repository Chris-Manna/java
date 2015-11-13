import java.util.Scanner;

public class PokerTester {


	public static void main(String[] args) {
		
		System.out.println("Welcome to Poker!\n");
		Scanner in = new Scanner(System.in);
		boolean playAgain = true;
		while(playAgain) {
			Game game = new Game();
			game.play();
			System.out.println("Would you like to play again? press y to continue, q to quit");
			if(in.next().equals("q"))
				playAgain = false;
		}
		System.out.println("Thank you for playing");

	}

}
