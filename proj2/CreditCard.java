Info Here
import java.util.Scanner;

public class CreditCard 
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		String cardNumber;
		int valid = 0;
		
		System.out.println("Please enter your twelve digit card number in this format: ");
		System.out.println("####-####-#### ");
		cardNumber = userInput.next();
		
		//first digit must be integer value 4. - Step 1
		int mustBe4 = 4;
		int firstNumber;
		int i = 0;
		String firstNumberLoc = cardNumber.substring(0,1);
		firstNumber = Integer.parseInt(firstNumberLoc.substring(i, ++i));
		if (firstNumber != mustBe4)
			{
			System.out.println("Error Code No. 1");
			valid = valid+1;
			}
		
		//finding that the fifth digit is one more than the fourth digit
		//setting up the conditional fourth number
		i = 0;
		String fifthNumberLoc = cardNumber.substring(5,6);
		int fifthNumber;
		fifthNumber = Integer.parseInt(fifthNumberLoc.substring(i, ++i));
		int condFourthDigit=fifthNumber+1;
		
		i = 0;
		int fourthNumber;
		String fourthNumberLoc = cardNumber.substring(3,4);
		fourthNumber = Integer.parseInt(fourthNumberLoc.substring(i, ++i));
		if (fourthNumber != condFourthDigit)
		{
			valid = valid+1;
			System.out.println("Error Code No. 2");
		}
		
		//finding the ninth number value
		i = 0;
		String ninthNumberLoc = cardNumber.substring(10,11);
		int ninthNumber;
		ninthNumber = Integer.parseInt(ninthNumberLoc.substring(i, ++i));
		
		//finding whether the product of the first, fifth, and ninth values equal 24.
		if (firstNumber*fifthNumber*ninthNumber!=24)
			{
			System.out.println("Error Code No. 3");
			valid = valid+1;
			}
		
		//constructing different sets of numbers
		String setOhNumbers1 = cardNumber.substring(0,4);
		String setOhNumbers2 = cardNumber.substring(5,9);
		String setOhNumbers3 = cardNumber.substring(10,14);
		
		//translating sets of numbers from one string to three different groups
		int sum1 = 0, sum2 = 0, sum3 = 0;
		i=0;
		while(i<setOhNumbers1.length())
		{
				sum1 +=Integer.parseInt(setOhNumbers1.substring(i, ++i));
		}
		i=0;
		while(i<setOhNumbers2.length())
		{
				sum2 +=Integer.parseInt(setOhNumbers2.substring(i, ++i));
		}
		i = 0;
		while(i<setOhNumbers3.length())
		{
				sum3 +=Integer.parseInt(setOhNumbers3.substring(i, ++i));
		}
		
		//finding the total sum.
		int totalSum;
		totalSum=sum1+sum2+sum3;
		
		//checking to see if the total sum is divisible by 4. Step 4
		if (totalSum%4!=0)
		{
			System.out.println("Error code No. 4");
			valid = valid+1;
		}
		//finding that the first four digits are one less than the last four digits
		int conditionalSum1 = sum3-1;
		if (conditionalSum1 != sum1)
		{
			System.out.println("Error code No. 5");
			valid = valid+1;
		}
		
		int firstDoubleDigit = new Integer(Integer.parseInt(cardNumber.substring(0,2)));
		int secondDoubleDigit = new Integer(Integer.parseInt(cardNumber.substring(7,9)));
		if (firstDoubleDigit + secondDoubleDigit != 100)
		{
			System.out.println("Error code No. 6");
			valid = valid+1;
		}
		if (valid == 0)
		{
			System.out.println("Credit Card Number Valid");
		}
	}
}

