/**
 * A class to test the Door class
 */
public class DoorRunner {

	/**
	 * Tests the method of the Door class
	 * @param args not used
	 */
	public static void main(String[] args) 
	{
		//Testing no parameter constructor of object door
		Door emptyDoor = new Door();
		System.out.println("Empty door: " + emptyDoor.getName() + " " + emptyDoor.getState());
		
		//Testing constructor with one parameter of object door
		Door oneDoor = new Door("Main");
		System.out.println("One parameter door: " + oneDoor.getName() + " " + oneDoor.getState());
		
		//Testing constructor with two parameters of object door
		Door twoDoor = new Door("Main", "Open");
		System.out.println("Twoo parameter door: " + twoDoor.getName() + " " + twoDoor.getState());
		
		System.out.println();
		Door frontDoor = new Door("Front", "open");
		System.out.println("The front door is: " + frontDoor.getState());
		System.out.println("Expected to be open");
		System.out.println();
		Door backDoor = new Door("Back", "closed");
		System.out.println("The back door is: " + backDoor.getState());
		System.out.println("Expected to be closed");
		
		System.out.println();
		//Use the mutator to change the state variable
		//set backDoor to open - using previously implemented method
		backDoor.open();
		System.out.println("The back door is now: " + backDoor.getState());
		System.out.println("Expected to be open");
		
		System.out.println();
		//Use the mutator to change the name
		System.out.println("The back door name is: " + backDoor.getName());
		System.out.println("Expected name: Back ");
		
		System.out.println();
		//setName to change the door's name
		backDoor.setName("Lilly");
		System.out.println("The back door name is: " + backDoor.getName());
		System.out.println("Expected name: Lilly ");
		
	}

}
