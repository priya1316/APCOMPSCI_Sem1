import java.util.Scanner;
public class EX_03
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//initalize variables
		System.out.println("Please enter side length:");
		side = kb.nextDouble();
		
		//method calls
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		sa = 6 * (side * side);
	}
	public static void print()
	{
		//print using the new average value
		System.out.printf("The surface area of a cube whose sides are " + side + " in length is %.5f",sa);
	}
}