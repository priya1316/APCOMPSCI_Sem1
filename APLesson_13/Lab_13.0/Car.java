public class Car extends Toy
{
	private String car;
	//default constructor 
	public Car()
	{
		super();
	}
	
	//constructor with parameters
	public Car(String n)
	{
		super(n);
	}
	
		public String getType()
	{
		return "Car";
	}
}