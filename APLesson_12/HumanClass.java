public class HumanClass
{
	//instance variables
	private String hair, eyes, skin;
	
	//Default constructor 
	public HumanClass()
	{
		//default values for instance variables
		hair = "";
		eyes = "";
		skin = "";
	}
	//Constructor with parameters
	public HumanClass(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	//Modifier
	public void setHES(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	//Accessor
	public String getHair()
	{
		return hair;
	}
	public String getEyes()
	{
		return eyes;
	}
	public String getSkin()
	{
		return skin;
	}
	
}