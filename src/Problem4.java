import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;
import java.util.*;


public class Problem4
{
	static ArrayList<String> inputList = new ArrayList<String>();
	
	public static void main(String args[])
	{
		File name = new File("Prob4Input.txt");
		int counter=0;

		try
		{
			BufferedReader input = new BufferedReader(
									 new FileReader(name));

			String text,output="";
			while( (text=input.readLine())!= null)
			{
				inputList.add(text);
				
				//System.out.println(text);
				//output+=text;
				/*if(counter == 0)
					System.out.println("Code: "+text);
				counter++;
				if(counter == 1)
					System.out.println("Guess: "+text); */		
			}
			//printArrayList(inputList);
			
			for(int x=0;x<inputList.size();x+=2)
			{
			String code = inputList.get(x);
			String guess = inputList.get(x+1);
			System.out.println("Code: "+code);
			System.out.println("Guess: "+guess);
			
			
			int correctlyPlaced=0;
			int incorrectlyPlaced=0;
			
			
			
			for(int y=0;y<guess.length();y++)
			{
				char guess1 = guess.charAt(y);
				int index = code.indexOf(guess1);
				//System.out.println("guess1 "+guess1);
				if(index == -1) {
					//System.out.println("Not in Sequence");
				}
				else
				{
					//System.out.println("Is in sequence at "+index); 
					if(index==y)
						correctlyPlaced+=1;
					else 
						incorrectlyPlaced+=1;
					
					StringBuffer newCode = new StringBuffer(code);
					
					newCode.replace(index,index+1,"*");
					code = newCode.toString();
					//System.out.println("New Code"+code);
					//code.indexOf(index)
					
					
				}	
			}
			
			
			
			System.out.println("Correctly Placed: "+correctlyPlaced);
			System.out.println("Incorrectly Placed: "+incorrectlyPlaced);
			
			
			
			}
		}
			
				
			
		
		catch (IOException io)
		{
			System.err.println("File does not exist");
		}
	}
	
	public static void printArrayList(ArrayList<String> x) 
	{
		for(int i = 0; i < x.size(); i++ ) {
            System.out.println(x.get(i));
        }
		
	
}
}