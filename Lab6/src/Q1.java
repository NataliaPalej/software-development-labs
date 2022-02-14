import java.util.ArrayList;
public class Q1 
{

	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<String>();
		System.out.println("names: " + names);
		
		/* (a) Invoke add() to enter the following names in sequence: Alice, Bob,
		Connie, David, Edward, Fran, Gomez, Harry. Print the ArrayList again.*/
		names.add("Alice");
		names.add("Bob"); 
		names.add("Connie"); 
		names.add("David");
		names.add("Edward");
		names.add("Fran");
		names.add("Gomez");
		names.add("Harry");
		System.out.println("names: " + names);
		
		/* (b) Use get() to retrieve and print the first and last names*/
		System.out.println("First name: " + names.get(0) + "\nLast name: " + names.get(names.size() - 1));
		
		/* (c) Print the size() of the ArrayList. */
		System.out.println("Size of the array: " + names.size());
		
		/* (d) Use size() to help you print the last name in the list.*/
		System.out.println("Last name: " + names.get(names.size() - 1));
		
		/* (e) Use set() to change �Alice� to �Alice B. Toklas�. Print the ArrayList to
		verify the change.*/
		names.set(0, "Alice B. Toklas");
		System.out.println(names);

		/* (f) Use the alternate form of add() to insert �Doug� after �David�. Print the
		ArrayList again. */
		names.add(4, "Doug");
		System.out.println(names);
		
		/* (e) Use an enhanced for loop to print each name in the ArrayList */
		for (String i : names)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		/* (h) Create a second ArrayList called names2 that is built by calling the
		ArrayList constructor that accepts another ArrayList as an argument.
		Pass names to the constructor to build names2. Then print the
		ArrayList. */
		ArrayList<String> names2 = new ArrayList<String>(names);
		System.out.println(names2);

		/* (i) Call names.remove(0) to remove the first element. Print names and
		names2. Verify that Alice B. Toklas was removed from names, but not
		from names2. */
		names.remove(0);
		System.out.println("Names: " + names);
		System.out.println("Names2: " + names2);
	}

}
