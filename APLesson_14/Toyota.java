public class Toyota implements Location
{
	private double [] location;
	private double xcoor;
	private double ycoor;
	
	public Toyota()
	{
		location = new double[2];
	}
	
	public Toyota(String z)
	{
		xcoor = Double.parseDouble(z.substring(0,1));
		ycoor = Double.parseDouble(z.substring(3));
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000) + 1;
	}
	
	public void move(double x, double y)
	{
		xcoor = x;
		ycoor = y;
	}
	
	public double[] getLoc()
	{
		double [] location = {xcoor, ycoor};
		return location;
	}
}