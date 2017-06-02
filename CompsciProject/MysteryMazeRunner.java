import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
public class MysteryMazeRunner
{
	public static void main(String[]args) throw Exception
	{
		Scanner kb = new Scanner(System.in);
		FileInputStream in = new FileInputStream("questions.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		String strLine;
		String[] filearray;
		filearray = new String[10];

		while ((strLine = br.readLine()) != null) 
		{

			for (int j = 0; j < filearray.length; j++)
			{
				filearray[j] = br.readLine();
			}

		}
		in.close();
		
		
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