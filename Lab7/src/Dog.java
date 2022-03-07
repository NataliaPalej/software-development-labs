public class Dog 
{
	/* DOGS Name, breed, colour, sex
	 * DOGS CAN: go for a walk, bark, mood state
	 * OBJECTIVE check how many times went for a walk, whats its state, display all info  
	 */
	
	private String name;
	private String breed;
	private String colour;
	private String sex;
	private int walk;
	private String mood;
	
	public Dog()
	{
		walk = 0;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setBreed(String newBreed)
	{
		breed = newBreed;
	}
	
	public void setColour(String newColour)
	{
		colour = newColour;
	}
	
	public void setSex(String newSex)
	{
		sex = newSex;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	public String getColour()
	{
		return colour;
	}
	
	public String getSex()
	{
		return sex;
	}
	
	public void goForWalk()
	{
		walk++;
	}
	
	public void bark()
	{
		System.out.println("Woff, Woff!");
		walk--;
	}
	
	public void mood()
	{
		if (walk > 0)
		{
			mood = "Happy";
		}
		else
		{
			mood = "Sad, I want go for a walk!";
		}
	}
	
	public void display()
	{
		mood();
		System.out.println("Dog name: " + name + "\nDog breed: " + breed + "\nDog color: " + colour + "\nDog walk: " + walk + "\nDog mood: " + mood);
	}

}
