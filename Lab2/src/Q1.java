import java.util.Scanner;

public class Q1 {

			
/*Write the following methods with associated method comments and
provide a program to test them, the program should ask the user for
appropriate values that are then passed to the methods.

		a. int max(int x, int y), returns the max value of the arguments */
		
		public static int max(int x, int y)
		{
			if (x <= y)			//Creating if statement that returns max value of two integers
			{
				return y;		//if true return y
			}
			else				//else return x
			{
				return x;
			}
					
		}
		
		//b. int min(int x, int y ), returns the min value of the arguments
		public static int min(int x, int y)
		{
			if (x <= y)			//Creating if statement that returns min value of two integers
			{
				return x;		//if true return x
			}
			else				//otherwise return y
			{
				return y;		
			}
				
		}

		
		public static void main(String[] args) 
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter two numbers: ");
			int x = in.nextInt();									//Asking user to input first integer
			int y = in.nextInt();									//Asking user to input second integer
			System.out.println("Max number is: " + max(x, y));		//Calling max value method
			System.out.println("Min number is: " + min(x, y));		//Calling min value method
		
	}

}
