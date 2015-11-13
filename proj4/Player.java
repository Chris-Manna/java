import java.util.ArrayList;

public class Player 
{
		private ArrayList<Card> hand = new ArrayList<Card>();
		
		public ArrayList<Card> getHand()
		{
			return hand;
		}
		
		public void addCard(Card card) {
			hand.add(0, card);
		}
		
		public void removeCard(Card card){
			hand.remove(card);
		}
		
		public String toString() {
			String info = "";
			for(Card card : hand) {
				info += card.toString() + "\n";
			}
			return info;
		}
		/**
		 * checking for straight
		 * straight = hand.getValue(i)==hand.getValue(i+1)-1;
		 * 
		 * do 
		 * 
		 * 
		 * 
		 * while (straight)
		 * {
		 * 		for (int i = 0; i < 5; i++)
		 * 			{
		 * 			hand.getValue(i)==hand.getValue(i+1)-1;
		 * 			return straight;
		 * 			}
		 * return straight;
		 * }
		 * 
		 * Checking for flush
		 * flush = false;
		 * 
		 * i = 0;
		 * do
		 * {
		 *  if (Card.getSuit(i)==Card.getSuit(i+1));
		 *  return flush = true;
		 * }
		 * while (flush && i<5)
		 */
		
}
