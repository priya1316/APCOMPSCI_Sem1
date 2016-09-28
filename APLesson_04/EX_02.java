import java.util.Scanner;
public class EX_02
{
	public static void main(String[]args)
	{
		//new test object
		EX_02 form = new EX_02();
		//new Scanner object
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String firstname = kb.nextLine();
		System.out.println("Enter your last name ");
		String lastname = kb.nextLine();
		System.out.println("Enter your title: ");
		String title = kb.nextLine();
		System.out.println("Enter the school site: ");
		String site = kb.nextLine();
		System.out.println("Enter the school year: ");
		String year = kb.nextLine();
		System.out.println("What is your subject: ");
		String subject = kb.nextLine();
		
		System.out.println("************************************");
		form.format(site, year);
		form.format(firstname, lastname);
		form.format(title, subject);
		System.out.println("************************************");
	}
	public void format(String one, String two)
	{
		//formatting statement goes here
		//use item and price in your format statement
		System.out.printf("*%13s%20s *\n", one, two);
		
		
	}
}

system.out.printf("your payment would be %.2f.", payment)