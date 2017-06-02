import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
public class MysteryMazeRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		/*filename = new FileInputStream ("questions.txt");*/
		BufferedReader reader = new BufferedReader(new FileReader("questions.txt"));
		try 
		{
			StringBuilder sb = new StringBuilder();
			String line = reader.readLine();

			while (line != null) 
			{
				sb.append(line);
				sb.append(System.lineSeparator());
				line = reader.readLine();
			}
    
			String everything = sb.toString();
		} 
		finally 
		{
			reader.close();
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
	}
}