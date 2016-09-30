import java.util.Scanner;
public class EX_04
{
	public static void main(String[]args)
	{
		//new Scanner object
		Scanner kb = new Scanner(System.in);
		EX_04 formula = new EX_04();
		
		//user inputs
		System.out.println("Please enter height: ");
		
		double height = kb.nextDouble();
		
		System.out.println("Please enter width: ");
		double width = kb.nextDouble();
		
		System.out.println("Please enter length: ");
		double length = kb.nextDouble();
		
		//method call
		double volume = formula.volume(height,width,length);
		double calcVolume = volume/1728;
		
		System.out.printf("Your volume would be %.2f cubic feet", calcVolume);
	}
	public static double volume(double height, double width, double length)
	{
		return (height*width*length);
	}
	
}