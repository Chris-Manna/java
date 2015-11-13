public class SodaCan
{ 
	//class SodaCan constructor can access these variables. 
	//The user cannot.
	private double canHeight;
	private double canRadius;
	
	//other classes can use this to change the variables 
	//into constructor variables. 
	public SodaCan(double height , double diameter)
	{
		canHeight = height;
		canRadius = diameter/2;
	}
	public double getVolume()
	{
		return Math.PI*canRadius*canRadius*canHeight;
	}
	
	public double getSurfaceArea()
	{
		return Math.PI*canRadius*2*canRadius+Math.PI*canRadius*2*canHeight;
	}
}
