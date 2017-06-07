/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("The result of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			pShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("The result of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			sShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void pShuffle(int[] values) 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] temp = new int[values.length];
		int mid = (values.length + 1) / 2;

  
		int uShuffledPosition = 0;
		int i = 0;
		for ( ; i < mid; i++) 
		{ 
			temp[uShuffledPosition] = values[i];
			uShuffledPosition += 2;
		}
		uShuffledPosition = 1;
		for ( ; i < values.length; i++)
		{
			temp[uShuffledPosition] = values[i];
			uShuffledPosition += 2;
		}
		for (i = 0; i < values.length; i++) 
		{
			values[i] = temp[i];
		}
		
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void sShuffle(int[] values) 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		for (int i = values.length - 1; i > 0; i--) 
		{
			int position = (int) (Math.random() * (i + 1)); 
			int temp = values[position];
			values[position] = values[i];
			values[i] = temp;
		}
	}
}
