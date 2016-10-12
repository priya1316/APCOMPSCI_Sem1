import java.util.Random;
import java.util.Scanner;
public class Lab05_EX01
{
	static int player;
	static int computer;
	static String winner;
	
	public static void main(String[]args)
	{
		player = (int)(Math.random()*6)+1;
		computer = (int)(Math.random()*6)+1;
		diceRoll();
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("And the winner is " + winner);
	}
	
	public static void diceRoll()
	{
		if(player > computer)
			winner = "player";
			
		if(computer > player)
			winner = "computer";	

	}
}