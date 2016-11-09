import java.util.Scanner;
public class Lab07_EX04
{
	static String sentence;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		number = kb.nextInt();
		
		replace();
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	public static void replace()
	{
		while()
		{
			sum += (num % 10);
			num /= 10;
		}
	}
}