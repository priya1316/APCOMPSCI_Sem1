import java.util.Scanner;
public class EX_01
{
	public static void main(String[]args)
	{
		//new test object
		EX_01 receipt = new EX_01();
		//new Scanner object
		Scanner kb = new Scanner(System.in);
		
		//3 sets of variables - 1 for each item 
		System.out.println("Please enter item1: ");
		String item1 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price1 = kb.nextDouble();
		String iluvethan = kb.nextLine();
		System.out.println("Please enter item2: ");
		String item2= kb.nextLine();
		String store= kb.next();
		System.out.println("Please enter price: ");
		double price2 = kb.nextDouble();
		System.out.println("Please enter item3:");
		String item3= kb.nextLine();
		System.out.println("Please enter price: ");
		double price3 = kb.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		//do this for all three items
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		
		//calculate subtotal, tax,total
		double subtotal = price1+price2+price3;
		receipt.format("Subtotal: ", subtotal);
		//do the same thing for tax and total
		
	}
	
	public void format(String item, double price)
	{
		//formatting statement goes here
		//
	}
}