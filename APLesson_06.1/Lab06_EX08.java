import java.util.Scanner;
public class Lab06_EX08
{
	public static void main(String[]args)
	{

		sing("Na",4);
		sing("Na",4);
		sing("Hey",3);
		sing("Goodbye!",1);
		
	}
	
	public static void sing(String word, int num)
	{
		for(int i = 0; i<num; i++)
		{
			System.out.print(word + " ");
		}
		System.out.print("\n");
	}
}