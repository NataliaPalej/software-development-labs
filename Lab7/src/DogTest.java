
public class DogTest 
{
/**
 * Testing Dog object
 * @param args not used
 */
	public static void main(String[] args) 
	{
		Dog myDog = new Dog();
		myDog.setName("Lilly");
		myDog.setBreed("Yorkie");
		myDog.setColour("Tan and Black");
		myDog.setSex("Female");
		myDog.display();
		myDog.goForWalk();
		myDog.display();
		myDog.bark();
		myDog.display();
	}

}
