import java.util.Scanner;
public class Lab08_EX03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		System.out.println(luck(kb.nextInt()));
		
	}
	
	public static int luck(int num)
	{
		while(num > 0)
		{
			if(num%10 == 7)
			{
				return 1 + (luck(num/10));
			}
			else
			{
				return 0 + (luck(num/10));
			}
		}
		return 0;
	}
}