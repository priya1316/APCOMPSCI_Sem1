import java.util.Scanner;
public class DistanceRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the first x coordinate ");
		int x1 = kb.nextInt();
		System.out.println("Please enter the first y coordinate ");
		int y1 = kb.nextInt();
		System.out.println("Please enter the second x coordinate ");
		int x2 = kb.nextInt();
		System.out.println("Please enter the second y coordiante ");
		int y2 = kb.nextInt();
		
		Distance object = new Distance(x1, y1, x2, y2);
		
		System.out.println("<<<<<<<<<<< Distance >>>>>>>>>>>");
		System.out.println("The distance between (" + object.getxOne() + "," + object.getyOne() + ") and (" + object.getxTwo() + "," + object.getyTwo() + ") is " + object.getDist());
		

		object.setValues(2, 4, 7, 9);
		System.out.println("<<<<<<<<<<< Distance >>>>>>>>>>>");
		System.out.println("The distance between (" + object.getxOne() + "," + object.getyOne() + ") and (" + object.getxTwo() + "," + object.getyTwo() + ") is " + object.getDist());

	}
}