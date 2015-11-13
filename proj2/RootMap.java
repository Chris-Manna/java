public class RootMap
{//values that exist within RootMap
	public boolean valid;
	private double initGuess;
	private double betterGuess;
	private double numberToTest;
	private double difference;
	private double actualDifference;

	public RootMap(double number, final double EPSILON)
	{
	numberToTest = number;
	difference = EPSILON;
	initGuess = 1;
	betterGuess = (initGuess + numberToTest/initGuess)/2;
	valid = true;
	}
	
	private void calcNextGuess()
	{
	//exists within nextGuess and cannot be seen or accessed by user
		initGuess = betterGuess;
		betterGuess = (initGuess + numberToTest/initGuess)/2;
	}
	public double nextGuess()
	{
	//is summoned by the user.
		calcNextGuess();
		return betterGuess;
	}
	private void calcDifference()
	{//exists within hasMoreGuesses method and cannot be seen or accessed by user
		actualDifference = initGuess - betterGuess;
		if (actualDifference<0)
				actualDifference = actualDifference*(-1);
	}
	public boolean hasMoreGuesses()
	{//can be accessed by the user
		calcDifference();
		if (actualDifference <= difference)
			valid = false;
		return valid;
	}
}
