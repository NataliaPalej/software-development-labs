public class VendingMachine 
{
	private int cans;
	private int tokens;
	
	//Constructor for Vending Machine object, a MUST to run the program
	public VendingMachine(int x)
	{
		cans = x;
		tokens = 0;
	}

	public VendingMachine()
	{
		cans = 10;
		tokens = 0;
	}
	/**
	 * setCans method to set number of cans
	 */
	public void setCans(int x)
	{
		cans = x;
	}
	
	/**
	 * setTokens method to set number of tokens
	 */
	public void setTokens(int x)
	{
		tokens = x;
	}
	
	/**
	 * getCans method that returns number of cans
	 */
	public int getCans()
	{
		return cans;
	}
	
	/**
	 * getTokens method that returns number of tokens
	 */
	public int getTokens()
	{
		return tokens;
	}
	
	public void fillUp(int cans)
	{
		//re-using the setter method
		setCans(cans);
	}
	
	public void insertToken()
	{
		if (cans > 0)
		{
			cans--;
		}
		else
		{
			System.out.println("No more juice, sorry!:(");
		}
		//incrementing tokens, no need to use setter as its within the class
		tokens++;
	}
	
	/**
	 * Method overloading to allow inserting multiple tokens
	 * @param x number of tokens to insert
	 */
	public void insertToken(int x)
	{
		for (int i = 0; i < x; i++)
		{
			insertToken();
		}
	}
	
	/**
	 * Method to display contect of Vending Machine
	 */
	public void display()
	{
		System.out.println("Number of cans: " + cans + " " + "Number of tokens: " + tokens);
	}
}

