import java.util.Scanner;
import java.util.Collections;

/**
 * This class is supposed to mimic the referee/dealer of a real game.
 * It allows for the ability to play the poker game and directs the
 * player, deck, and user prompts to their proper places, 
 * displays what the user has in his hand.
 * @author: Christopher G Manna
 * @version: 11/9/11
 */
public class Game{
	private Player user;
	private Deck deck;
	private int i;
	private Scanner in = new Scanner(System.in);
		
	public Game() {//initializing and using IV
		user = new Player();
		deck = new Deck();
	}

	public void play(){//initializing and using IV
		for(i = 0; i < 5; i++){
			Card card = deck.draw();
			user.addCard(card);
		}
		Collections.sort(user.getHand());
		System.out.println("Your hand consists of: \n");
		System.out.println(" | "+user.toString());
		System.out.println(user.scoring());
		System.out.println("Would you like to exchange any of your cards for other cards? " +
				"Press 'y' - yes, 'n' - no");
		if(!in.next().equals("n")) {
			for (i=0; i<5; i++){
			System.out.println("If you would like to exchange this card, " + user.getHand().get(i) + ", ");
			System.out.println("press 'y' for yes, or 'n' for no");
			/**
			 * Please enter the number under which you'd like to exchange your card for another card.
			 * 		1
			 */
			if (in.next().equals("y")){
				user.getHand().remove(i);
				Card card = deck.draw();
				user.addCard(card);
				}
			}
		}
		System.out.println("The cards in your hand now consist of:\n");
		Collections.sort(user.getHand());
		System.out.println(" | "+user.toString());
		System.out.println(user.scoring());
	}
}
