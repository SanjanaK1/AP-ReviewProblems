import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;


public class Problem6
{
	public static void main(String args[])
	{
		
		File name = new File("Prob6Input.txt");

		try
		{
			BufferedReader input = new BufferedReader(
									 new FileReader(name));

			String text,output="";
			while( (text=input.readLine())!= null)
			{
				//System.out.println(text);
				
				int top = 1;
				int north = 2;
				int south = 5;
				int west = 3;
				int east = 4;
				int bottom = 6;
				
				for(int x=0;x<text.length();x++)
				{
					if(text.substring(x,x+1).equals("N"))
					{
						int tempTop = top;
						int tempNorth = north;
						int tempBottom = bottom;
						top = south;
						north = tempTop;
						bottom = tempNorth;
						south = tempBottom;
					}
					
					if(text.substring(x,x+1).equals("E"))
					{
						int tempTop = top;
						int tempEast = east;
						int tempBottom = bottom;
						
						top = west;
						east = tempTop;
						bottom = tempEast;
						west = tempBottom;
					}
					
					
					if(text.substring(x,x+1).equals("S"))
					{
						int tempTop = top;
						int tempSouth = south;
						int tempBottom = bottom;
						
						top = north;
						south = tempTop;
						bottom = tempSouth;
						north = tempBottom;
					}
					
					if(text.substring(x,x+1).equals("W"))
					{
						int tempTop = top;
						int tempWest = west;
						int tempBottom = bottom;
						
						top = east;
						west = tempTop;
						bottom = tempWest;
						east = tempBottom;
					}
					
					/*System.out.println(text.substring(x,x+1));
					System.out.println("t: "+top);
					System.out.println("b: "+bottom);
					System.out.println("n: "+north);
					System.out.println("s: "+south);
					System.out.println("e: "+east);
					System.out.println("w: "+west);
					System.out.println(); */
				}
				System.out.println(top);
			}
			
		}
		catch (IOException io)
		{
			System.err.println("File does not exist");
		}
	}
}