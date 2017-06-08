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

		mystery.readFile();
		for(int i = 0; i < mystery.linesArray.length; i++)
		{
			System.out.println(mystery.linesArray[i]);
			
			String response = kb.next();
			
			String answer = mystery.linesArray[i+1];
			if (answer.equals(mystery.linesArray[i+1]));
			{
				mystery.lives(response,answer);
			}
		}
		
	}
}
	
