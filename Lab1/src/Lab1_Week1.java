
public class Lab1_Week1 
{
	//int add(int x, int y, int z), returning the sum of the arguments
	public static int add (int x, int y, int z) 
	{
		return x+y+z;
	}
	
	// int subtract(int x, int y ), returns the difference of the arguments
	public static int subtract (int x, int y)
	{
		return x-y;
	}	
	
	//int product(int x, int y ), returns the product of the arguments
	public static int multiply (int x, int y)
	{
		return x*y;
	}
	
	// int absoluteDifference(int x, int y ), returns the absolute difference of the arguments
	public static int absDifference (int x, int y)
	{
		return Math.abs(x-y);
	}
	
	//Rewrite question 1 so that it works for double variables
	public static double addDouble (double x, double y, double z)
	{
		return x+y+z;
	}
	
	public static double subtractDouble (double x, double y)
	{
		return x-y;
	}	
	
	public static double multiplyDouble (double x, double y)
	{
		return x*y;
	}
	
	public static double absDifferenceDouble (double x, double y)
	{
		return Math.abs(x-y);
	}
	
	//String add(String x, String y), returning the concatenation of the arguments
	public static String stringAdd(String x, String y)
	{
		return x+y;
	}
	
	//String reverse(String x ), returns the string in reverse order
	public static String reverse(String x)
	{
		char ch;
		String reversed = "";
		for (int i=0; i<x.length(); i++)
	    {
			ch = x.charAt(i); //extract each character one by one in passed string x
	        reversed = ch+reversed; //concat extracted character to the start of reversed string
	    }
	    return reversed;
	}
	
	
	public static void main(String[] args) 
	{
		//add
		int result1 = add(5, 10, 15);
		System.out.println("Sum = " + result1);
		
		//subtract
		int result2 = subtract(10, 5);
		System.out.println("Subtact = " + result2);
				
		//multiply
		int result3 = multiply(5, 10);
		System.out.println("Multiplication = " + result3);
		
		//absDifference
		int result4 = absDifference(-45354, 3521);
		System.out.println("Absolute difference = " + result4);
		
		//doubleAdd
		double answer1 = addDouble(12.1, 4.6, 18.2);
		System.out.println("Sum Double = " + answer1);
		
		//subtractDouble
		double answer2 = subtractDouble(5.2, 3.9);
		System.out.println("Subtact Double = " + answer2);
		
		//multiplyDouble
		double answer3 = multiplyDouble(3.87, 8.18);
		System.out.println("Multiplication Double = " + answer3);
		
		//absDifferenceDouble
		double answer4 = absDifferenceDouble(321.415, -1.08423617);
		System.out.println("Absolute Difference Double = " + answer4);
		
		//String
		String x = "Hello ";
		String y = "World!";
		String answer5 = stringAdd(x, y);
		System.out.println(answer5);
		
		//Reverse
		System.out.println(reverse("Lilly"));
		
	}

}
