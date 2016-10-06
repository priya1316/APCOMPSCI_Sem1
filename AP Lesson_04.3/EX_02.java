import java.util.Scanner;
public class EX_02
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//initialize variables
		System.out.println("Please enter num1:");
		double num1 = kb.nextDouble();
		System.out.println("Please enter num2:");
		double num2 = kb.nextDouble();
		System.out.println("Please enter num3:");
		double num3 = kb.nextDouble();
		
		print(num1, num2, num3, average(num1, num2, num3));
		
	}
	public static double average(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3;
	}
	public static void print(double one, double two, double three, double average)
	{
		//print using new perimeter value 
		System.out.printf("The average of " + one + ", " + two + ", " + three + " is %.5f ",average);
	}
}