public class Lab14_1_GMC extends Lab14_1_Car
{
	private double xcoor;
	private double ycoor;

	
	public Lab14_1_GMC(double x, double y)
	{
		super();
		move(x,y);
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