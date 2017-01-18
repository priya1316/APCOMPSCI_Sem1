import java.lang.Math.*;
public class Distance
{
	//instance variables
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	//Default constructor 
	public Distance()
	{
		//default values for instance variables
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
	}
	
	//Constructor with parameters
	public Distance(int xO, int yO, int xT, int yT)
	{
		xOne = xO;
		yOne = yO;
		xTwo = xT;
		yTwo = yT;
	}
	
	//Modifier
	public void setValues(int xO, int yO, int xT, int yT)
	{
		xOne = xO;
		yOne = yO;
		xTwo = xT;
		yTwo = yT;
	}
	
	//Accessor
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne) + (yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
	public int getxOne()
	{
		return xOne;
	}
	public int getyOne()
	{
		return yOne;
	}
	public int getxTwo()
	{
		return xTwo;
	}
	public int getyTwo()
	{
		return yTwo;
	}
	
}