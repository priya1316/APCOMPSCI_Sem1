import java.util.Scanner;
public class Lab09_EX01
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		
		//fills the array
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		System.out.print("In order...");
		
		//print the array
		for(String word: words)
		{
			System.out.print("\"" + word + "\", ");
		}
		System.out.println();
		System.out.print("Reversed... ");
		
		reverse(words);
	}
	
	public static void reverse(String [] n)
	{
		for(int i = n.length -1; i >= 0; i--)
		{
			System.out.print("\"" + n[i] + "\", ");
		}
	}
}