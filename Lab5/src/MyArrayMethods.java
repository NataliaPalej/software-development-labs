import java.util.Arrays;
import java.util.Scanner;

public class MyArrayMethods 
{
	/** Fills an integer array with values between the ranges Min and Max
	 * @param values - the array to be filled
	 * @param rangeMin - min range of the values to be generated
	 * @param rangeMax - max range of the values to be generated*/
	
	// (Q1)
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
	
	// (Q2) 
	public static void fillRandom(double[] values, double rangeMin, double rangeMax)
	{
		for (int i = 0; i < values.length; i++)
		{
			values[i] = (double) ((Math.random() * rangeMax - rangeMin)+ rangeMin);	
		}		
	}
	
	/** Fills an integer array from the keyboard; the array can be partially filled
	 * The user is informed if the array is full and input should be stopped
	 * @param values The array to be filled
	 * @return the currentSize of the partially filled array */
	 
	// (Q3)
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
	
	// (Q4) 
	public static int fillPartial(double[] values)
	{
		int currentSizeDouble = 0;
		@SuppressWarnings("resource")
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
	
	/** Fills an two dimensional integer array with values between the ranges Min and Max
	 * @param values - the array to be filled 
	 * @param rangeMin - the min range to be generated
	 * @param rangeMax - the max range to be generated
	 */
	// (Q5) 
	public static void fillRandom(int[][] values, int rangeMin, int rangeMax)
	{	
		for (int i = 0; i < values.length; i++)
		{
			for (int j = 0; j < values[i].length; j++)
			{
				values[i][j] = (int) ((Math.random() * rangeMax - rangeMin)+ rangeMin);
			}
		}
		System.out.print("e: " + values);
	}	
}