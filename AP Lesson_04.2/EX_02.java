import java.util.Scanner;
public class EX_02
{
	static double num1,num2,num3;
	static double average;
	
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//initalize variables
		System.out.println("Please enter num1:");
		num1 = kb.nextDouble();
		System.out.println("Please enter num2:");
		num2 = kb.nextDouble();
		System.out.println("Please enter num3:");
		num3 = kb.nextDouble();
		
		//method calls
		Average();
		print();
	}
	public static void Average()
	{
		average = (num1 + num2 + num3)/3;
	}
	public static void print()
	{
		//print using the new average value
		System.out.printf("The average of " + num1 + ", " + num2 + ", " + num3 + " is %.5f ",average);
	}
}