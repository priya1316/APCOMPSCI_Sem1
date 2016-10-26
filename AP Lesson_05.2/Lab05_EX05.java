import java.util.Scanner;
public class Lab05_EX05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like a question about... "+ 
							"\n 1. Marvel Characters" + 
							"\n 2. DC Characters");
		int marvelOrDc = kb.nextInt();
		if(marvelOrDc == 1)
		{
			System.out.println("Would you like a question about..." + 
								"\n 1. Thor" + 
								"\n 2. Loki");
			int thorOrLoki = kb.nextInt();
			if(thorOrLoki == 1)
			{
				System.out.println("Who is Thor's father?");
				kb.nextLine();
				String thorAnswer = kb.nextLine();
				if(thorAnswer.equals("Odin"))
				{
					System.out.println("Correct!");
				}	
				else
				{
					System.out.println("Sorry, that is wrong.");
				}
					
				
			}
			
			else
			{
				System.out.println("Who is Loki's real father?");
				kb.nextLine();
				String lokiAnswer = kb.nextLine();
				if(lokiAnswer.equals("Laufey"))
				{
					System.out.println("Correct!");
				}
					
				else
				{
					System.out.println("Sorry, that is wrong.");
				}
					
			}	
		}		
		else 
		{
			System.out.println("Would you like a question about..."+
								"\n 1. Wolverine"+
								"\n 2. Professor X");
			int wolfOrProf = kb.nextInt();
			if(wolfOrProf == 1)
			{
				System.out.println("Was Wolverine a natural mutant?");
				kb.nextLine();
				String wolfAnswer = kb.nextLine();
				if (wolfAnswer.equals("no"))
				{
					System.out.println("Correct");
				}
					
				else
				{
					System.out.println("Sorry, that is wrong.");
				}	
			}
				
			else 
			{
				System.out.println("What object caused Professor X to be in a wheelchair?");
				kb.nextLine();
				String profAnswer = kb.nextLine();
				if(profAnswer.equals ("a bullet"))
				{
					System.out.println("Correct!");
				}
					
				else
				{
					System.out.println("Sorry, that is wrong.");
				}
					
			}
				
		}	
			
	}
}