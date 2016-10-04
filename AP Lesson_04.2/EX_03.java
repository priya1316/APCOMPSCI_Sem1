import java.util.Scanner;
public class EX_03
{
	static int side;
	static double sa;
	
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//initalize variables
		System.out.println("Please enter side length:");
		side = kb.nextInt();
		
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
		System.out.println("The average of " + num1 + ", " + num2 + ", " + num3 + " is " + average);
	}
}