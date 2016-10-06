import java.util.Scanner;
public class EX_04
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//initialize variables
		System.out.println("Please enter radius:");
		double r = kb.nextDouble();
		
		print(r, calcArea(r));
		
	}
	public static double calcArea(double r)
	{
		return 3.14*(r*r);
	}
	public static void print(double r, double calcArea)
	{
		//print using new perimeter value 
		System.out.printf("The area of a circle whose radius is " + r + " is %.5f ",calcArea);
	}
}