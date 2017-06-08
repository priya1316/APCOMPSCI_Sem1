import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;
public class MysteryMaze
{
	static int LIVES = 3;
	static int point = 0;
	static String answer;
	static String response;
	static String[] linesArray;
	
	
	public static void readFile() throws Exception
	{
		FileReader file = new FileReader("/Users/multanip7501/Desktop/Multani_Priyanka/CompsciProject/questions.txt");
		BufferedReader reader = new BufferedReader(file);

		List<String> lines = new ArrayList<String>();

		/*String text = "";*/
		String line = reader.readLine();
		while (line != null)
		{
			/*text += line;*/
			lines.add(line);
			line = reader.readLine();
		}

		reader.close();

		/*return lines.toArray(new String[0]);*/

		linesArray = lines.toArray(new String[0]);
		
	}
	public static String character()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Choose your character!");
		String character = kb.next();
		if(character.equals("Gertrude"))
		{
			return "You picked Gertrude! Great choice!";
		}
		else if(character.equals("Billy Bob Joe"))
		{
			return "You picked Billy Bob Joe! Awesome!";
		}
		else
		{
			return "Please pick a character.";
		}
	}
	public static void lives(String response, String answer)
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
		for(int i = 0; i <= point; i++)
		{
			if(point % 4 == 0)
			{
				System.out.println("Power up! You get an extra life!");
				LIVES++; 
			}
		}
	}
	public static void SkipQuestion()
	{
		for(int i = 0; i <= point; i++)
		{
			if(point % 10 == 0)
			{
				System.out.println("Congratulations, you will skip this next question!");
				continue;
			}
		}
	}
	public static void DoubleLoss()
	{
		if(point == 25)
		{
			System.out.println("You are at 25 points! Watch out! Now, every question wrong is minus 2 lives.");
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