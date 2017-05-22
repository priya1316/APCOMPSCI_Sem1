import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class MysteryMaze
{
	static int LIVES = 3
	
	public static String character()
	{
		System.out.println("Choose your character!");
		int character = kb.next();
		if(response.equals("Gertrude"))
		{
			System.out.println("You picked Gertrude! Great choice!");
		}
		if else(response.equals("Billy Bob Joe"))
		{
			System.out.println("You picked Billy Bob Joe! Awesome!");
		}
		else
		{
			System.out.println("Please pick a character.");
		}
	}
	public static void lives()
	{
		if(response.equals(answer))
		{
			point++;
		}
		else
		{
			LIVES--;
		}
	}
	public static void AddLife()
	{
		for(int i = 0; i = question.length(); i++)
		{
			if(question[i]/4 == 0)
			{
				System.out.println("Power up! You get an extra life!")
				LIVES++; 
			}
		}
	}
	public static void SkipQuestion()
	{
		for(int i = 0; i = point; i++)
		{
			if(point/10 == 0)
			{
				System.out.println("Congratulations, you will skip this next question!")
				continue
			}
		}
	}
	public static void DoubleLoss()
	{
		if(point == 25)
		{
			System.out.println("You are at 25 points! Watch out! Now, every question wrong is minus 2 lives.")
			if(response.equals(answer))
			{
				LIVES++; 
			}
			else
			{
				LIVES = LIVES-= 2;
			}
		}
	}
}