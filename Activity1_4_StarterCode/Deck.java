import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck 
{

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		this.cards = new ArrayList<Card>();
        for (int i = 0; i < ranks.length; i++) 
		{
			for(int s = 0; s < suits.length; s++ )
				this.cards.add(new Card(ranks[i], suits[s], values[i]));
        }
        this.size = this.cards.size();
		shuffle();
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if(this.cards.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return this.cards.size();
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		for (int i = cards.size() - 1; i > 0; i--) 
		 {
			int position = (int)(Math.random() * (i + 1)); 
			Card temp = cards.get(position);
			cards.set(position, cards.get(i));
			cards.set(i, temp);
		 }
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		this.size = this.size - 1;
		if(this.size > 0)
		{
			return this.cards.get(this.size);
		}
		else
		{
			return null;
		}
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String ret = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			ret = ret + cards.get(k);
			if (k != 0) {
				ret = ret + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				ret = ret + "\n";
			}
		}

		ret = ret + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			ret = ret + cards.get(k);
			if (k != size) {
				ret = ret + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				ret = ret + "\n";
			}
		}

		ret = ret + "\n";
		return ret;
	}
}
