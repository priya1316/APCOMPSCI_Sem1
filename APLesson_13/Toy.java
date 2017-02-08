public abstract class Toy
{
	private int count;
	private String name;;
	
	//default constructor 
	public Toy()
	{
		this.name = "";
		this.count = 1;
	}
	
	//constructor with parameters
	public Toy(String n)
	{
		this.name = n;
		this.count = 1; 
	}
	
	//Modifiers
	public void setName(String n)
	{
		this.name = n; 
	}
	public void setCount()
	{
		this.count=+1;
	}
	
	//Accessors
	public String getName()
	{
		return name;
	}
	public int getCount()
	{
		return count;
	}
	
	//Abstract Method 
	public abstract String getType();
	
	//toString
	public String toString()
	{
		return name + ":" + count;
	}
}