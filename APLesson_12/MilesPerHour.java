import java.lang.Math.*;
public class MilesPerHour
{
	//instance variables
	private int distance, hours, minutes;
	private double milesperhr;
	
	//Default constructor 
	public MilesPerHour()
	{
		//default values for instance variables
		distance = 0;
		hours = 0;
		minutes = 0;
		milesperhr = 0;
	}
	
	//Constructor with parameters
	public MilesPerHour(int dist, int hr, int min)
	{
		distance = dist;
		hours = hr;
		minutes = min;
		milesperhr = 0;
	}
	
	//Modifier
	public void setValues(int dist, int hr, int min)
	{
		distance = dist;
		hours = hr;
		minutes = min;
		milesperhr = 0;
	}
	
	//Accessor
	public double getMPH()
	{
		milesperhr = Math.round(distance / (hours + minutes / 60.0));
		return milesperhr;
	}
	public int getDistance()
	{
		return distance;
	}
	public int getHours()
	{
		return hours;
	}
	public int getMinutes()
	{
		return minutes;
	}
	
}