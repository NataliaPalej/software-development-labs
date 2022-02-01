
public class Q2 
{

	public static void main(String[] args) 
	{
		/*a) Create an array x of doubles with an initializer list that contains the
		following values: 8, 4, 5, 21, 7, 9, 18, 2, and 100.*/
		double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		
		/*b) Use an enhanced for loop to compute to print the total of all the
		elements in array x.*/
		double total = 0;
		for(double value : x)
		{
			total += value;		
		}
		System.out.println("Sum of enhanced for loop: " + total);
		
		/*c) Use a standard for loop to compute and print the total of all the
		elements in array x.*/
		double sum = 0;
		for(int i = 0; i < x.length; i++)
		{
			sum += x[i];
		}
		System.out.println("Sum of standard for loop: " + sum);
		
		/*d) Compute and print the minimum value in x. Your program should
		find this value by examining each item in the array.*/
		double min = x[0];
		for(double value : x)
		{
			if(value < min)
			{
				min = value;
			}
		}
		System.out.println("Minimum value: " + min);
		
		/*e) Repeat part d, but print the minimum value and its index in the
		array.*/
		double small = x[0];
		for(double num : x)
		{
			if(num < small)
			{
				small = num;
			}
		}
		System.out.println("The min value: " + small);
		System.out.println(x);
		}
		
		//System.out.println("Minimum value: " + small);
		//System.out.println("Index of minimum value: " );
		

}
