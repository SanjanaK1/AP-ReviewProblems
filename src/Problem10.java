import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;


public class Problem10
{
	public static void main(String args[])
	{
		File name = new File("Prob10Input.txt");

		try
		{
			BufferedReader input = new BufferedReader(
									 new FileReader(name));

			String text,output="";
			
			String[][] noteLetters = { {"E","A","D","G","B","E"} , {"F","A#","D#","G#","C","F"} , { "G", "C", "F", "A#", "D", "G"} , {"G#","C#","F#","B","D#","G#"} };          
			
			String [] everyNote = {"G#","G","F#","F","E","D#","D","C#","C","B", "A#", "A", "G#", "G", "F#", "F", "E", "D#", "D", "C#", "C", "B", "A#", "A", "G#", "G", "F#", "F", "E"};
			
			int[][] positions = {{28,23,18,13,9,4} , {27,22,17,12,8,3} , {26,21,16,11,7,2} , {25,20,15,10,6,1} , {24,19,14,9,5,0}};
			//int array for positions has an s - so i don't get confused
			int f = 0;
			String [][] position = new String[0][0];
			int r = 0;
			
			while( (text=input.readLine())!= null)
			{
				String[] measures = text.split(","); 
				int countingMeasures = measures.length;
				
				if(f == 0)
				{
					position = new String[30][countingMeasures];
					System.out.print("Measure\t");
					for(int x=0;x<= countingMeasures;x++)
					{
						System.out.print("\t"+x);
					}
					System.out.print("\n");
				}
				f = 1;
				for(int y =0;y<countingMeasures;y++)
				{
					for(int z = 0;z<6;z++)
					{
						int rposition = positions[r][z];
						
						if(measures[y].charAt(z) == '*'|| measures[y].charAt(z) == 'o')
							position[rposition][y] = "O";
						else
							position[rposition][y] = " ";
					}
				}
				
				r++;
				
			}
			
			for(int x=0;x<position.length;x++)
			{
				if(x==29)
					break;
				else
					System.out.print(everyNote[x] + "\t");
				
				for(int y =0;y<position[0].length;y++)
				{
					System.out.print("\t"+position[x][y]);
				}
				System.out.print("\n");
			}
			
			
			
		}
		catch (IOException io)
		{
			System.err.println("File does not exist");
		}
	}
}
