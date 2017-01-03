import java.util.Scanner;
public class Lab11_EX04
{
	public static void main(String[]args)
	{
		//filling the array
		int[][]num = new int [4][4];
		
		
		for(int i = 0; i < num.length; i++)
		{
			for (int j = 0; j < num[i].length; j++)
			{
				num[i][j] = 1 + (int)((Math.random()* 100));
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int divisor = kb.nextInt();
		
		//search the array
		int count = 0;
		for(int i = 0; i < num.length; i++)
		{
			for(int j = 0; j < num[i].length; j++)
			{
				if(num[i][j] % divisor == 0)
				{
					count++;
				}
			}
		}
		System.out.println("There are " + count + " numbers divisible by " + divisor + " in the Array.");
	
	
	
	}
}