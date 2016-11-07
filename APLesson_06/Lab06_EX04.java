import java.util.Scanner;
public class Lab06_EX04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int integer = kb.nextInt();
		System.out.println("Please enter the size of the table: ");
		int table = kb.nextInt();
		
		for(int i = 1; i <= table; i++)
		{
			int output = integer*i;
			System.out.println(i + "|" + output);

		}
	}
	
}