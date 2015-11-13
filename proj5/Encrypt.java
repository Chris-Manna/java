/**
 * Encrypts the message.
 * 
 * @author (Christopher G Manna) 
 * @version (11/21/11)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Encrypt
{
    // instance variables - replace the example below with your own
    private String alphReverse;
    private String keyWord;
    private String alphCode;
    private String alphReg;
    private ArrayList message;
    private ArrayList alphRegular;
    private ArrayList alphCoder;
    private int i;
    private int j;
    private String messageString;

    /**
     * Constructor for objects of class Encrypt
     */
    public Encrypt()
    {
       // initialise instance variables
       alphReverse="ZYXWVUTSRQPONMLKJIHGFEDCBA";
       alphReg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private String NoDoubles()
    {
        for (i=0;i<keyWord.length();i++)
        {
            for (j=i+1;j<keyWord.length()-i;j++)
            {
                if (keyWord.substring(i,i+1).equals(keyWord.substring(j,j+1)))
                    keyWord = keyWord.substring(0,j) + keyWord.substring(j+1);
            }
        }
        alphCode = keyWord+alphReverse;
        for (i=0;i<alphCode.length();i++)
        {
            for(j=i+1;j<alphCode.length()-i;j++)
            {
                if (alphCode.substring(i,i+1).equals(alphCode.substring(j,j+1)))
                    alphCode = alphCode.substring(0,j)+alphCode.substring(j+1);
            }
        }//gets rid of duplicates in both Strings. 
        return alphCode;
        
    }
    private String Crypting()
    {
        NoDoubles();
        for (i=0;i<messageString.length();i++)
        {
            message.add(messageString.substring(i,i+1));
        }
        
        for (i=0;i<alphCode.length();i++)
        {
            alphCoder.add(alphCode.substring(i,i+1));
        }
        
        for (i=0;i<alphCode.length();i++)
        {
            alphRegular.add(alphReg.substring(i,i+1));
            alphCoder.add(alphCode.substring(i,i+1));
        }
        
        for (i=0;i<message.size();i++)
        {
            for (j=0;j<alphRegular.size();j++)
            {
               if (message.get(i)==alphRegular.get(j))
               {
                   message.get(i) = alphCoder.get(j);
                }
            }
        }
        return message;
    }
}
