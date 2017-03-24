public abstract class Lab14_2_Car implements Lab14_2_Location
{
	private int ID;
	private double [] location = new double[2];
	
	public Lab14_2_Car()
	{
		ID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}