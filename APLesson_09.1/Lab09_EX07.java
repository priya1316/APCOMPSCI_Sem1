import java.util.Scanner;
public class Lab09_EX07
{
	static String[] words = new String[5];
	
	public static void main(String[]args)
	{
		fillArray();
		
		System.out.println("For the words...");
		printArray();
		System.out.println("\nOnly [" + hasZs(words) + " ] contain(s) the letter z");
	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	public static void printArray()
	{
		for(String wrds : words)
		{
			System.out.print(wrds + " ");
		}
	}
	public static String hasZs(String [] w)
	{
		String zs = "";
		for(String wrds : w)
		{
			if(wrds.indexOf("z") >= 0)
			{
				zs += wrds;
				zs += " ";
			}
		}
		return zs;
	}
}