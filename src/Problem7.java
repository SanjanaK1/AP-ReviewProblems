import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;
import java.text.DecimalFormat;
import java.util.*;

public class Problem7
{
	
	public static void main(String args[])
	{
		DecimalFormat dec = new DecimalFormat("#0.00");
		
		ArrayList<String> inputList = new ArrayList<String>();
		
		File name = new File("Prob7Input.txt");

		try
		{
			BufferedReader input = new BufferedReader(
									 new FileReader(name));

			String text,output="";
			int x=0;
			while( (text=input.readLine())!= null)
			{
				//System.out.println(text);
				output+=text;
				inputList.add(text.split(" ")[1]);
				/*
					inputList.set(x, inputList.get(x).substring(inputList.get(x).indexOf(" ")+1));
						
				*/
				x++;
				if(x==5)
				{
					double fee = (100.0 - new Double(inputList.get(2)).doubleValue())/100.0;
					double fee2 = (100.0 - new Double(inputList.get(4)).doubleValue())/100.0;
					double dollars = new Double(inputList.get(0)).doubleValue()*fee;
					double dollars2 = new Double(inputList.get(0)).doubleValue()*fee2;
					double booth1 = new Double(inputList.get(1)).doubleValue() * dollars;
					double booth2 = new Double(inputList.get(3)).doubleValue() * dollars2;
					
					System.out.println("Booth1: "+ dec.format(booth1)+" euros");
					System.out.println("Booth2: "+ dec.format(booth2)+" euros");
					//System.out.println(fee+" "+fee2);
					
					int which = booth1>booth2 ? 1 : 2;
	
					System.out.println("Booth " + which + " is the best; difference is "+dec.format(Math.abs(booth2-booth1)));
					System.out.print("\n");
					

					
					x=0;
					inputList = new ArrayList<String>();
				}
				
			}
			//System.out.println(inputList);
			
			
		}
		catch (IOException io)
		{
			System.err.println("File does not exist");
		}
	}
}
