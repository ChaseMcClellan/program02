public class SmartDeck {

    private int cardsDelt = 0;
    private boolean[] deck = new boolean[52];

    public SmartDeck(){
        initDeck();
        System.out.println('\n'+"Shuffled using SmartDeck:");
    }

    public void initDeck() {	
		
        this.cardsDelt = 0;
		for(int i = 0; i < this.deck.length; i++) {
			this.deck[i] = false;
		}
	}
	
	public boolean emptyDeck() {
		
		if(this.cardsDelt >= 52){return true;}return false;
	}
	
	public void cardToString(int card) {
		
		String[]valArray = {"2H","3H","4H","5H","6H","7H","8H","9H","10H","JH","QH","KH","AH",
				"2C","3C","4C","5C","6C","7C","8C","9C","10C","JC","QC","KC","AC"
				,"2D","3D","4D","5D","6D","7D","8D","9D","10D","JD","QD","KD","AD",
				"2S","3S","4S","5S","6S","7S","8S","9S","10S","JS","QS","KS","AS"};
		System.out.printf(valArray[card]);
	}
	
	public int dealCard() {
		
		int lowNumber = 0;
		int card = 0;
		int highNumber = 51;
		
		do{
			card =(int)Math.floor(Math.random() * (highNumber - lowNumber + 1) + lowNumber);
			}
		while(this.deck[card]);
        this.cardsDelt++;
		this.deck[card] = true;
		return card;
	}



}
