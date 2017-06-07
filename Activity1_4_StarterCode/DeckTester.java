/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks1 = {"3", "5", "Ace", "Queen"};
		String[] suits1 = {"Hearts", "Diamonds", "Clubs", "Spades"};
		int[] pV1 = {3, 5, 1, 12};
		Deck deck1 = new Deck(ranks1, suits1, pV1);
		System.out.println("The first deck should be empty: " + deck1.isEmpty());
		
		String[] ranks2 = {"Jack", "King", "Queen", "Ace"};
		String[] suits2 = {"Diamonds", "Diamonds", "Hearts", "Spades"};
		int[] pV2 = {11, 13, 12, 1};
		Deck deck2 = new Deck(ranks2, suits2, pV2);
		System.out.println("The second deck size should be: " + deck2.size());
		
		String[] ranks3 = {"8", "4", "King"};
		String[] suits3 = {"Spades", "Clubs", "Hearts"};
		int[] pV3 = {8, 4, 13};
		Deck deck3 = new Deck(ranks3, suits3, pV3);
		System.out.println("The dealt card for the third deck is: " + deck3.deal());
		
		String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
		int[] pV = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck deck = new Deck(ranks, suits, pV);
		//System.out.println(d);
		System.out.println("The dealt card for the whole deck is: " + deck.deal());
	}
}
