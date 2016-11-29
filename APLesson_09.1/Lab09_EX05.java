public class Lab09_EX05
{
	static int Array;
	
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		fillArray(numbers);
		
		System.out.println("For the following numbers...");
		printArray(numbers);
		System.out.println("The " + getOdds(numbers) + " are odd numbers");
	}
	
	public static void fillArray(int[] n)
	{
		for(int i=0; i < n.length; i++)
		{
			n[i] = (int)(Math.random() * 100) + 1;
		}
	}
	public static void printArray(int[] n)
	{
		for(int num : n)
		{
			System.out.print(num + " ");
		}
	}
	public static String getOdds(int[] n)
	{
		String odds = "";
		for(int num : n)
		{
			if(num % 2 != 0)
			{
				odds += " ";
				odds += num;
			}
		}
		return odds;
	}
}

