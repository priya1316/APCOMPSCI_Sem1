import java.util.Random;
public abstract class Ticket
{
	private int serialNo;
	
	//default constructor 
	public Ticket()
	{
		this.serialNo = 0; 
	}
	
	//Accessors
	public abstract int getPrice();
	
	public int getSerialNo()
	{
		return (int)(Math.random() * 1000000) + 1; 
	}
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
}