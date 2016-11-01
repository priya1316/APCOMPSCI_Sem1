import java.util.Scanner;
public class Lab05_EX05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you to be part of... "+ 
							"\n 1. Marvel Characters" + 
							"\n 2. DC Characters");
		int marvelOrDc = kb.nextInt();
		if(marvelOrDc == 1)
		{
			System.out.println("Who do you like better..." + 
								"\n 1. Thor" + 
								"\n 2. Loki");
			int thorOrLoki = kb.nextInt();
			if(thorOrLoki == 1)
			{
				System.out.println("Aswesome. Answer this question for a prize. Do you know who Thor's father is?");
				kb.nextLine();
				String thorAnswer = kb.nextLine();
				if(thorAnswer.equals("Odin"))
				{
					System.out.println("Correct! Next time Thor is on Earth, he will take you back to Asgard!");
				}	
				else
				{
					System.out.println("Sorry, that is wrong.");
				}
					
				
			}
			
			else
			{
				System.out.println("Great. Answer this question for a prize. Who play's Loki in the movies?");
				kb.nextLine();
				String lokiAnswer = kb.nextLine();
				if(lokiAnswer.equals("Tom Hiddleston"))
				{
					System.out.println("Correct! You just won a free ticket to go see him in Vegas!");
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
				System.out.println("I love Wolverine too! Answer this question for a prize. Was Wolverine a natural mutant?");
				kb.nextLine();
				String wolfAnswer = kb.nextLine();
				if (wolfAnswer.equals("no"))
				{
					System.out.println("Correct! You just won a chance to become a mutant yourself!");
				}
					
				else
				{
					System.out.println("Sorry, that is wrong.");
				}	
			}
				
			else 
			{
				System.out.println("He is the smart guy. Answer this question for a prize. What object caused Professor X to be in a wheelchair?");
				kb.nextLine();
				String profAnswer = kb.nextLine();
				if(profAnswer.equals ("a bullet"))
				{
					System.out.println("Correct! You just won a free lesson with Professor X. He will teach you how to mind read!");
				}
					
				else
				{
					System.out.println("Sorry, that is wrong.");
				}
					
			}
				
		}	
			
	}
}