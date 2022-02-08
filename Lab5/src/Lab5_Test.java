import java.util.Arrays;
import java.util.Scanner;

public class Lab5_Test 
{

	public static void main(String[] args) 
	{
		int[] a = new int[10];
		MyArrayMethods.fillRandom(a, 1, 10);
		System.out.println("a: " + Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("a: " + Arrays.toString(a));
		
		System.out.println();
		
		double[] b = new double[10];
		MyArrayMethods.fillRandom(b, 1, 10);
		System.out.println("b: " + Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("b: " + Arrays.toString(b));
		
		System.out.println();
		
		//create second array and partially fill
		Scanner in = new Scanner(System.in);
		int[] c = new int[10];
		int currentSize = MyArrayMethods.fillPartial(c);
		System.out.println("c: " + Arrays.toString(c));
		Arrays.sort(c, 0, currentSize);
		System.out.println("c: " + Arrays.toString(c));
		
		System.out.println();
		
		//create second array and partially fill with doubles
		double[] d = new double[10];
		double currentSizeDouble = MyArrayMethods.fillPartial(d);
		System.out.println("d: " + Arrays.toString(d));
		
		System.out.println("d: " + Arrays.toString(d));
		
		System.out.println(); 
		
		int[][] e = new int[4][4];
		MyArrayMethods.fillRandom(e, 1, 10);
		System.out.println("e: " + Arrays.toString(e));
		
		
	}

}
