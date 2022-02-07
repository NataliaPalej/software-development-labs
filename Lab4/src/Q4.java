import java.util.*;

public class Q4 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		//Total number of values to be generated
		System.out.print("What is the total of random values you want to generate: ");
		int n = in.nextInt();
		
		//How many times index is to repeat randomly
		System.out.print("What is the amount of values to draw: ");
		int index = in.nextInt();		//Array length
		
		int[] array = new int [index];
	
		for (int i = 0; i < n; i++)
		{
			int x = (int)(Math.random() * index);
			array[x]++;
		}
		
		for (int i = 0; i < index; i++)
		{
			System.out.println(i + ": " + array[i]);
		}
	
/*We can use the Math.random method to generate random integers. For example, Math.random() generates a random integer 
greater than or equal to 0 and less than 1. The expression Math.random() * 6 generates random numbers between 0 and 5, 
simulating the throw of a die. (Make sure to round the value to an int: (int) Math.random() * 6)
In this lab assignment, you will use an array to test whether the random generator is fair; that is, whether each 
possible value is generated approximately the same number of times. Your program should ask the user:
How many random numbers should be generated? What is the number of values for each random draw? (e.g., 6)
Make an array with one element for each possible outcome. Set each element to 0. Then keep calling the random number generator. 
If it returns a value v, then increment the counter belonging to v. After all numbers have been generated, print the counters. 
Here is a typical program run: 
How many random numbers do you want to generate: 1000 
What is the number of values for each random draw: 10
0: 78
1: 101
2: 118
3: 97
4: 103
5: 102
6 : 112
7: 91
8: 94
9: 104
Write code to simulate this.*/
	}

}
