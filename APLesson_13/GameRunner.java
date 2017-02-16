import java.util.Scanner;
public class GameRunner
{
	public static void main(String[]args)
	{
		PlayStation ps = new PlayStation("PS3");
		System.out.println(ps);
		
		Xbox xb = new Xbox("Xbox 360");
		System.out.println(xb);
		
		ThePCClass pc = new ThePCClass("PC");
		System.out.println(pc);
		
	}
}