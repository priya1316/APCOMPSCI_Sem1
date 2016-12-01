public class Lab09_EX05
{
	static int[] numbers = new int[10];
	
	public static void main(String[]args)
	{
		fillArray();
		
		System.out.println("For the following numbers...");
		printArray();
		System.out.println("\nThe" + getOdds(numbers) + " are odd numbers");
	}
	
	public static void fillArray()
	{
		for(int i=0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	public static void printArray()
	{
		for(int num : numbers)
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