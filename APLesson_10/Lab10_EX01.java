import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab10_EX01
{
	public static void main(String[]args)
	{
		Integer numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		
		gFactor();
		removePrimes();
	}
	
	public static int gFactor(int [] n)
	{
		for(int i = 0; i <= n.length; i++ )
		{
			if (n%number == 0)
				return 1
			else
				return 0
		}
	}
}