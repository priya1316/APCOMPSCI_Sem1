import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;
public class MysteryMazeRunner
{
	public static void main(String[]args) throws Exception
	{
		
		MysteryMaze mystery = new MysteryMaze();
		Scanner kb = new Scanner(System.in);

		ArrayList lines = mystery.readFile();
		for(int i=0; i<lines.size(); i+=2)
		{
			System.out.println(lines.get(i));
			
			String response = kb.next();
			
			String answer = lines.get(i+1);
			if (answer.equals(lines.get(i+1)));
			{
				lives(response,answer);
			}
		}
		
	}
}
	
