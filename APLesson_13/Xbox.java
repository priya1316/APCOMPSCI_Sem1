public class Xbox extends Console
{
	
	//default constructor 
	public Xbox()
	{
		super();
	}
	
	//constructor with parameters
	public Xbox(String p)
	{
		super(p);
	}

	public String getController()
	{
		return "Xbox Wireless Controller";
	}
	
	public String getPlatform()
	{
		return "Xbox";
	}
}