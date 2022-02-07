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
			int num = (int) ((Math.random() * rangeMax)+1);

			while (num < rangeMin)
			{
				num = (int) ((Math.random() * rangeMax)+1);
			} 
			
			values[i] = num;
			//System.out.println(i + " : " + num); 
		}		
	}

}
