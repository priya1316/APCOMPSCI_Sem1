import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore {
	public ArrayList<Toy>toylist;
	
	//default constructor 
	public ToyStore() {
		toylist = new ArrayList<Toy>();
	}
	
	public ToyStore(String ts) {
		loadToys(ts);
	}
	
	public void loadToys(String ts) {
		toylist = new ArrayList<Toy>();
		ArrayList<String>toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i=0; i<toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy x = getThatToy(name);
			if (x == null) {
				if(type.equals("Car")) {
					toylist.add(new Car(name));
				}
				else if(type.equals("Action Figure")) {
					toylist.add(new AFigure(name));
				}
			}
			else {x.setCount(x.getCount()+1);}
		}
	}

	public Toy getThatToy(String nm) {
		for(Toy x: toylist) {
			if(x.getName().equals(nm)) {
				return x;
			}
		}
		return null;
	}
	public String getMostFrequentToy() {
		String name = "";
		int max = Integer.MIN_VALUE;
		for (Toy x : toylist) {
			if (max<x.getCount()) {
				max = x.getCount();
				name = x.getName();
			}
		}
		return name;
	}

	public String getMostFrequentType() {
		int cars = 0;
		int figures = 0;
		for (Toy x : toylist) {
			if (x.getType().equals("Car")) {
				cars++;
			}
			if (x.getType().equals("Action Figure")) {
				figures++;
			}
		}

		if (cars>figures) {return "Cars";}
		if (figures>cars) {return "Figures";}
		else {return "Equal amounts of action figures and cars!";}
	}

	public String toString() {
		String output = "";
		for (Toy x : toylist) {
			output += "" + x;
		}
		return "\nToys in inventory...\n" + output + "\n";
	}
}