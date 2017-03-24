public abstract class Lab14_1_Car implements Lab14_1_Location
{
	private int ID;
	private double [] location; 
	
	public Lab14_1_Car()
	{
		ID = (int)(Math.random() * 1000000) + 1;
		location = new double[2];
	}
	
	public abstract void move(double x, double y);
	
	public int getID()
	{
		return ID;
	}
}