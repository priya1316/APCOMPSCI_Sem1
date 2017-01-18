public class HumanDriver
{
	public static void main (String[]args)
	{
		HumanClass object = new HumanClass("black", "black", "brown");
		
		System.out.println("<<<<<<<<<<< My info >>>>>>>>>>>");
		System.out.println("Hair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
	

		object.setHES("blonde", "green", "tan");
		System.out.println("<<<<<<<<<<< Friend's Info >>>>>>>>>>>");
		System.out.println("Hair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
	
	}
}
