import java.util.Scanner;
public class Lab05_EX04
{
	static int height;
	static int weight;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter height in inches: ");
		int height = kb.nextInt();
		System.out.println("Please enter weight in pounds: ");
		int weight = kb.nextInt();
		
		double BMI = ((weight/height)*703);
		
		System.out.println ("Your BMI is " + BMI);
		System.out.println("You are " + condition);
		
	}
	
	public static double calcCondish(double BMI)
	{
		if (BMI > 39.9)
			return "Morbidly Obese";
		else if ( BMI > 35)
			return "Very Obese";
		else if (BMI > 30)
			return "Obese";
		else if (BMI > 25)
			condition = "Overweight";
		else if (BMI > 18.5)
			return "Normal";
		else 
			return "Underweight";
	}
}