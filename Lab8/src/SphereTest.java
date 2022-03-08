/**
 * Testing Sphere object 
 * @author Natalia
 */
public class SphereTest {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) 
	{
		//Initializing new Sphere object
		Sphere newSphere = new Sphere(8.2);
		newSphere.print();
		System.out.println();
		newSphere.setRadius(4);
		System.out.println("Sphere radius: " + newSphere.getRadius());
		System.out.println();
		newSphere.print();
	}

}
