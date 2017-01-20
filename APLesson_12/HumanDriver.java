import java.util.Scanner;
public class HumanDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("what color is your hair? ");
		String hairs = kb.nextLine();
		System.out.println("What color are your eyes? ");
		String eye = kb.nextLine();
		System.out.println("What color is your skin? ");
		String skins = kb.nextLine();
		
		HumanClass object = new HumanClass(hairs, eye, skins);
		
		System.out.println("<<<<<<<<<<< My info >>>>>>>>>>>");
		System.out.println("Hair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
	

		object.setHES("blonde", "green", "tan");
		System.out.println("<<<<<<<<<<< Friend's Info >>>>>>>>>>>");
		System.out.println("Hair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
	
	}
}
