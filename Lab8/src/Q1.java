
public class Q1 
{
	private int square;
	private int length;
	private double area;
	private double p;
	private double d;
	
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}


	/**
	 * Constructor 
	 * @param square
	 */
	public Q1(int square) 
	{
		square = length;
	}
	
	/**
	 * @return the square
	 */
	public int getSquare() 
	{
		return square;
	}
	
	/**
	 * @param square the square to set
	 */
	public void setSquare(int square) 
	{
		square = length;
	}
	
	/**
	 * @param area, the area of square
	 */
	public double area(double length)
	{
		return area = Math.pow(length, 2);
	}
	
	/**
	 * @param p, the perimeter of square
	 */
	public double perimeter(double length)
	{
		return p = 4*length;
	}
	
	/**
	 * @param d, the diagonal of square
	 */
	public double diagonal(double length)
	{
		return d = Math.sqrt(2)*length;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	public String toString() 
	{
		return "Q1 [square=" + square + ", length=" + length + ", area=" + area + ", p=" + p + ", d=" + d + "]";
	}
	
	
	/**
	 * Method to display content of Square
	 */
	public void print()
	{
		System.out.println("Q1 [square=" + square + ", length=" + length + ", area=" + area + ", p=" + p + ", d=" + d + "]");
	}
	
}
