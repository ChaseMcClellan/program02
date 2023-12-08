public class DeckDriver {
    public static void main(String[] args) {

		Deck mydeck = new Deck();
        //SmartDeck mydeck = new SmartDeck();

		final int cardsPerRow = 8;
		int cardsThisRow = 0;
		int myCard;
		System.out.println("\nHere is a shuffled deck ...\n");
		while (!mydeck.emptyDeck())
			{
				myCard = mydeck.dealCard();
				++cardsThisRow;
		if (cardsThisRow <= cardsPerRow)
			{
				mydeck.cardToString(myCard);
				System.out.print(" ");
			}
		else
			{
				System.out.println("");
				cardsThisRow = 1;
				mydeck.cardToString(myCard);
				System.out.print(" ");
			}
			}
				System.out.println("\n");


    }
}
