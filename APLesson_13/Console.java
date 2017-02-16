public abstract class Console extends GameSystem
{
	private String controller; 
	
	//default constructor 
	public Console()
	{
		super();
	}
	
	//constructor with parameters
	public Console(String p)
	{
		super(p);
	}

	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getSerialNo() + "\nController: " + getController();
	}
}