import java.util.Scanner;
public class UserClassDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("what is your first name? ");
		String firstname = kb.nextLine();
		System.out.println("What is your last name? ");
		String lastname = kb.nextLine();
		System.out.println("Do you want an avatar? (Y or N) ");
		String avatars = kb.nextLine();
		
		if(avatars.equals("N"))
		{
			UserClass user1 = new UserClass(firstname, lastname);
			System.out.println(user1);
		}
		else
		{
			System.out.println("what would you like your avatar name to be? ");
			String avs = kb.nextLine();
			UserClass user1 = new UserClass(firstname, lastname, avs);
			System.out.println(user1);
		}
	
	}
}