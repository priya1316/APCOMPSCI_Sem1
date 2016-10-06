import java.util.Scanner;
public class EX_01
{
	static double l,w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//initalize variables
		System.out.println("Please enter your length:");
		l = kb.nextDouble();
		System.out.println("Please enter your width:");
		w = kb.nextDouble();
		
		//method calls
		calcPerim();
		print();
	}
	public static void calcPerim()
	{
		perimeter = (2*l)+ (2*w);
	}
	public static void print()
	{
		//print using the new perimeter value
		System.out.printf("The perimeter of  your rectangle is %.5f",perimeter);
	}
}