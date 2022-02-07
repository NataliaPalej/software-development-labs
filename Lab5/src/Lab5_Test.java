import java.util.Arrays;

public class Lab5_Test 
{

	public static void main(String[] args) 
	{
		int[] a = new int[10];
		MyArrayMethods.fillRandom(a, 1, 10);
		System.out.println("a: " + Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("a: " + Arrays.toString(a));
	}

}
