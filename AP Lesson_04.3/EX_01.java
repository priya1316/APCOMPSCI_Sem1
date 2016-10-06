import java.util.Scanner;
public class EX_01
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//initialize variables
		System.out.println("Please enter your length:");
		double l = kb.nextDouble();
		System.out.println("Please enter your width:");
		double w = kb.nextDouble();
		
		print(calcPerim(l,w));
		
	}
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	}
	public static void print(double perimeter)
	{
		//print using new perimeter value 
		System.out.printf ("The perimeter of your rectangle is %.5f", perimeter);
	}
}