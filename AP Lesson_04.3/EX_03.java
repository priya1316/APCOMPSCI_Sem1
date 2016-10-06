import java.util.Scanner;
public class EX_03
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//initialize variables
		System.out.println("Please enter side length:");
		double side = kb.nextDouble();
		
		print(side, calcSurf(side));
		
	}
	public static double calcSurf(double side)
	{
		return 6*(side*side)
	}
	public static void print(double side, double calcSurf)
	{
		//print using new perimeter value 
		System.out.printf("The surface area of a cube whose sides are " + side + " in length is %.5f ",calcSurf);
	}
}