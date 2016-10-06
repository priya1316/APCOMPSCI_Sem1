import java.util.Scanner;
public class EX_04
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//initalize variables
		System.out.println("Please enter radius :");
		r = kb.nextDouble();
		
		//method calls
		calcArea();
		print();
	}
	public static void calcArea()
	{
		area = 3.14 * (r * r);
	}
	public static void print()
	{
		//print using the new average value
		System.out.printf("The area of a circle with a radius of " + r + " is %.5f",area);
	}
}