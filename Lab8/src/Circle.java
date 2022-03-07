public class Circle 
{
	private double radius;
	
	public Circle(double radius)
	{
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
	 * @return circumference of circle from set radius
	 */
	public double circumference()
	{
		//rounding up to 2 decimal places
		double c;
		c = 2*Math.PI*radius;
		return Math.round(c*100.0)/100.0;
	}
	
	/**
	 * @return area of circle from set radius
	 */
	public double area()
	{
		//rounding up to 2 decimal places
		double a;
		a = Math.PI*Math.pow(radius, 2);
		return Math.round(a*100.0)/100.0;
	}
	
	/**
	 * Prints the content of Circle object
	 */
	public void print()
	{
		System.out.println("Circle [radius = " + radius + "]\nCircumference = " + circumference() + "\nArea = " + area() + "\nRadius = " + radius);
	}
	
	


}
