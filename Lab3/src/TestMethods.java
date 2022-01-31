public class TestMethods 
{
	
	/*
	 Returns sphere volume
	 V = 4/3 pi r^3
	 @param r
	 */
	public static double sphereVolume(double r)
	{
		return ((4.0/3)*Math.PI*Math.pow(r, 3));
	}
	
	
	/*
	 Returns sphere surface
	 A = 4 pi r2
	 @param r
	 */
	public static double sphereSurface(double r)
	{
		return (4.0*Math.PI*Math.pow(r, 2));
	}
	
	/*
	 Returns cylinder volume
	 V =  pi r2 h
	 @param r
	 @param h
	 */
	public static double cylinderVolume(double r, double h)
	{
		return (Math.PI*Math.pow(r, 2)*h);
	}
	
	
	/*
	 Returns cylinder surface
	 A = 2 pi r (r+h)
	 @param r
	 @param h
	 */
	public static double cylinderSurface(double r, double h)
	{
		return ((2*Math.PI*r)*(r+h));
	}
	
	/*
	 Returns cone volume
	 V = pi r2 h/3
	 @param r
	 @param h
	 */
	public static double coneVolume(double r, double h)
	{
		return (Math.PI*Math.pow(r, 2)*(h/3));
	}
	
	/*
	 Returns cone surface
	 A = pi r(l+r)
	 @param r
	 @param h
	 @param l
	 */
	public static double coneSurface(double r, double h, double l)
	{
		return (Math.PI*r*(l+r));
	}
	
}
