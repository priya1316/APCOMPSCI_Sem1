public class EX_01
{
	public static void main(String[]args)
	{
		//new test object
		EX_01 receipt = EX_01();
		//new Scanner object
		Scanner kb = new Scanner(System.in);
		
		//3 sets of variables - 1 for each item 
		System.out.println("Please enter item1: ");
		String item1= kb.nextLine();
		System.out.println("Please enter price: ")
		String price1 = nextDouble();
		
		System.out.println("<<<<<<receipt>>>>>>");
		//do this for all three items
		receipt.format(item1,price1);
		
		//calculate subtotal, tax,total
		subtotal = //add all the item prices
		receipt.format("Subtotal: ", subtotal);
		//do the same thing for tax and total
		
	}
	
	public void format(String item, double price)
	{
		//formatting statemen goes here
		//
	}
}