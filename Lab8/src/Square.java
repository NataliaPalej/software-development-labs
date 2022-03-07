
public class Square 
{
	private int length;
	
	/**
	 * @param the length
	 */
	public Square(int length)
	{
		this.length = length;
	}

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	public String toString() {
		return "Square [length=" + length + "]";
	}
	
	
	
}
