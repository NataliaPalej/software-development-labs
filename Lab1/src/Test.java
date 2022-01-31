
public class Test 
{

	public static void drawRectangle()
	{
		System.out.println("* * * * *");
		System.out.println("*       *");
		System.out.println("* * * * *");
	}
	
	public static void squareNumber(int x)
	{
		System.out.println("x squared = " + (x*x));
	}
	
	public static int add(int x, int y)
	{
		return x+y;
	}
	
	public static void main(String[] args) 
	{
		drawRectangle();
		drawRectangle();
		
		int x = 5;
		squareNumber(x);
				
		int answer = add(5, 5);
		System.out.println("Answer (5+5) = " + answer);
		System.out.println("(5+5) = " + add(5, 5));
		System.out.println("(1+2)+(3+4) = " + add(add(1, 2), add(3, 4)));
		
		
	}

}
