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
				System.out.println("Who is Thor's father?");
				String thorAnswer = kb.nextLine();
				if(thorAnswer.equals("Odin"))
					System.out.println("Correct!");
				else
					System.out.println("Sorry, that is wrong.");
			
			else
				System.out.println("Who is Loki's real father?");
				String  lokiAnswer = kb.nextLine();
				if(lokiAnswer.equals("kin"))
					System.out.println("Correct!");
				else
					System.out.println("Sorry, that is wrong.")
		else 
				
			if(mathAnswer == 4)
			{
				System.out.println("Correct");
				
			}
			else
				System.out.println("No! Wrong! You Lose!");
		}
		else
		{
			System.out.println("Who said the phrase \"Whatever you are be a good one.\"?");
			kb.nextLine();
			String wordAnswer = kb.nextLine();
			if(wordAnswer.equals("Abraham Lincoln"))
			{
				System.out.println("Correct!");
				
			}
			else
				System.out.println("No! Wrong! You Lose!");
		}
	}