import java.util.Scanner;

public class Q3 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		/* (a) This program instantiates an array of String objects called customerName. 
		The array should have room for five String objects.	Use an initializer list to put the following names into the array:
		Cathy, Ben, Jorge, Wanda, Freddie
		Print the array of names.*/
		
		String[] customerName = {"Cathy", "Ben", "Jorge", "Wanda", "Freddie"};
		
		for (int i = 0; i < customerName.length; i++)
		{
			System.out.println(customerName[i]);	
		}
		
		/* (b) Use new to create a second double array called customerBalance in the main method. Allow room for five 
		customer balances, each stored as a double. In the loop that prints each customer name, add some code to prompt 
		the user to enter a balance for that customer. Read the keyboard input with a Scanner object. Use the following
		balances for the input:
		100.00, 234.56, 2.49, 32.32, 400.00, 
		After all the balances have been entered, print out each customer and his/her balance.*/
		
		double[] customerBalance = new double [5];
		for (int i = 0; i < customerName.length; i++)
		{
			System.out.print("Enter " + customerName[i] + "'s balance: ");
			double balance = in.nextDouble();
			customerBalance[i] = balance;
		}
		for (int i = 0; i < customerName.length; i++)
		{
			System.out.println(customerName[i] + ": " + customerBalance[i]);
		}
		
	}

}
