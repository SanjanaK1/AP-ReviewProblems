import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class Problem8
{
	public static void main(String args[])
	{
		File name = new File("Prob8Input.txt");
		ArrayList<String> inputList = new ArrayList<String>();
		Date date = new Date();

		try
		{
			BufferedReader input = new BufferedReader(
									 new FileReader(name));

			String text,output="";
			while( (text=input.readLine())!= null)
			{
				inputList.add(text);
				
			}

		    //System.out.println(calendar.getTime());
			
			for(int x=0;x<inputList.size();x++)
			{
				SimpleDateFormat dateFormatter = new SimpleDateFormat("hh:mm a 'on' MM/dd/yyyy");
				date = new Date();
						
				System.out.println("Trip "+(x+1)+": ");
				System.out.println("Departure Date and Time: "+dateFormatter.format(date));
				
				
				long days = new Long(inputList.get(x).split(" ")[0]).longValue()*86400000;  //time in milliseconds
				long hour = new Long(inputList.get(x).split(" ")[1]).longValue()*3600000;
				long minute = new Long(inputList.get(x).split(" ")[2]).longValue()*60000;
				
				Date newDate = new Date(date.getTime()+days+hour+minute);

				System.out.println("Arrival Date and Time: "+dateFormatter.format(newDate));
				System.out.println();
			}
			
		}
		catch (IOException io)
		{
			System.err.println("File does not exist");
		}
	}
}