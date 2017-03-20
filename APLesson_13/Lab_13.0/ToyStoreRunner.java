public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		String toysList = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
	
		ToyStore toys = new ToyStore(toysList);
		System.out.println("Toys List: " + toysList);
		System.out.println(toys);
		System.out.println("Most Frequent Toy: " + toys.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + toys.getMostFrequentType());
	}
}