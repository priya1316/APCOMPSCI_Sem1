import java.util.ArrayList;

public class ToyStore
{
	public ArrayList<String>toylist;
	
	//default constructor 
	public ToyStore()
	{
		this.toylist = new ArrayList<String>();
	}
	
	//constructor with parameters
	public ToyStore(ArrayList<String> tl)
	{
		this.toylist = new ArrayList<String>(tl);
	}
	
	public void loadToys()
	{
		ArrayList<String>toys = new ArrayList<String>(Arrays.asList(ts.split(" ")));
		for(int i=0; i<toys.size; i++)
		{
			String name = toys[i];
			String type = toys[i+1];
			Toy getThatToy(name) = new Toy();
			if 
		}
		
		
	}
}