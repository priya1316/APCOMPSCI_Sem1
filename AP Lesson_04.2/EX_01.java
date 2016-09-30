import java.util.Scanner;
public class EX_01
{
	static int l,w;
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//initialize variables
		System.out.println("Please enter your length:");
		l = kb.nextInt();
		System.out.println("Please enter your width:");
		w = kb.nextInt();
		
		//method calls 	
		print(calcPerim(l,w));
		//new Scanner object
			
	}
	public static int calcPerim(int l, int w)
	{
		return (2*(l+w));
		// use l, w directly 
	}
	public static void print(int perimeter)
	{
		//print using new perimeter value 
		System.out.println("The perimeter of your rectange is " + perimeter);
	}
}