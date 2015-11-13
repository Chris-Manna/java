import java.util.Scanner;

public class Referee {
	private static int guessLength;
	private static int ticker;
	private static int gameTicker;
	private static int winTicker;
	private static int bulls;
	private static int cows;
	private static String playerDesire;
	private static String j;
	private static String answer;
	private static boolean continuePlaying;
	private static Scanner userInput2;
	private static String userGuess;
	private static String userGuess3;
	private static String answer3;

	public static void main(String[] args) {
		Computer compNumber = new Computer();
		answer = compNumber.getAnswer();
		ticker = 0;
		gameTicker = 0;
		winTicker = 0;
		continuePlaying = true;
		j = "Would you like to continue playing? Press "
				+ "'y' to continue or the 'n' to quit.";

		do {
			// Program Greeting
			if (gameTicker == 0) {
				compNumber = new Computer();
				answer = compNumber.getAnswer();
//				System.out.println(answer);
				System.out.println("Welcome to Bulls and Cows.");
				System.out.println("The computer has chosen it's number. ");
			}// End of Program Greeting

			// Collecting info from the user
			System.out.println("Player, please enter your "
					+ "four digit guess in this format: ####");
			userInput2 = new Scanner(System.in);
			userGuess = userInput2.next();
			guessLength = userGuess.length();

			// Preventing possible Mistakes
			Integer.parseInt(userGuess);
			while (guessLength != 4) {
				System.out.println("Quit fooling around and "
						+ "enter a four digit value as your guess.");
				userGuess = userInput2.next();
				guessLength = userGuess.length();
			}

			// comparing the number given by the computer to the number given by
			// the player
			userGuess3 = userGuess;
			answer3 = answer;

			EasyFinder scoreNew = new EasyFinder(answer3, userGuess3);

			bulls = scoreNew.getBull();
			cows = scoreNew.getCow();

			System.out.println("Your answer has returned " + bulls
					+ " bulls, and " + cows + " cows. ");
			ticker++;
			gameTicker++;
			if (bulls != 4) {
				System.out.println(j);
			} else {
				System.out.println("Congrats! You win!");
				winTicker++;
				if (gameTicker < 1) {
					System.out.print("NICE! AND it only took you "
							+ "one try to find all the bulls! ");
					gameTicker = 0;
				} else {
					System.out.println("It took you " + gameTicker
							+ " round(s) to win this game.");
					gameTicker = 0;
				}
				if (winTicker <= 1)
					System.out.println("First game completed!");
				System.out.println("You have won a total of " + winTicker
						+ " game(s).");
				System.out.println("Would you like to play "
						+ "another round? Press 'y' to continue ");
				System.out.println("or the 'n' character to quit.");
			}

			Scanner userInput1 = new Scanner(System.in);
			playerDesire = userInput1.next();

			String y = "y";
			String n = "n";

			playerDesire = playerDesire.substring(0, 1);
			if (playerDesire.equals(n)) {
				System.out.println("Suit yourself!");
				System.out.println("You have played " + ticker
						+ " round(s) in total ");
				System.out.print("and " + gameTicker + " round(s) this game. ");
				System.out.println("You've won a total of " + winTicker
						+ " games!");
				continuePlaying = false;
			} else {
				continuePlaying = (playerDesire.equals(y));
			}
		} while (continuePlaying);
	}
}
