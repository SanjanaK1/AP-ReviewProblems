import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;
import java.util.*;

public class Problem1
{
	public static void main(String args[])
	{
		File name = new File("Prob1Input.txt");

		
		ArrayList<Integer> data;
		//int[] data;
		ArrayList<ArrayList<Integer>> dataSets = new ArrayList<ArrayList<Integer>>();
		
		try
		{
			BufferedReader input = new BufferedReader(new FileReader(name));

			String text,output="";
				
			
			while( (text=input.readLine())!= null)
			{
				//System.out.println(text);
				StringTokenizer st = new StringTokenizer(text);
				
				int counter = 0;
				data = new ArrayList<Integer>();
				
				while (st.hasMoreTokens())
				{
					data.add(new Integer(st.nextToken()));
				}
				//printArrayList(data);
				
				dataSets.add(data);
				//output+=text;
			}
			
			//printArrayList(dataSets);
			
		}
		catch (IOException io)
		{
			System.err.println("File does not exist");
		}
		
		int numberOfSets = dataSets.size();
		int c = 0;
		
		while (c+3 <= numberOfSets) {
			data  = dataSets.get(c);
			ArrayList<Integer> data2, data3, results;
			data2 = dataSets.get(c+1);
			data3 = dataSets.get(c+2);
			results = new ArrayList<Integer>();
			
			System.out.print("Set 1: ");
			printArrayList(data);
			System.out.print("Set 2: ");
			printArrayList(data2);
			System.out.print("Set 3: ");
			printArrayList(data3);
			
					
			for (Integer i: data) {
				if (data2.contains(i) && data3.contains(i)) 
					results.add(i) ;
			}
			
			Collections.sort(results);
			
			System.out.print("Intersection Of Sets: ");
			printArrayList(results);
			
			c = c+3;
		}
		
	}
	
	
	public static void printArrayList(ArrayList<Integer> x) {
		
		System.out.print("{");
		for(int i = 0; i < x.size(); i++ ) {
            System.out.print(x.get(i));
           if (i != x.size()-1) 
        	   System.out.print(", ");
        }
		System.out.print("} \n");
	}
	
}