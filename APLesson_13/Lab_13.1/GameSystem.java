import java.util.Random;
public abstract class GameSystem
{
	private int serialNo;
	private String platform;
	
	//default constructor 
	public GameSystem()
	{
		this.platform = "";
		this.serialNo = 0;
	}
	
	//constructor with parameters
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random() * 1000000) + 1; 
	}
	
	//Accessors
	public String getPlatform()
	{
		return platform;
	}
	public int getSerialNo()
	{
		return serialNo;
	}
}