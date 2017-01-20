public class UserClass
{
	//instance variables
	private String firstName, lastName, avatar;
	private int userID;
	
	//Default constructor 
	public UserClass()
	{
		//default values for instance variables
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	//Constructor with parameters
	public UserClass(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public UserClass(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random()* 1000000) + 1;
	}
	
	//Modifier
	public void setAV(String av)
	{
		avatar = av;
	}
	
	//Accessor
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName + 
								"\nLast Name " + lastName + 
								"\nAvatar: " + avatar + 
								"\nUser ID#: " + userID;
	}
	
}