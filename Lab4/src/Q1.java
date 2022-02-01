
public class Q1 
{

	public static void main(String[] args) 
	{
		/* (a) Create an array x of doubles with an initializer list that contains the
		following values: 8, 4, 5, 21, 7, 9, 18, 2, 100*/
		
		double[] values = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		
		/* (b) Print the number of items in the array by printing the expression
		x.length*/
		
		System.out.println("Length of array: " + values.length);
		
		// (c) Print the first array item, x[0]
		System.out.println("First array item: " + values[0]);
		
		// (d) Print the last array item. Be careful to choose the right index
		System.out.println("Last array item: " + values[8]);
		
		/* (e) Print the expression x[x.length – 1]. Why is this value the same
		as in part d?*/
		System.out.println(values[values.length-1] + " -> it prints the last value of an array");
				
		/* (f) Use a standard for loop to print all the values in the array without
		labels. */	
		for(int i = 0; i < values.length; i++)	//int because you can't have 
		{										//double position of your index
			System.out.print(values[i] + " - ");
		}
		
		System.out.println();		
		/* (g) Use a standard for loop to print all the values in the array with
		labels to indicate what each element is.*/
		for(int i = 0; i < values.length; i++)
		{
			System.out.println(i + " : " + values[i]);
		}
		
		System.out.println();
		/* (h) Use a standard for loop to print all the values in the array in
		reverse order with labels to indicate what each element is. */
		
		for(int i = values.length-1; i > 0; i--)			// -1 as index position starts from 0
		{
			System.out.println(i + " : " + values[i]);
		}
		
		System.out.println();
		/*Use an enhanced for loop to print all the values in the array
		without labels.*/
		for(double num : values)
		{
			System.out.print(num + " - ");
		}
		
	}

}
