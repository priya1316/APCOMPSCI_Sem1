import java.util.Scanner;
public class Lab05_EX02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Lab05_EX02 receipt = new Lab05_EX02();
		
		System.out.println("Please enter item 1: ");
		String item1 = kb.next();
		System.out.println("Please enter the price: ");
		double price1 = kb.nextDouble();
		
		String store= kb.nextLine();
		
		System.out.println("Please enter item 2: ");
		String item2 = kb.next();
		System.out.println("Please enter the price: ");
		double price2 = kb.nextDouble();
		
		String store1= kb.nextLine();
		
		System.out.println("Please enter item 3: ");
		String item3 = kb.next();
		System.out.println("Please enter the price: ");
		double price3 = kb.nextDouble();
		
		String store2= kb.nextLine();
		
		System.out.println("Please enter item 4: ");
		String item4 = kb.next();
		System.out.println("Please enter the price: ");
		double price4 = kb.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		//do this for all three items
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		receipt.format(item4, price4);
		
		//calculate subtotal, tax,total
		double subtotal = price1+price2+price3 + price4;
		receipt.format("Subtotal:", subtotal);
		double discount = calcDisc(subtotal);
		receipt.format("discount:", discount);
		double tax = 0.08*subtotal;
		receipt.format("Tax:", tax);
		double total = subtotal + tax;
		receipt.format("Total:", total);
		
		
		System.out.println("\n__________________________________________");
		System.out.println("* Thank you for your support *");
	}
	
	public static double calcDisc(double subtotal)
	{
		if (subtotal >= 2000)
			return subtotal*0.15;
		return 0.0;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("\n*%20s ........ %10.2f", item, price);
	}
}