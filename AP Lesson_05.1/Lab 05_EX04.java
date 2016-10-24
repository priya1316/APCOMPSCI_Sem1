import java.util.Scanner;
public class Lab05_EX04
{
	static double height;
	static double weight;
	static double BMI;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter height in inches: ");
		height = kb.nextInt();
		System.out.println("Please enter weight in pounds: ");
		weight = kb.nextInt();
		
		BMI = (weight*703)/(height*height);
		calcCondish();
		
		System.out.println ("Your BMI is " + BMI);
		System.out.println("You are " + condition);
	}
	
	public static void calcCondish()
	{
		if (BMI > 39.9)
			condition = "Morbidly Obese";
		else if ( BMI > 35)
			condition = "Very Obese";
		else if (BMI > 30)
			condition= "Obese";
		else if (BMI > 25)
			condition = "Overweight";
		else if (BMI > 18.5)
			condition = "Normal";
		else 
			condition = "Underweight";		
	}
}