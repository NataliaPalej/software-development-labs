/**
 * @author Natalia
 * Testing circle objects and its methods
 */
public class CircleTest {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) 
	{
		Circle newCircle = new Circle(1);
		newCircle.print();
		System.out.println();
		newCircle.setRadius(2.4);
		newCircle.print();
		System.out.println();
		System.out.println("Area = " + newCircle.area());
		newCircle.setRadius(8);
		System.out.println("Radius = " + newCircle.getRadius());
	}

}
