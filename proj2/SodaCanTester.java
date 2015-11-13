import javax.swing.JOptionPane;

/**
 * Welcome to program SodaCanTester
 * Christopher G Manna
 * UNI: cgm2127
 * Constructors for SodaCanTester 
 * Version: 2.0 
 * Mission: Success
 * 
 */

public class SodaCanTester {
	static double h,d,volume,surfaceArea;
	static String h1,d1,volume1,surfaceArea1;
	public static void main(String[] args){
		
		//First input value and safe conversion
		do{
			d1 = JOptionPane.showInputDialog("Enter a valid diameter in cm of your Soda Can");
			d= Integer.parseInt(d1);
		}while (d<=0);
		
		//Second input value and safe conversion
		do{
			h1 = JOptionPane.showInputDialog("Enter the height in cm of your Soda Can");
			h = Integer.parseInt(h1);
		}while (h<=0);
		
		//Passing parameters  to class myCan
		SodaCan myCan = new SodaCan(h,d);
		
		//calling the method, declaring String variables, inputting them into the text boxes.
		volume1 ="The volume of your soda can is: " + myCan.getVolume() + " cm^3.";
		surfaceArea1 = "the surface area of your soda can is: "+myCan.getSurfaceArea()+" cm^2.";
		JOptionPane.showMessageDialog(null, 
				volume1, "Volume", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, 
				surfaceArea1, "Can's Surface Area",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null ,
				"Thank you for using this program", "Farewell!", JOptionPane.PLAIN_MESSAGE);
	}
}
