
public class Cylinder 
{
	private double radius;
	private double height;
	
	/**
	 * @param radius
	 * @param height
	 */
	public Cylinder(double radius, double height) 
	{
		this.radius = radius;
		this.height = height;
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
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * Method to calculate volume of cylinder
	 * @return volume of cylinder
	 */
	public double volume()
	{
		//Cylinder volume V=pi r^2 h
		double x;
		x = Math.PI*Math.pow(this.radius, 2)*this.height;
		return Math.round(x*100.0)/100.0;
	}
	
	/**
	 * Method to calculate surface area of Cylinder 
	 * @return surface area
	 */
	public double surfaceArea()
	{
		//Cylinder surface area: 2*pi*r*(r+h)
		double x;
		x = 2*Math.PI*this.radius*(this.radius+this.height);
		return Math.round(x*100.0)/100.0;
	}
	
	/**
	 * Method to print the content of Cylinder object
	 */
	public void print()
	{
		System.out.println("Cylinder [radius]: " + radius + "\n" + "Height: " + height + "\nVolume: " + volume() + "\nSurface area: " + surfaceArea());
	}
	

}
