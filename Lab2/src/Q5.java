import java.util.Scanner;

public class Q5 
{
	
/*5 Write the following methods.
	a. int firstDigit(int n), returning the first digit of the argument*/
	public static int firstDigit(int n)
	{
		while (n>10)					//Creating while-loop that checks until the number is less than 10
		{
			n/=10;						//Once the number is less than 10, divide it by 10
		}
			return n;					//Returns first digit
			
		//return Integer.parseInt(Integer.toString(n).substring(0, 1));
		
	}
	
	//b. int lastDigit(int n), returning the last digit of the argument
	public static int lastDigit(int n)
	{
		return (n % 10);				//Returns last digit by checking if number has no change
	}
	
	//c. int digits(int n), returning the number of digits of the argument
	public static int digits(int n)
	{
		return String.parseInt(n)

	}
	
	
	

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter three numbers: ");
		
		int n = in.nextInt();									//Asking user to input integer
		
		System.out.println("First digit of a number " + n + " is " + firstDigit(n));
		System.out.println("Last digit of a number " + n + " is " + lastDigit(n));

	}

}
