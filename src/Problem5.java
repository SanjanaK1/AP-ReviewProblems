import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;
import java.util.*;


public class Problem5
{
	public static void main(String args[])
	{
		ArrayList<String> modelList = new ArrayList<String>();
		ArrayList<Double> mpgList = new ArrayList<Double>();
		ArrayList<Double> cylList = new ArrayList<Double>();
		ArrayList<Double> disList = new ArrayList<Double>();
		ArrayList<Double> horseList = new ArrayList<Double>();
		ArrayList<Double> weightList = new ArrayList<Double>();
		ArrayList<Double> accList = new ArrayList<Double>();
		ArrayList<Double> yearList = new ArrayList<Double>();

		File name = new File("Prob5Input.txt");

		try
		{
			BufferedReader input = new BufferedReader(
									 new FileReader(name));

			String text,output="";
			text=input.readLine();
			while( (text=input.readLine())!= null)
			{
				//System.out.println(text);
				String[] s = text.split("\t");   //(" ");

				modelList.add(s[0]);
				mpgList.add(new Double(s[1]).doubleValue());
				cylList.add(new Double(s[2]).doubleValue());
				disList.add(new Double(s[3]).doubleValue());
				try {
					horseList.add(new Double(s[4]).doubleValue());
				}catch (Exception e)
				{
					//horseList.(-1.0);  //problematic for finding minimum
				}
				weightList.add(new Double(s[5]).doubleValue());
				accList.add(new Double(s[6]).doubleValue());
				yearList.add(new Double(s[7]).doubleValue());


			}
			//System.out.println(modelList);
			//System.out.println(mpgList);

			ArrayList<Double> mpgList2 = (ArrayList<Double>) mpgList.clone();

			System.out.println("Highest Mpg:\t\t\t\tLowest Mpg:\n");
			int maxPositionofMpg = maxNumber(mpgList);
			System.out.print(modelList.get(maxPositionofMpg)+"\t\t"+mpgList.get(maxPositionofMpg));
			mpgList.set(maxPositionofMpg, -1.0);

			int minPositionofMpg = minNumber(mpgList2);
			System.out.println("\t\t"+modelList.get(minPositionofMpg)+"\t"+mpgList.get(minPositionofMpg));
			mpgList2.set(minPositionofMpg, 1000000.0);

			maxPositionofMpg = maxNumber(mpgList);
			System.out.print(modelList.get(maxPositionofMpg)+"\t"+mpgList.get(maxPositionofMpg));
			mpgList.set(maxPositionofMpg, -1.0);

			minPositionofMpg = minNumber(mpgList2);
			System.out.println("\t\t"+modelList.get(minPositionofMpg)+"\t"+mpgList.get(minPositionofMpg));
			mpgList2.set(minPositionofMpg, 1000000.0);

			maxPositionofMpg = maxNumber(mpgList);
			System.out.print(modelList.get(maxPositionofMpg)+"\t"+mpgList.get(maxPositionofMpg));

			minPositionofMpg = minNumber(mpgList2);
			System.out.println("\t\t"+modelList.get(minPositionofMpg)+"\t"+mpgList.get(minPositionofMpg));

			ArrayList<Double> cylList2 = (ArrayList<Double>) cylList.clone();

			System.out.println("\nHighest Cylinders:\t\t\tLowest Cylinders:\n");
			int maxPositionofCyl = maxNumber(cylList);
			System.out.print(modelList.get(maxPositionofCyl)+""+cylList.get(maxPositionofCyl));
			cylList.set(maxPositionofCyl, -1.0);

			int minPositionofCyl = minNumber(cylList2);
			System.out.println("\t\t"+modelList.get(minPositionofCyl)+"\t"+cylList.get(minPositionofCyl));
			cylList2.set(minPositionofCyl, 1000000.0);

			maxPositionofCyl = maxNumber(cylList);
			System.out.print(modelList.get(maxPositionofCyl)+"\t"+cylList.get(maxPositionofCyl));
			cylList.set(maxPositionofCyl, -1.0);

			minPositionofCyl = minNumber(cylList2);
			System.out.println("\t\t"+modelList.get(minPositionofCyl)+"\t"+cylList.get(minPositionofCyl));
			cylList2.set(minPositionofCyl, 1000000.0);

			maxPositionofCyl = maxNumber(cylList);
			System.out.print(modelList.get(maxPositionofCyl)+"\t"+cylList.get(maxPositionofCyl));

			minPositionofCyl = minNumber(cylList2);
			System.out.println("\t\t"+modelList.get(minPositionofCyl)+"\t"+cylList.get(minPositionofCyl));

			ArrayList<Double> disList2 = (ArrayList<Double>) disList.clone();

			System.out.println("\nHighest Displacement:\t\t\tLowest Displacement:\n");
			int maxPositionofDis = maxNumber(disList);
			System.out.print(modelList.get(maxPositionofDis)+"\t"+disList.get(maxPositionofDis));
			disList.set(maxPositionofDis, -1.0);

			int minPositionofDis = minNumber(disList2);
			System.out.println("\t\t"+modelList.get(minPositionofDis)+"\t"+disList.get(minPositionofDis));
			disList2.set(minPositionofDis, 1000000.0);

			maxPositionofDis = maxNumber(disList);
			System.out.print(modelList.get(maxPositionofDis)+"\t"+disList.get(maxPositionofDis));
			disList.set(maxPositionofDis, -1.0);

			minPositionofDis = minNumber(disList2);
			System.out.println("\t\t"+modelList.get(minPositionofDis)+"\t"+disList.get(minPositionofDis));
			disList2.set(minPositionofDis, 1000000.0);

			maxPositionofDis = maxNumber(disList);
			System.out.print(modelList.get(maxPositionofDis)+""+disList.get(maxPositionofDis));

			minPositionofDis = minNumber(disList2);
			System.out.println("\t\t"+modelList.get(minPositionofDis)+"\t"+disList.get(minPositionofDis));


			ArrayList<Double> horseList2 = (ArrayList<Double>) horseList.clone();

			System.out.println("\nHighest Horsepower:\t\t\tLowest Horsepower:\n");
			int maxPositionofHorse = maxNumber(horseList);
			System.out.print(modelList.get(maxPositionofHorse)+"\t"+horseList.get(maxPositionofHorse));
			horseList.set(maxPositionofHorse, -1.0);

			int minPositionofHorse = minNumber(horseList2);
			System.out.println("\t\t"+modelList.get(minPositionofHorse)+"\t"+horseList.get(minPositionofHorse));
			horseList2.set(minPositionofHorse, 1000000.0);

			maxPositionofHorse = maxNumber(horseList);
			System.out.print(modelList.get(maxPositionofHorse)+"\t"+horseList.get(maxPositionofHorse));
			horseList.set(maxPositionofHorse, -1.0);

			minPositionofHorse = minNumber(horseList2);
			System.out.println("\t\t"+modelList.get(minPositionofHorse)+"\t\t"+horseList.get(minPositionofHorse));
			horseList2.set(minPositionofHorse, 1000000.0);

			maxPositionofHorse = maxNumber(horseList);
			System.out.print(modelList.get(maxPositionofHorse)+""+horseList.get(maxPositionofHorse));

			minPositionofHorse = minNumber(horseList2);
			System.out.println("\t\t"+modelList.get(minPositionofHorse)+"\t"+horseList.get(minPositionofHorse));





			ArrayList<Double> weightList2 = (ArrayList<Double>) weightList.clone();

			System.out.println("\nHighest Weight:\t\t\t\tLowest Weight:\n");
			int maxPositionofWeight = maxNumber(weightList);
			System.out.print(modelList.get(maxPositionofWeight)+"\t"+weightList.get(maxPositionofWeight));
			weightList.set(maxPositionofWeight, -1.0);

			int minPositionofWeight = minNumber(weightList2);
			System.out.println("\t\t"+modelList.get(minPositionofWeight)+"\t"+weightList.get(minPositionofWeight));
			weightList2.set(minPositionofWeight, 1000000.0);

			maxPositionofWeight = maxNumber(weightList);
			System.out.print(modelList.get(maxPositionofWeight)+"\t"+weightList.get(maxPositionofWeight));
			weightList.set(maxPositionofWeight, -1.0);

			minPositionofWeight = minNumber(weightList2);
			System.out.println("\t\t"+modelList.get(minPositionofWeight)+"\t"+weightList.get(minPositionofWeight));
			weightList2.set(minPositionofWeight, 1000000.0);

			maxPositionofWeight = maxNumber(weightList);
			System.out.print(modelList.get(maxPositionofWeight)+"\t"+weightList.get(maxPositionofWeight));

			minPositionofWeight = minNumber(weightList2);
			System.out.println("\t\t"+modelList.get(minPositionofWeight)+"\t"+weightList.get(minPositionofWeight));


			ArrayList<Double> accList2 = (ArrayList<Double>) accList.clone();

			System.out.println("\nHighest Acceleration:\t\t\tLowest Acceleration:\n");
			int maxPositionofAcc = maxNumber(accList);
			System.out.print(modelList.get(maxPositionofAcc)+"\t\t"+accList.get(maxPositionofAcc));
			accList.set(maxPositionofAcc, -1.0);

			int minPositionofAcc = minNumber(accList2);
			System.out.println("\t\t"+modelList.get(minPositionofAcc)+"\t"+accList.get(minPositionofAcc));
			accList2.set(minPositionofAcc, 1000000.0);

			maxPositionofAcc = maxNumber(accList);
			System.out.print(modelList.get(maxPositionofAcc)+"\t\t"+accList.get(maxPositionofAcc));
			accList.set(maxPositionofAcc, -1.0);

			minPositionofAcc = minNumber(accList2);
			System.out.println("\t\t"+modelList.get(minPositionofAcc)+"\t"+accList.get(minPositionofAcc));
			accList2.set(minPositionofAcc, 1000000.0);

			maxPositionofAcc = maxNumber(accList);
			System.out.print(modelList.get(maxPositionofAcc)+"\t"+accList.get(maxPositionofAcc));

			minPositionofAcc = minNumber(accList2);
			System.out.println("\t\t"+modelList.get(minPositionofAcc)+"\t"+accList.get(minPositionofAcc));



			ArrayList<Double> yearList2 = (ArrayList<Double>) yearList.clone();

			System.out.println("\nHighest Year:\t\t\t\tLowest Year:\n");
			int maxPositionofYear = maxNumber(yearList);
			System.out.print(modelList.get(maxPositionofYear)+"\t\t"+yearList.get(maxPositionofYear));
			yearList.set(maxPositionofYear, -1.0);

			int minPositionofYear = minNumber(yearList2);
			System.out.println("\t"+modelList.get(minPositionofYear)+"\t"+yearList.get(minPositionofYear));
			yearList2.set(minPositionofYear, 1000000.0);

			maxPositionofYear = maxNumber(yearList);
			System.out.print(modelList.get(maxPositionofYear)+"\t"+yearList.get(maxPositionofYear));
			yearList.set(maxPositionofYear, -1.0);

			minPositionofYear = minNumber(yearList2);
			System.out.println("\t"+modelList.get(minPositionofYear)+"\t\t"+yearList.get(minPositionofYear));
			yearList2.set(minPositionofYear, 1000000.0);

			maxPositionofYear = maxNumber(yearList);
			System.out.print(modelList.get(maxPositionofYear)+"\t"+yearList.get(maxPositionofYear));

			minPositionofYear = minNumber(yearList2);
			System.out.println("\t"+modelList.get(minPositionofYear)+"\t\t"+yearList.get(minPositionofYear));


		}
		catch (IOException io)
		{
			System.err.println("File does not exist");
		}
	}

	public static int maxNumber(ArrayList<Double> arr)
	{
		Double max=arr.get(0);
		int maxIndex = 0;
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i)>max)
			{
				max = arr.get(i);
				maxIndex = i;
			}
		}

		return maxIndex;
	}



	public static int minNumber(ArrayList<Double> arr)
	{
		Double min=arr.get(0);
		int minIndex = 0;
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i)<min)
			{
				min = arr.get(i);
				minIndex = i;
			}
		}

		return minIndex;
	}

}
