import java.util.Scanner;
public class Lab06_EX05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an number: ");
		int number = kb.nextInt();
		System.out.println("Please enter number to count by: ");
		int number1 = kb.nextInt();
		
		for(int i = number1; i <= number; i+=number1)
		{
			System.out.print(i + " ");

		}
	}
	
}