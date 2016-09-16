import java.util.Scanner; //import Statement

public class EX_02
{
	public static void main(String[]args)
	{
		//instantiate the new scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Hello, today I am going to calculate your BMI.");
		System.out.println("What is your weight in pounds?");
		
		double weight = keyboard.nextDouble();
		
		System.out.println("Perfect. Now what is your height in inches?");
		
		double height = keyboard.nextDouble();
		
		System.out.println("Okay! Your BMI is " + (703*weight)/(height*height) + ".");
	}
}