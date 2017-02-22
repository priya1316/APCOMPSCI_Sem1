public class StudentAdvance extends Advance
{
	
	//default constructor 
	public StudentAdvance()
	{
		super();
	}

	public int getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice() + "\nStudent ID Required: ";
	}
}