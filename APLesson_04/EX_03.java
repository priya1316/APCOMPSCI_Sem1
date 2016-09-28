import java.util.Scanner;
public class EX_03
{
	public static void main(String[]args)
	{
		//new test object
		EX_03 form = new EX_03();
		//new Scanner object
		Scanner kb = new Scanner(System.in);
		EX_03 formula = new EX_03();
		
		//user inputs
		System.out.println("Please enter rate: ");
		
		double rate = kb.nextDouble();
		
		String store= kb.nextLine();
		
		System.out.println("Please enter principle: ");
		double princpl = kb.nextDouble();
		
		String store1= kb.nextLine();
		
		System.out.println("Please enter time: ");
		double time = kb.nextDouble();
		
		
		String store2 = kb.nextLine();
		
		System.out.println("Please enter number: ");
		double number = kb.nextDouble();
		
		//method call
		double total = formula.payment(princpl,rate,number,time);
		
		System.out.printf("Your payment would be %.2f.", total);
	}	
	
	public static double payment(double p, double r, double n, double t)
	{
		return (p*Math.pow((1+(r/n)), (n*t)));
		
	}
}