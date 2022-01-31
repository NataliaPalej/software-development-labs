import java.util.Scanner;

public class Q3 
{
	
/*Write the following methods and provide a program to test them.
	
	a. int smallest(int x, int y, int z), returning the smallest of the arguments*/
	public static int smallest(int x, int y, int z)				//initializing method with three integers
	{
		if(x <= y && x <= z)									//creating if statement to find the smallest number
		{														//if x is smaller than y and z, return x
			return x;
		}
		else if (y <= x && y <= z)								//if y is smaller than x and z, return y
		{
			return y;
		}
		else													//otherwise return z
			return z;
	}
	
	
	//b. double average(int x, int y, int z), returning the average of the arguments
	public static double average(double x, double y, double z)	//Initializing method that counts the average of 3 numbers
	{
		return (x+y+z)/3.0;										//Returning average
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter three numbers: ");
		
		int x = in.nextInt();									//Asking user to input first integer
		int y = in.nextInt();									//Asking user to input second integer
		int z = in.nextInt();									//Asking user to input third integer
		
		System.out.println("Smallest number between " + x + ", " + y + ", " + z + " is: " + smallest(x, y, z)); //Printing the result followed by method
		System.out.println("Average of numbers " + x + ", " + y + ", "+ z + ", " + "is: " + average(x, y, z)); //Printing average method

	}

}
