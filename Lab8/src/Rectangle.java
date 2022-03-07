public class Rectangle 
{
	private double length;
	private double width;
	
	/* setters have VOID in syntax and do not return anything
	 * getters have return value within their method
	 */
	

	/**
	 * @param length, rectangle length
	 * @param width, rectangle width
	 */
	public Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}
	
	/**
	 * Creating getter for rectangle length
	 * @return the length
	 */
	public double getLength() 
	{
		return length;
	}

	/**
	 * Creating setter for length
	 * @param length the length to set
	 */
	public void setLength(double length) 
	{
		this.length = length;
	}
	
	/**
	 * Creating getter for width
	 * @return the width
	 */
	public double getWidth() 
	{
		return width;
	}

	/**
	 * Creating setter for width
	 * @param width the width to set
	 */
	public void setWidth(double width) 
	{
		this.width = width;
	}
	
	
	/**
	 * @return area of rectangle
	 */
	public double area()
	{
		return this.length*this.width;
	}
	
	/**
	 * @return perimeter of rectangle
	 */
	public double perimeter()
	{
		return 2*(this.length+this.width);
	}
	
	/**
	 * Prints the content of rectangle object
	 */
	public void print()
	{
		System.out.println("Rectangle:\nWidth: " + width + "\nLength: " + length + "\nArea: " + area() + "\nPerimeter: " + perimeter());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		return "Rectangle [length=" + length + ", width=" + width + ", area()=" + area() + ", perimeter()=" + perimeter() + "]";
	}
	
	
	
}
