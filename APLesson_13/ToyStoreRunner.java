import java.util.Scanner;

public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		String toyslist = "";
		Scanner kb = new Scanner(System.in);
		System.out.println("enter a list of toys: ");
		toyslist = kb.nextLine();
		
		ToyStore toy = new ToyStore(toyslist);
		System.out.println(toy);
		System.out.println("The most frequent toy: " + toy.getMostFrequentToy());
		System.out.println("the most frequent type of toy: " + toy.getMostFrequentType());
	}
}