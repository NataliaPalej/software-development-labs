import javax.swing.plaf.synth.SynthSpinnerUI;

public class RationalTest {

	public static void main(String[] args) 
	{
		Rational r1 = new Rational(3,7);
		System.out.print("r1 = ");
		r1.print();
		Rational r2 = new Rational(4,0);
		System.out.print("r2 = ");
		r2.print();	
		Rational r3 = new Rational (8, 16);
		System.out.print("r3 = ");
		r3.print();
		System.out.println();
		System.out.print("r1 + r3 = ");
		r1.add(r3);
		r1.print();
		System.out.println();
		
		r1.setDum(3);
		r1.setNum(8);
		r1.print();
		System.out.print("r1 -r3 = ");
		r1.sub(r3);
		r1.print();
		
		System.out.println();
		System.out.print("r1 * r3 = ");
		r1.multi(r3);
		r1.print();
		
		System.out.println();
		System.out.print("r1 / r3 = ");
		r1.div(r3);
		r1.print();
		
	}

}
