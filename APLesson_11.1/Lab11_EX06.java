import java.util.Scanner;
import java.util.Arrays;
public class Lab11_EX06
{
	static int healthCount;
	static int HEALTHLOAD = 16; 
	static String[] health;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		String turn = "";
		int damage = 0;
		int amount = 0;
		
		healthCount = 6;
		health = new String[HEALTHLOAD];
		
		while(!(turn.equals("Q")) && healthCount > 0)
		{
			System.out.println("Your turn! Hit enter when ready: ");
			turn = kb.next();
			damage = 1 + (int)((Math.random()* 2));
			amount = 1 + (int)((Math.random()*6));
			System.out.println(takeDamage(damage,amount));
			printClip();	
		}
		System.out.println("You died!!!");
	}
	
	public static String takeDamage(int dmg, int amt)
	{
		if(dmg == 1)
		{
			healthCount = healthCount = amt;
			return ("Taking " + amt + " damage");
		}
		else
			if(healthCount + amt < HEALTHLOAD)
				healthCount = healthCount + amt;
			else
				healthCount = HEALTHLOAD;
			
		return ("Power Up " + amt + "!");
	}
	

	public static String printClip()
	{
		String output = "Health: \t";
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthCount)
				health[i] = " @ ";
			else
				health[i] = "[]";
			output+= health[i];
		}
		return output;
	}	
}