import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore {
	public ArrayList<Toy>toylist;
	public int count;
	
	//default constructor 
	public ToyStore() {
		this.toylist = new ArrayList<>();
	}
	
	//constructor with parameters --> list of toys
	public ToyStore(String ts) {
		loadToys(ts);
	}
	
	public void loadToys(String ts) {
		ArrayList<String>toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i=0; i<toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			if (getThatToy(name).equals("")) {
				if(type.equals("Car")) {
					Car x = new Car("tesla");
					toylist.add(x);
				}
				else if(type.equals("Action Figure")) {
					AFigure x = new AFigure("batman");
					toylist.add(x);
				}
			}
			else {toylist.get(i).setCount();}
		}
	}

	public String getThatToy(String nm) {
		String rt = "";
		for(int i=0; i<toylist.size(); i=+2) {
			if(toylist.get(i).getName().equals(nm)) {
				rt = toylist.get(i).getName();
			}
		}
		return rt;
	}
	public String getMostFrequentToy() {
		String name = "";
		int max = toylist.get(0).getCount();
		for (int i=0; i<toylist.size(); i=+2) {
			if (max<toylist.get(i).getCount()) {
				max = toylist.get(i).getCount();
				name = toylist.get(i).getName();
			}
		}
		return name;
	}

	public String getMostFrequentType() {
		int cars = 0;
		int figures = 0;
		for (int i=0; i<toylist.size(); i=+2) {
			if (toylist.get(i).getType().equals("Car")) {
				cars+=1;
			}
			if (toylist.get(i).getType().equals("Action Figure")) {
				figures+=1;
			}
		}

		if (cars>figures) {return "Cars";}
		if (figures>cars) {return "Figures";}
		else {return "Equal amounts of action figures and cars!";}
	}

	public void toString3() {
		for (int i=0; i<toylist.size(); i=+2) {
			System.out.println(toylist.get(i).toString());
		}
	}
}