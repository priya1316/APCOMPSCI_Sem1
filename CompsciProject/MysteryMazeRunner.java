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
		
		FileReader file = new FileReader("/Users/Priya/Desktop/Work_Space/Multani_Priyanka-master/CompsciProject/questions.txt");
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

	}
		
}
		
		
		/*List<String> qa = new ArrayList<String>();

		while((String line = reader.readLine()) != null)
		{
			qa.add(line);
			System.out.println(data);
		}
		
		reader.close();*/
		/*
		for(int i=-0; i<asdf.length(), i++)
		{
			System.out.println(asdf[i]);
			try
			{
				response = kb.next();
			}
			catch
			{
				ans = kb.nextInt();
			}
			if ans.equals == asdf[i+1]
			{
				//run some method
			}
		}
		*/
	
