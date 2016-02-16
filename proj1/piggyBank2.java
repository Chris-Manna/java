//welcome to program piggyBank.
import java.util.Scanner; // Importing ability to get info from user

public class piggyBank2 //establishing the class of our program
{ //Header
  public static void main(String args [])
  {
	//introduce user to awesomeness of program piggyBank
	System.out.println("Welcome to piggyBank!");
	
	//prompt user for variable values
	Scanner inputPennies = new Scanner(System.in);
	System.out.print("Please enter the number of pennies you would like to deposit: ");
	int pennies;
	pennies = inputPennies.nextInt();
	
	Scanner inputNickels = new Scanner(System.in);
	System.out.print("Please enter the number of nickels you would like to deposit: ");
	int nickels;
	nickels = inputNickels.nextInt();
	nickels = 5*nickels;

	Scanner inputDimes = new Scanner (System.in);
	System.out.print("Please enter the number of dimes you would like to deposit: ");
	int dimes;
	dimes = inputDimes.nextInt();
	dimes = 10*dimes;
	
	Scanner inputQuarters = new Scanner(System.in);
	System.out.print("Please enter the number of quarters you would like to deposit: ");
	int quarters;
	quarters = inputQuarters.nextInt();
	quarters = 25*quarters;

	//Now do calculations
	int totalAmount;
	int dollarRemainder;
	totalAmount = pennies+nickels+quarters;
	int dollarAmount = totalAmount/100;
	dollarRemainder = totalAmount%100;

	//Now present reults
	System.out.print("That's " + quarters + " cents in quarters, ");
	System.out.println(dimes + " cents in dimes, ");
	System.out.print(nickels + " cents in nickels, and "+ pennies);
	System.out.println(" cents in pennies.");
	
	System.out.print("In total you have " + totalAmount);
	System.out.println(" cents.");
	System.out.print("That's " + dollarAmount + " dollars and ");
	System.out.println(dollarRemainder + " cents.");
	System.out.println("Thank you for using PiggyBank2");
	System.out.print("I hope this isn't your retirement fund.");
	} //end main method
} //end class
