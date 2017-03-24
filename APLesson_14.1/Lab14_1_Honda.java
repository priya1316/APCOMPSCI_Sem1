public class Lab14_1_Honda extends Lab14_1_Car
{
	private double xcoor;
	private double ycoor;
	
	public Lab14_1_Honda(double [] s)
	{
		super();
		move(s[0], s[1]);
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