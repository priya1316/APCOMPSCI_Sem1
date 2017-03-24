import java.util.ArrayList;
import java.util.Arrays;

public class Lab14_1_Toyota extends Lab14_1_Car
{
	private double xcoor;
	private double ycoor;
	
	public Lab14_1_Toyota(String s)
	{
		super();
	
		ArrayList<String> position = new ArrayList<>(Arrays.asList(s.split(", ")));
		Double sX = Double.parseDouble(position.get(0));
		Double sY = Double.parseDouble(position.get(1));
		move(sX, sY);
	}
	
	public void move(double x, double y)
	{
		this.xcoor += x;
		this.ycoor += y;
	}
	
	public double[] getLoc()
	{
		double [] location = {xcoor, ycoor};
		return location;
	}
}