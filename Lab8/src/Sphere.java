/**
 * Creating object of Sphere
 * @author Natalia
 */
public class Sphere {
	
	//Initializing radius
	private double radius;

	/**
	 * @param radius for sphere
	 */
	public Sphere(double radius) {
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Method to calculate volume of sphere 
	 * Volume formula: V = (4/3)*Pi*r^3
	 * @param x storing volume 
	 * @return rounded to two decimal places cube surface area
	 */
	public double volume()
	{
		double x;
		x = (4/3)*Math.PI*Math.pow(this.radius, 3);
		return Math.round(x*100.0)/100.0;
	}
	
	/**
	 * Method to calculate surface area of sphere 
	 * Surface formula: A = 4*Pi*r^2
	 * @param x storing volume 
	 * @return rounded to two decimal places cube surface area
	 */
	public double surfaceArea()
	{
		double x;
		x = 4*Math.PI*Math.pow(this.radius, 2);
		return Math.round(x*100.0)/100.0;
	}
	
	/**
	 * Method to print the content of sphere object
	 */
	public void print()
	{
		System.out.println("Sphere [radius]: " + this.radius + "\nVolume: " + volume() + "\nSurface area: " + surfaceArea());
	}
	

}
