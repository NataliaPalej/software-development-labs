/**
 * 
 */

/**
 * @author Natalia
 * Testing cylinder object
 */
public class CylinderTest {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) 
	{
		//Creating object Cylinder
		Cylinder newCylinder = new Cylinder(1, 8.5);
		newCylinder.print();
		System.out.println();
		newCylinder.setHeight(5);
		System.out.println("Cylinder height: " + newCylinder.getHeight());
		System.out.println();
		newCylinder.setRadius(2.5);
		System.out.println("Cylinder radius: " + newCylinder.getRadius());
		System.out.println();
		newCylinder.print();
	}

}
