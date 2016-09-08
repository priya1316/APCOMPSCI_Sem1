import java.util.Scanner; //import Statement

public class RudeAI_EX01
{
	public static void main(String[]args)
	{
		//instantiate the new scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Hi, my name is RudeAI ");
		System.out.println("I'd like to ask you a few questions.");
		System.out.println("What is your name?");
		
		String name = keyboard.next();
		
		System.out.println(name);
		
		System.out.println("Professor_Handsome?!!! Why would anyone name a baby that?");
		System.out.println("How old are you, Professor_Handsome?");
		
		int age = keyboard.nextInt();
		
		System.out.println(age);
	}
}