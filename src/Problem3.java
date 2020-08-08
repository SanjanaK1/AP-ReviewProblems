import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;
import java.util.*;


public class Problem3
{
	static ArrayList<Integer> list1 = new ArrayList<Integer>();
	static ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	public static void main(String args[])
	{
		File name = new File("Prob3Input.txt");

		try
		{
			BufferedReader input = new BufferedReader(
									 new FileReader(name));

			String text,output="";
			while( (text=input.readLine())!= null)
			{
				//System.out.println(text);
				//output+=text;
				StringTokenizer st = new StringTokenizer(text);
				int num1 = new Integer(st.nextToken()).intValue();
				int num2 = new Integer(st.nextToken()).intValue();
				//boolean isAmicable = isAmicable(num1,num2);
				System.out.println();
				int sum1 = getSumOfFactors(num1,list1);
				int sum2 = getSumOfFactors(num2, list2);
				if(sum1 == num2 && sum2 == num1)
					System.out.print("The numbers "+num1+" "+num2+" are amicable."); 
				else 
					System.out.print("The numbers "+num1+" "+num2+" are not amicable."); 
				System.out.println();
				System.out.print("The factors of "+num1+" are ");
				printArrayList(list1);
				System.out.print(" Sum is "+sum1+".");
				System.out.println();
				
				System.out.print("The factors of "+num2+" are ");
				printArrayList(list2);
				
				System.out.print(" Sum is "+sum2+".\n");
				
				list1.removeAll(list1);
				list2.removeAll(list2);
			}
		}
		catch (IOException io)
		{
			System.err.println("File does not exist");
		}
	}
	
	
	public static void printArrayList(ArrayList<Integer> x) 
	{
		for(int i = 0; i < x.size(); i++ ) {
            System.out.print(x.get(i));
            if(i == x.size()-2)
         	   System.out.print(" and ");
            else if (i != x.size()-1) 
        	   System.out.print(", ");  
        }
		
	}
	
	public static int getSumOfFactors(int num1, ArrayList<Integer> list1)
	{
		int sum =0;
		for(int x = 1; x < num1; x++)
		{
			if(num1%x == 0)
				list1.add(x);
		}
		
		//int sum1 = getSum(list1);
		
		for(Integer i: list1)
		{
			sum+=i.intValue();
		}
		
		return sum;
		
	}
	
}