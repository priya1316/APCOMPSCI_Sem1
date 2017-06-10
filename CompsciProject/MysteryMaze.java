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
	static String c;
	
	
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
		System.out.println("Choose your character! Gertrude or Billy Bob Joe?");
		c = kb.next();
		if(c.equals("Gertrude"))
		{
			return ("You picked Gertrude! Great choice!");
		}
		else if(c.equals("Billy Bob Joe"))
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
			System.out.println("Congrats! You have " + point + " points!");
			System.out.println("You have " + LIVES + " lives left.");
		}
		else
		{
			LIVES--;
			System.out.println("Sorry that is not correct. You have " + LIVES + " lives left.");
			System.out.println("You have " + point + " points.");
		}
	}
	public static void addLife()
	{
		
		if(point % 4 == 0)
		{
			System.out.println("Power up! You get an extra life!");
			LIVES++; 
			System.out.println("You now have " + LIVES + " lives left.");
			System.out.println("You now have " + point + " points.");
		}
		
	}
	public static void addPoints()
	{
	
		if(point % 5 == 0)
		{
			System.out.println("Congratulations, you get double the points for this question!");
			point += 2;
			System.out.println("You now have " + point + " points!");
			System.out.println("You have " + LIVES + " lives left.");
			
		}
		
	}
	public static void doubleLife()
	{
		if(point % 10 == 0)
		{
			System.out.println("Nice! You just doubled the number of lives you have!");
			LIVES += LIVES;	
			System.out.println("You now have " + LIVES + " lives");	
			System.out.println("You have " + point + " points.");
		}
	}
}
