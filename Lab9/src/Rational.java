
public class Rational 
{
	private int num;
	private int dum;
	/**
	 * @param num
	 * @param dum
	 */
	public Rational(int num, int dum) {
		this.num = num;
		this.dum = dum;
		lowestNumber();
	}
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * @param dum 
	 * @return the dum
	 */
	public int getDum() {
		if(dum == 0)
		{
			System.out.println("Error dum must be higher than 0");
		}
		else
		{
			this.dum = dum;
		}
		
		return dum;
	}
	/**
	 * @param dum the dum to set
	 */
	public void setDum(int dum) {
		this.dum = dum;

	}
	
	public void print()
	{
		System.out.println(num +"/"+ dum);
	}
	public void lowestNumber()
	{
		int low = (this.num <= this.dum)? this.num: this.dum;
		while (low >= 2)
		{
			if (this.num % low == 0 && this.dum % low == 0)
			{
				this.num /= low ;
				this.dum /= low ;
				
			}
			else
			{
				low--;
			}
		}
	}
	

}
