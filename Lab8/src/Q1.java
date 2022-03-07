public class Q1 
{
	private int square;
	private int length;
	
	/**
	 * Constructor 
	 * @param square length
	 */
	public Q1(int x) 
	{
		//setting length of square to 1 as default
		length = 1;
	}
	
	/**
	 * @param length the length to set
	 */
	public void setLength(int x) 
	{
		this.length = x;
	}
	
	/**
	 * @return the length
	 */
	public int getLength() 
	{
		return length;
	}

	
	/**
	 * @param square the square to set
	 */
	public void setSquare(int x) 
	{
		square = x;
	}
	
	/**
	 * @return the square
	 */
	public int getSquare() 
	{
		return square;
	}
	
	
	/**
	 * @param area, the area of square
	 */
	public double area()
	{
		return Math.pow(length, 2);
	}
	
	/**
	 * @param p, the perimeter of square
	 */
	public int perimeter()
	{
		return 4*length;
	}
	
	/**
	 * @param d, the diagonal of square
	 */
	public double diagonal()
	{
		//rounding up to 2 decimal places
		double d;
		d = Math.sqrt(2)*length;
		return Math.round(d*100.0)/100.0;
	}

	
	/**
	 * Method to display content of Square
	 */
	public void print()
	{
		System.out.println("Length = " + length + "\nArea = " + area() + "\nPerimeter = " + perimeter() + "\nDiagonal = " + diagonal());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Length =" + length + "\nArea = " + area() + "\nPerimeter = " + perimeter() + "\nDiagonal = " + diagonal();
	}
	
}
