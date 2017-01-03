import java.util.Scanner;
public class Lab11_EX02
{
	public static void main(String[]args)
	{
		String [][] randLetters = new String [4][4];
		
		
		int spot = 0;
		for(int i = 0; i < randLetters.length; i++)
		{
			for(int j = 0; j < randLetters[i].length; j++)
			{
				Scanner kb = new Scanner(System.in);
				System.out.println("Please enter a word: ");
				randLetters[i][j] = kb.nextLine();
			}
		}
		
		for(int i = 0; i < randLetters.length; i++)
		{
			for(int j = 0; j < randLetters[i].length; j++)
			{
				System.out.print(randLetters[i][j] + "\t");
			}
			System.out.println();
		}
	}
}