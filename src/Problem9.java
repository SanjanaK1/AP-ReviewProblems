import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;
import java.util.*;


public class Problem9
{
	public static void main(String args[])
	{
		File name = new File("Prob9Input.txt");
		ArrayList<Integer> inputList = new ArrayList<Integer>();

		try
		{
			BufferedReader input = new BufferedReader(
									 new FileReader(name));

			String text,output="";
			while( (text=input.readLine())!= null)
			{
				//System.out.println(text);
				output+=text;
				inputList.add(new Integer(text).intValue());
				
				
			}
			for(int x:inputList) {
				
				String [][] arr = new String[x][x] ;
				int sr = 0;
				int er = x -1;//inputList.get(0) - 1;
				int sc = 0;
				int ec = x-1;//inputList.get(0) - 1;
				fillPattern(arr);
				//printPattern(arr);
				
				while(sr<=er && sc<=ec)
				{
					for (int i = sc; i <= ec; i++) //going right
						arr[sr][i] = "*";					
					sr++;
					
					if(x==2) sc++; 
					 else if (sc!=0) sc++;
						
					
					for (int j = sr; j<= er ; j++) //going down
						arr[j][ec] = "*";					
					ec--;
					sr++;
					
					
					for (int k = ec; k>= sc; k--) // going left
						arr[er][k] = "*";
					er--;
					
					
					
					for (int l = er; l >= sr; l--) //going up
						arr[l][sc] = "*";
					sc++;
					ec--;
					er--;
					
					
					
				}
				
				printPattern(arr);
			}
			
			
			
		}
		catch (IOException io)
		{
			System.err.println("File does not exist");
		}
	}
	
	public static void printPattern(String[][] arr) {
		
		for (int i =0 ; i < arr[0].length; i++) {
			for(int j=0; j< arr.length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
		System.out.println();System.out.println();
	}
	
	public static void fillPattern(String[][] arr) {
		
		for (int i =0 ; i < arr[0].length; i++) {
			for(int j=0; j< arr.length;j++)
				arr[i][j] = "-";
			
		}
	}
	
}
