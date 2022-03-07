/**
 * @author Natalia
 * Testing rectangle object and methods associated with it
 */
public class RectangleTest {

	/**
	 * Class to test rectangle object and its methods 
	 * @param args not used
	 */
	public static void main(String[] args) 
	{
		Rectangle newRectangle = new Rectangle(1, 5);
		newRectangle.print();
		System.out.println();
		newRectangle.setLength(3);
		newRectangle.setWidth(9);
		newRectangle.print();
		System.out.println();
		newRectangle.setLength(23);
		System.out.println("The length is: " + newRectangle.getLength());
	}

}
