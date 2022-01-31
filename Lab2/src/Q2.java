import java.util.Scanner;

public class Q2 
{
	

/*Write the following methods with associated method comments and
provide a program to test them, the program should ask the user for
appropriate values that are then passed to the methods.
	
	a. boolean sortedAscending(int x, int y), returns true if the arguments
	are sorted in ascending order, otherwise return false*/
	
	public static boolean sortedAscending(int x, int y)			//Creating method sortedAscending
	{
		if(x <= y)											//If statement that checks if value x is smaller than value y
		{
			return true;
		}
		else												//If false, return value false
		{
			return false;
		}
	}
	
	
	
	//b. booelan equalToEachOther(int x, int y ), returns true if the
	//arguments are of equal value, otherwise return false
	public static boolean equalToEachOther(int x, int y)
	{
		if (x == y)										//we can leave the return value as: return (x==y), makes the code smaller
		{
			return true;			
		}
		else											//If statement that checks if value x is equal to value y
		{
			return false;
		}
	}
	

	

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		
		int x = in.nextInt();									//Asking user to input first integer
		int y = in.nextInt();									//Asking user to input second integer
		
		if (sortedAscending(x, y))
		{
			System.out.println("Numbers " + x + " and " + y + " are sorted ascending: " + sortedAscending(x, y));		//Printing the result followed by method
		}
		else
		{
			System.out.println("Numbers " + x + " and " + y + " are not sorted ascending: " + sortedAscending(x, y));	
		}
		
		if(equalToEachOther(x, y))
		{
			System.out.println("Numbers " + x + " and " + y + " are equal to each other: " + equalToEachOther(x, y));	//Printing the result followed by method
		}
		else
		{
			System.out.println("Numbers " + x + " and " + y + " are NOT equal to each other: " + equalToEachOther(x, y));	//Printing the result followed by method
		}
		

	}

}
