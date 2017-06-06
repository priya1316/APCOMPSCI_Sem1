import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;
public class MysteryMazeRunner
{
	public static void main(String[]args) throws Exception
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
			/*System.out.println(Arrays.toString(lines));*/
			line = reader.readLine();
		}

		reader.close();

		/*return lines.toArray(new lines[0]);*/

		String[] linesArray = lines.toArray(new String[0]);

		for(String s : linesArray)
		{
			System.out.println(s);
		}
		
		MysteryMaze mystery = new MysteryMaze();
		Scanner kb = new Scanner(System.in);

	
		for(int i=-0; i<lines.length(), i++)
		{
			System.out.println(lines[i]);
			try
			{
				response = kb.next();
			}
			catch
			{
				answer = kb.next();
			}
			if (answer.equals == lines[i+1]);
			{
				lives();
			}
		}
		
	}
}
	
