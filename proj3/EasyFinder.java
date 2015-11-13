
public class EasyFinder {

	int i = 0;
	int z = 0;
	String userLocT;
	String compLocT;
	int possiBull1;
	int possiBull2;
	int possiBull3;
	int possiBull4;
	int totalPossiBull;
	int bull;
	int cow;
	
	public EasyFinder(String answer3, String userGuess3) 
	{
		userLocT = userGuess3;
		compLocT = answer3;
		
	}
	private void tryMethod()
	{ 
		if (userLocT.substring(0,1).equals(compLocT.substring(0,1)))
			bull++;
			else if (userLocT.substring(1,2).equals(compLocT.substring(0,1)))
			cow++;
				else if (userLocT.substring(2,3).equals(compLocT.substring(0,1)))
					cow++;
					else if (userLocT.substring(3,4).equals(compLocT.substring(0,1)))
						cow++;
		if (userLocT.substring(1,2).equals(compLocT.substring(1,2)))
			bull++;
			else if (userLocT.substring(2,3).equals(compLocT.substring(1,2)))
			cow++;
				else if (userLocT.substring(3,4).equals(compLocT.substring(1,2)))
					cow++;
					else if (userLocT.substring(0,1).equals((compLocT.substring(1,2))))
						cow++;
		if (userLocT.substring(2,3).equals(compLocT.substring(2,3)))
			bull++;
			else if (userLocT.substring(3,4).equals(compLocT.substring(2,3)))
			cow++;
				else if (userLocT.substring(0,1).equals(compLocT.substring(2,3)))
					cow++;
					else if (userLocT.substring(1,2).equals(compLocT.substring(2,3)))
						cow++;
		if (userLocT.substring(3,4).equals(compLocT.substring(3,4)))
			bull++;
			else if (userLocT.substring(0,1).equals(compLocT.substring(3,4)))
			cow++;
				else if (userLocT.substring(1,2).equals(compLocT.substring(3,4)))
					cow++;
					else if (userLocT.substring(2,3).equals(compLocT.substring(3,4)))
						cow++;
	}
	public int getBull()
	{
		tryMethod();
	return bull;
	}
	
	public int getCow()
	{
	return cow;
	}
}

