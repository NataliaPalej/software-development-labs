
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
		if (dum == 0)
		{
			this.dum = 1;
		}
		else
		{
			this.dum = dum;
		}
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
		return dum;
	}
	/**
	 * @param dum the dum to set
	 */
	public void setDum(int dum) {
		if (dum == 0)
		{
			this.dum = 1;
		}
		else
		{
			this.dum = dum;
		}

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
	
	public void add(Rational r)
	{
		this.num = (this.num*r.dum) + (this.dum*r.num);
		this.dum = this.dum*r.dum;		
		lowestNumber();
	}
	
	public void sub(Rational r)
	{
		this.num = (this.num*r.dum) - (this.dum*r.num);
		this.dum = this.dum*r.dum;		
		lowestNumber();
	}
	
	public void multi(Rational r)
	{
		this.num = (this.num*r.num);
		this.dum = this.dum*r.dum;		
		lowestNumber();
	}
	
	public void div (Rational r)
	{
		this.num = (this.num * r.dum);
		this.dum = (this.dum * r.num);
		lowestNumber();
		
				
	}
	
	

}
