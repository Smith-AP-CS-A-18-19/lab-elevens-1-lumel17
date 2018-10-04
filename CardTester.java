/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("ace", "spades", 11);
		Card card2 = new Card("three", "hearts", 3);
		Card card3 = new Card("ace", "spades", 11);
		System.out.println("Card 1 is a(n) " + card1.toString());
		System.out.println("Card 2 is a(n) " + card2.toString());
		System.out.println("Card 3 is a(n) " + card3.toString());
		System.out.println(card1.matches(card2));
		System.out.println(card1.matches(card3));
	}
}
