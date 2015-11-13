/*Welcome to my RootTester program where we use the Heron Method to
 * compute an approximate root value for the values the user suggests. 
 * From Heron out you'll be reading my code, (Bada chshh).
 */

import java.util.Scanner;

public class RootTester
{
	public static void main(String[] args)
	{
		double number;
		final double EPSILON = .005;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please put the value you'd like to ");
		System.out.println("approximate the root for: ");
		number = input.nextDouble();
		
		RootMap approxValue = new RootMap(number, EPSILON); 
		// approxValue is now object of RootMap with parameter number.
		// we pass the variable number to RootMap
			
		
		while (approxValue.hasMoreGuesses())
			System.out.println(approxValue.nextGuess());
		
	}
}
