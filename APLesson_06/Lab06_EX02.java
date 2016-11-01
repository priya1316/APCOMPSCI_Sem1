import java.util.Scanner;
public class Lab06_EX02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = kb.nextInt();
		int factorial = 1;
		for(int i = 1; i < number; i++)
		{
			factorial = factorial*i;
			System.out.println("Factorial is: " + factorial);

		}
	}
	
}