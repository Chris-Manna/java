/*Welcome to the application euclidAlgorithm where all your 
mathematical GCD dreams come true!*/
//
// Christopher G Manna
//
/*This is my code*/

import java.util.Scanner;

//introducing class type
public class euclidAlgorithm2
{
  public static void main(String[] args)
  {
	  	
	//welcome user to the awesomeness of euclidAlgorithm
	System.out.print("Holla fool, welcome to application ");
	System.out.println("euclidAlgorithm!");

        //collect user input
	System.out.println("Please enter your first integer value: ");
	Scanner userInput1 = new Scanner(System.in);
	int firstValue = userInput1.nextInt();

                //protecting against negative values
         while (firstValue <= 0)
          {
                System.out.print("Can't find GCD when value is less ");
		System.out.println("than or equal to zero. Please ");
		System.out.println("re-enter your first value.");
		firstValue = userInput1.nextInt();
          }
	//Prompt user for next value to collect ALL-A-DAT user input
	System.out.print("Please enter a second integer value");
	System.out.println(" greater than zero.");
	Scanner userInput2 = new Scanner(System.in);
	int secondValue = userInput2.nextInt();

	while (secondValue <=0)
          	  {
                System.out.print("Can't find GCD when value is less ");
                System.out.println("than or equal to zero. Please ");
		System.out.println("re-enter your second value.");
		secondValue = userInput2.nextInt();
		  }

		//introduce new terminology
		int i = 0;
		int j = 0;

		//Evaluate which value of the two is larger
		if (firstValue == secondValue)
		  {
			System.out.println(firstValue + " is it's own GCD");
		  }
		if (firstValue>secondValue)
		  {
			i = firstValue; //notation from the book
			j = secondValue; //notation from the book
			System.out.print("The larger of the two values is: ");
			System.out.println(i);
			System.out.print("The smaller of the two values is: ");
			System.out.println(j);
		  }
		if (firstValue<secondValue)
		  {
			i = secondValue;
                        j = firstValue;
			System.out.print("The larger of the two values is: ");
			System.out.println(i);
			System.out.print("The smaller of the two values is: ");
			System.out.println(j);
		  }
	int temp = 0;
		while (j>0)
		  {
			temp = (i%j);
			i = j;
			j = temp;
		  }
		System.out.println("Your GCD is: " + i);
		System.out.println("Come back anytime!");
  }
}
