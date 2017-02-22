public class AFigure extends Toy
{
	private String AFigure;
	
	//default constructor 
	public AFigure()
	{
		super();
	}
	
	//constructor with parameters
	public AFigure(String n)
	{
		super(n);
	}

	public String getType()
	{
		return "Action Figure";
	}
}