public class ThePCClass extends GameSystem
{
	//default constructor 
	public ThePCClass()
	{
		super();
	}
	
	//constructor with parameters
	public ThePCClass(String p)
	{
		super(p);
	}
	
	public String systemInput()
	{
		return "keyboard and mouse";
	}
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getSerialNo() + "\nSystemInput: " + systemInput();
	}
}