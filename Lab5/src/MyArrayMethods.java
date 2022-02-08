import java.util.Arrays;
import java.util.Scanner;

public class MyArrayMethods 
{
	/* Fills an integer array with values between the ranges Min and Max
	 * @param values - the array to be filled
	 * @param rangeMin - min range of the values to be generated
	 * @param rangeMax - max range of the values to be generated*/
	
	public static void fillRandom(int[] values, int rangeMin, int rangeMax)
	{
		for (int i = 0; i < values.length; i++)
		{
			values[i] = (int)(Math.random() * (rangeMax - rangeMin + 1)) + rangeMin;
			if (values[i] > rangeMax)
			{
				values[i] = rangeMax;
			}
		}		
	}
	
	public static void fillRandom(double[] values, double rangeMin, double rangeMax)
	{
		for (int i = 0; i < values.length; i++)
		{
			values[i] = (double) ((Math.random() * rangeMax - rangeMin)+ rangeMin);
		/*	if (values[i] > rangeMax)
			{
				values[i] = rangeMax;
			}
		*/	
		}		
	}
	
	/* Fills an integer array from the keyboard; the array can be partially filled
	 * The user is informed if the array is full and input should be stopped
	 * @param values The array to be filled
	 * @return the currentSize of the partially filled array */
	 
	
	public static int fillPartial(int[] values)
	{
		int currentSize = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter values: ");
		while (in.hasNextInt() && currentSize < values.length)
		{
			values[currentSize] = in.nextInt();
			currentSize++;
		}
		//in.close();
		return currentSize;
	}
	
	public static double fillPartial(double[] values)
	{
		int currentSizeDouble = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter double values: ");
		while (in.hasNextDouble() && currentSizeDouble < values.length)
		{
			values[currentSizeDouble] = in.nextDouble();
			currentSizeDouble++;
		}
		//in.close();
		return currentSizeDouble;
	}
	
	//Q5 create an integer array first
	public static void fillRandom(int[][] values, int rangeMin, int rangeMax)
	{
		for (int i = 0; i < values.length; i++)
		{ 
			System.out.print(values[i]);
			/*for (int j = 0; j < values.length; j++)
			{
				System.out.print(values[i][j]);
			}
		}	
		System.out.print("j[" + j + "] " + values[i][j]);*/
	}
	
}
 