import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class Main here.
 * 
 * @author (Christopher G Manna) 
 * @version (11/21/11)
 */
public class Main
{
    // instance variables - replace the example below with your own
    private String keyWord;
    private Scanner userInput;
    private String alphRev;
    private String newAlph;
    private String adjustedAlphRev;
  public static void main(String[] args) throws IOException
  {
    File inFile = new File(args[0]);
    Scanner input = new Scanner(inFile);
    Encrypt() e = new Encrypt();
    input.crypting();
    
    PrintWriter output = new PrintWriter(args[1]);
    while(input.hasNext())
    {
      keyWord=input.next();
      output.print(keyWord);
    }
      output.close();
  }
}
