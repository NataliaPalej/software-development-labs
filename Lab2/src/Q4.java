import java.util.Scanner;

public class Q4 
{
	/*Write the following methods and provide a program to test them.
	a. boolean allTheSame(int x, int y, int z), returning true if the arguments
	are all the same*/
	
	public static boolean allTheSame(int x, int y, int z)
	{
		return (x == y && x == z && y == z);
	}
	
	/*b. boolean allDifferent(int x, int y, int z), returning true if the arguments
	are all different*/
	
	public static boolean allDifferent(int x, int y, int z)
	{
		return (! (x == y && x == z && y == z));
	}
	
	/*c. boolean sorted(int x, int y, int z), returning true if the arguments are
	sorted, with the smallest one coming first*/
	
	//public static boolean sorted(int x, int y, int z)


	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter three numbers: ");
		
		int x = in.nextInt();									//Asking user to input first integer
		int y = in.nextInt();									//Asking user to input second integer
		int z = in.nextInt();									//Asking user to input third integer
		
		if (allTheSame(x, y, z))
		{
			System.out.println("Numbers " + x + ", " + y + ", " + z + " are the same.");
		}
		else
		{
			System.out.println("Numbers " + x + ", " + y + ", " + z + " are NOT the same.");
		}
		
		if(allDifferent(x, y, z))
		{
			System.out.println("Numbers " + x + ", " + y + ", " + z + " are all different.");
		}
		else
		{
			System.out.println("Numbers " + x + ", " + y + ", " + z + " are NOT all different.");
		}

	}

}
