import java.util.Scanner;
public class CarDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("what color is the car? ");
		String color = kb.nextLine();
		System.out.println("What is the interior? ");
		String inside = kb.nextLine();
		System.out.println("What kind of engine? ");
		String gas = kb.nextLine();
		System.out.println("What size tires? ");
		String wheels = kb.nextLine();
		
		CarClass object = new CarClass(color, inside, gas, wheels);
		
		System.out.println("<<<<<<<<<<< Car >>>>>>>>>>>");
		System.out.println("Paint: " + object.getPaint() + "\nInterior: " + object.getInterior() + "\nEngine: " + object.getEngine() + "\nTires: " + object.getTires());
	

		object.setCustom("red", "corinthian leather", "5 liter v8 507 hp", "20'' Priellis");
		System.out.println("<<<<<<<<<<< Car >>>>>>>>>>>");
		System.out.println("Paint: " + object.getPaint() + "\nInterior: " + object.getInterior() + "\nEngine: " + object.getEngine() + "\nTires: " + object.getTires());		

	}
}
