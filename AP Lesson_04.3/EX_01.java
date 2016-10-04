import java.util.Scanner;
public class EX_01
{
	static int l,w;
	static int perimeter;
	
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//initalize variables
		System.out.println("Please enter your length:");
		l = kb.nextInt();
		System.out.println("Please enter your width:");
		w = kb.nextInt();
		
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
		System.out.println("The perimeter of your rectangle is " + perimeter);
	}
}