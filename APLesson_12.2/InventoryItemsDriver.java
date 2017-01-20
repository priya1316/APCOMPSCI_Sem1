import java.util.Scanner;
public class InventoryItemsDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("what is the item manufacturer ");
		String m = kb.nextLine();
		System.out.println("What is the item name ");
		String N = kb.nextLine();
		System.out.println("Do you want to add a category and price? (Y or N) ");
		String op = kb.nextLine();
		
		if(op.equals("N"))
		{
			InventoryItems user1 = new InventoryItems(m, N);
			System.out.println(user1);
		}
		else
		{
			System.out.println("what is the category of the item? ");
			String c = kb.nextLine();
			System.out.println("What is the item price?");
			int amt = kb.nextInt();
			InventoryItems user1 = new InventoryItems(m, N, c, amt);
			System.out.println(user1);
		}
	
	}
}