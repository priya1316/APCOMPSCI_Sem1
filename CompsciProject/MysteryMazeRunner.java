import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
public class MysteryMazeRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		character();
		filename = new FileInputStream ("questions.txt");
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		List<String> qa = new ArrayList<String>();

		while((String line = reader.readLine()) != null)
		{
			qa.add(line);
			System.out.println(data);
		}
		
		reader.close();
		
		for(int i=-0; i<asdf.length(), i++)
		{
			System.out.println(asdf[i]);
			try
			{
				ans = kb.next();
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
	}
}