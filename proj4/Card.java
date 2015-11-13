public class Card implements Comparable<Card>
{
		private int suit;
		private int value;
		private final static String[] suits = {"hearts", "spades", "diamonds", "clubs"};//creates and array for suits
		private final static String[] values = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		//creates an array for value of cards
		
	public Card(int s, int v) 
		{
			suit = s;
			value = v;
		}
	public int getValue()
		{
			return value;
		}	
		
	public int compareTo(Card other) 
		{
			getValue();
			if (this.getValue()==other.getValue())
			{
				return 0;
			}
			if (this.getValue()>other.getValue())
			{
				return 1;
			}
			else
				return -1;
		}
		
	public String toString() 
		{
			String info = values[value] + " of " + suits[suit];	
			return info;
		}
		
	public int getValue(int i) 
		{
				return value;
		}
}
