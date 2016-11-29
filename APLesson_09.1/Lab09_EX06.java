public class Lab09_EX06
{
	static int[] numbers = new int[10];
	
	public static void main(String[]args)
	{
		fillArray();
		
		System.out.println("For the following numbers...");
		printArray();
		System.out.println("\nThe biggest number is " + getBiggest(numbers));
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
	public static int getBiggest(int[] n)
	{
		int max = 0;
		for(int num : n)
		{
			if(num > max)
			{
				max = num;
			}
		}
		return max;
	}
}