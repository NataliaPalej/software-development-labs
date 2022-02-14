import java.util.ArrayList;

public class Q2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> values = new ArrayList<Integer>();
		MyArrayListMethods.fillRandom(values, 20, 1, 10);
		System.out.println("Values: " + values);
		
		MyArrayListMethods.increase(values, 5);
		System.out.println("Values increased by 5: " + values);
		
		int total = MyArrayListMethods.sum(values);
		System.out.println("Increased total: " + total);
	}	
}
