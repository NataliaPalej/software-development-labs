
public class Door 
{
	private String name;
	private String state;
	
	/*
	 * (1) Constructor has to be public and doesn't need any return type
	 * (2) You can have as many constructors as you like , as long as they have different 
	 * number of parameters
	 */
	public Door()
	{
		state = "closed";
	}
	
	public Door(String a)
	{
		name = a;
	}
	
	public Door(String a, String b)
	{
		name = a;
		state = b;
	}
	
	/**
	 * Get name method
	 * @return door name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Change door name method
	 * @param x new door name
	 */
	public void setName(String newName)
	{
		name = newName;
	}
	
	//Get current state of object (returns state in main method println)
	public String getState()
	{
		return state;
	}
	
	/**
	 * Method to set door object state
	 */
	public void setState(String newState)
	{
		state = newState;
	}
	
	/**
	 * Method to set door object state to closed
	 */
	public void close()
	{
		state = "closed";
	}

	/**
	 * Method to set door object state to open
	 */
	public void open()
	{
		state = "open";
	}
}
