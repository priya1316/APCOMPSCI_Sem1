/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card("7", "Diamonds", 3);
		Card two = new Card("2", "Clubs", 3);
		Card three = new Card("10", "Hearts", 3);
		Card four = new Card("2", "Spades", 3);
		
		System.out.println("Does card two match card three?" + " " + two.matches(three));
		System.out.println("Does card one match card three?" + " " + one.matches(three));
		System.out.println("Card two:" + " " + two.toString());
		System.out.println("Card four:" + " " + four.toString());
		System.out.println("Suit of Card four: " + four.suit());

	}
}
	

