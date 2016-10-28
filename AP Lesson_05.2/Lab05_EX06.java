import java.util.Scanner;
public class Lab05_EX06
{
	static Scanner kb;
	
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
	}
	public static void passCheck()
	{
		System.out.println("Please enter your username");
		String username = kb.next();
		System.out.println("Please enter your password");
		String password =  kb.next();
		
		if (password.equals("piril") && username.equals("priya"))
		{
			System.out.println("You are granted access!");
		}	
		else if (password.equals("prirl"))
		{
			System.out.println("Your username is incorrect!");
			passCheck();
		}
		else if (username.equals("priya"))
		{
			System.out.println("Your password is incorrect!");
			passCheck();
		}	
		else
		{
			System.out.println("Your username and password are incorrect!");
			passCheck();
		}
		
	}
}