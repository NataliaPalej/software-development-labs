/**
 * Creating object Cube
 * @author Natalia
 */
public class Cube 
{
	//Initializing cube length
	private double length;

	/**
	 * @param length
	 */
	public Cube(double length) {
		super();
		this.length = length;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/**
	 * Method to calculate volume area of cube 
	 * Volume formula: V = a^3
	 * @param x storing volume 
	 * @return rounded to two decimal places volume
	 */
	public double volume()
	{
		double x;
		x = Math.pow(this.length, 3);
		return Math.round(x*100.0)/100.0;
	}
	
	/**
	 * Method to calculate surface area of cube 
	 * Surface area formula: A = 6a^2
	 * @param x storing volume 
	 * @return rounded to two decimal places cube surface area
	 */
	public double surfaceArea()
	{
		double x;
		x = 6*Math.pow(this.length, 2);
		return Math.round(x*100.0)/100.0;
	}
	
	/**
	 * Method to print the content of cube object
	 */
	public void print()
	{
		System.out.println("Cube: " + this.length + "\nVolume: " + volume() + "\nSurface area: " + surfaceArea());
	}

}
