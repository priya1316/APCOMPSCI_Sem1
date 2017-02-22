public class Advance extends Ticket
{
	private int daysLeft; 
	
	//default constructor 
	public Advance()
	{
		super();
	}
	
	//constructor with parameters
	public Advance(int d)
	{
		super();
	}

	public int getPrice()
	{
		if (daysLeft >= 10)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}
}