import java.util.ArrayList;

public class MyArrayListMethods 
{
	/** (Q2)
	 * Fills an integer array with values between the ranges Min and Max
	 * @param values - the array to be filled
	 * @param n - the number of elements to be created
	 * @param rangeMin - the min range of the values to be generated
	 * @param rangeMax - the max range of the values to be generated
	 */
	
	public static void fillRandom(ArrayList<Integer> values, int n, int rangeMin, int rangeMax)
	{
		//n - desired number of elements
		for (int i = 0; i <= n; i++)
		{
			int number = (int)(Math.random() * (rangeMax - rangeMin) + rangeMin);
			//add randomly generated number to values ArrayList
			values.add(number);
		}		
	}
	
	/** (Q3)
	 * Increase the values in an Integer ArrayList by given amount
	 * @param values - the ArrayList to be increased
	 * @param amount - the amount to be increased
	 */
	
	public static void increase(ArrayList<Integer> values, int amount)
	{
		for (int i = 0; i < values.size(); i++)
		{
			values.set(i, values.get(i)+amount);
		}	
		
	}
	
	/**
	 * Sum the values in an Integer AraryList
	 * @param values - the ArrayList to be totaled
	 * @return the sum of an Integer ArrayList
	 */
	
	public static int sum(ArrayList<Integer> values)
	{
		int total = 0;
		for(int x : values)
		{
			total += x;
		}
		return total;
	}
}
