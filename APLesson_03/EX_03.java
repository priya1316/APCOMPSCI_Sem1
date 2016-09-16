import java.util.Scanner; //import Statement

public class EX_03
{
	public static void main(String[]args)
	{
		//instantiate the new scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("How many hours of TV do you watch in a day?");
		
		int tv = keyboard.nextInt();
		
		System.out.println("Ok, so you spend " + tv + " hours watching TV. How many hours do you spend doing homework?");
		
		int homework = keyboard.nextInt();
		
		System.out.println("Wow! How many hours of sleep do you get a night?");
		
		int sleep = keyboard.nextInt();
		
		System.out.println("Ok so, in a week you watch " + tv*7 + " hours of TV. You spend " + homework*7 + " hours doing homework. You only get " + sleep*7 + " hours of sleep in a week?!!");
		System.out.println("There are 24 hours in a day so you have " + (24 -(tv + homework + sleep + 6)) + " hours of free time each day, excluding when you are at school");
		System.out.println("You should get out more!");
		
		System.out.println("Which class gives you the most work?");
		
		String subject = keyboard.next();
		
		System.out.println("How many hours do you spend doing " + subject + " work?");
		
		int classhw = keyboard.nextInt();
		
		System.out.println("So you spend " + classhw*7 + " hours a week doing " + subject + " homework?! Wow you are hardcore." );
	}
}