import java.util.ArrayList;
import java.util.Collections;

/**
 * The Deck class is supposed to mimic the 52 card deck of poker of a
 * real real game. It creates the array list of cards, shuffles the cards,
 * draws cards from the created Deck array list and 
 * subtracts the card drawn from the deck.
 * @author: Christopher G Manna
 * @version: 11/9/11
 */

public class Deck {
	//declaring instance variables
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int i;
	private int j;
	
	public Deck() {
		//initializing and using IV
		for(i = 0; i < 4; i++) {
			for(j=0; j < 13; j++) {
				Card newCard = new Card(i, j);
				cards.add(newCard);
			}
		}
		shuffle();
	}
	public void shuffle() {//initializing and using IV
		Collections.shuffle(cards);
	}
	public Card draw() {//initializing and using IV
		Card returnCard = cards.get(0);
		cards.remove(0);
		return returnCard;
	}
}
