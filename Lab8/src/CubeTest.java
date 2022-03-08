/**
 * 
 */

/**
 * Testing cube object
 * @author Natalia
 *
 */
public class CubeTest {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) 
	{
		//Creating new object of cube
		Cube newCube = new Cube(3);
		newCube.print();
		System.out.println();
		newCube.setLength(6.3);
		System.out.println("Cube length: " + newCube.getLength());
		System.out.println();
		newCube.print();
	}

}
