/*
*
*/
public class Computer {
    
    private int response1;
    private int response2;
    private int response3;
    private int response4;
    private int n=9;
    private String compLoc1;
    private String compLoc2;
    private String compLoc3;
    private String compLoc4;
    private String compLocT;
	
    public Computer()
    {
    chance();
    }
    private void chance() 
    {//writing the four random digits the computer has to supply
    	do
    			{
    	response1 = (int) (Math.random()*n);
    	response2 = (int) (Math.random()*n);
    	response3 = (int) (Math.random()*n);
    	response4 = (int) (Math.random()*n);

    	compLoc1 = Integer.toString(response1);
    	compLoc2 = Integer.toString(response2);
    	compLoc3 = Integer.toString(response3);
    	compLoc4 = Integer.toString(response4);
    			}
    	while (compLoc1.equals(compLoc2)||compLoc1.equals(compLoc3)||compLoc1.equals(compLoc4)||
    			compLoc2.equals(compLoc3)||compLoc2.equals(compLoc4)||
    			compLoc3.equals(compLoc4));
    	compLocT = compLoc1+compLoc2+compLoc3+compLoc4;
    }
    public String getAnswer()
    
    {//returns simple computer answer
    	chance();
	return compLocT;
    }
}
