import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;
import java.util.*;

public class Problem2
{
	
	static ArrayList<BigInteger> lucasNumbers = new ArrayList<BigInteger>();
	
	public static void main(String args[])
	{
		File name = new File("Prob2Input.txt");
		

		try
		{
			BufferedReader input = new BufferedReader(new FileReader(name));

			String text,output="";
			
			
			while( (text=input.readLine())!= null)
			{
				lucasNumbers = new ArrayList<BigInteger>();
				lucasNumbers.add(new BigInteger("2"));
				lucasNumbers.add(new BigInteger("1"));
				//System.out.println("text "+text);
				//System.out.print(text +"----");
				//output+=text;
				//BigInteger x = new BigInteger(text);
				//System.out.println(x);
				
				int n = new Integer(text).intValue();
				System.out.println("n "+n);
				for(int x=0;x<n;x++)
				{
					BigInteger a = lucasNumbers.get(x);
					BigInteger b = lucasNumbers.get(x+1);
					BigInteger c = a.add(b);
					lucasNumbers.add(c);
					
				}
				System.out.println(lucasNumbers.get(n));
			}
		}
		catch (IOException io)
		{
			System.out.println("File does not exist");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Error");
		}
	}
	
	
	/*public static BigInteger returnLucas(int n)
	{	
		if (lucasNumbers.size() >= n+1  && (!lucasNumbers.get(n).equals(BigInteger.ZERO)) )
				return lucasNumbers.get(n);
		
		//if(n == 0)
		//return new BigInteger("2");
		//else if(n == 1)
		//	return BigInteger.ONE;
		//else 
		//{
			//System.out.println("calling for "+ n);	
			
		BigInteger x =  returnLucas(n-1).add(returnLucas(n-2));
		lucasNumbers.add(x);
		return x;
		//}
	}*/
}
	
