public class CarClass
{
	//instance variables
	private String paint, interior, engine, tires;
	
	//Constructor with parameters
	public CarClass(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	//Modifier
	public void setCustom(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	//Accessor
	public String getPaint()
	{
		return paint;
	}
	public String getInterior()
	{
		return interior;
	}
	public String getEngine()
	{
		return engine;
	}
	public String getTires()
	{
		return tires;
	}
	
}