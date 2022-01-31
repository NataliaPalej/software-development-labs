import java.util.Scanner;

public class Lab3Test
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter radius (r), height (h) and (l): ");
		double r = in.nextDouble();
		double h = in.nextDouble();
		double l = in.nextDouble();
		
		double volSphere = TestMethods.sphereVolume(r);
		double surfSphere = TestMethods.sphereSurface(r);
		double volCylinder = TestMethods.cylinderVolume(r, h);
		double surCylinder = TestMethods.cylinderSurface(r, h);
		double volCone = TestMethods.coneVolume(r, h);
		double surfCone = TestMethods.coneSurface(r, h, l);
		
		System.out.println("Spehere volume of r: " + r + " = " + volSphere);
		System.out.println("Sphere surface of r: " + r + " = " + surfSphere);
		System.out.println("Cylinder volume of r: " + r + " and h: " + h + " = " + volCylinder);
		System.out.println("Cylinder surface of r: " + r + " and h: " + h + " = " + surCylinder);
		System.out.println("Cone volume of r: " + r + " and h: " + h + " = " + volCone);
		System.out.println("Cone surface of r: " + r + " h: " + h + " and l: " + l + " = " + surfCone);
			
		in.close();
		}
}
