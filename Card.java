import java.util.Random;

public class Card implements Comparable<Card>{
	
	private Suits suit;
	private Denom denom;
	
	public Card(Suits suit,Denom denom) {
		this.setSuit(suit);
		this.setDenom(denom);
	}
	
	public Suits getSuit() {
		return suit;
	}
	
	public void setSuit(Suits suit) {
		this.suit = suit;
	}
	
	public Denom getDenom() {
		return denom;
	}
	
	public void setDenom(Denom denom) {
		this.denom = denom;
	}
	
	public void setRandom() {
		this.setSuit(Suits.values()[new Random().nextInt(Suits.values().length)]);
		this.setDenom(Denom.values()[new Random().nextInt(Denom.values().length)]);
	}

	@Override
	public int compareTo(Card c1) {
		return this.denom.compareTo(c1.denom);
	}
	@Override
	public boolean equals(Object c) {
		return (suit == ((Card)c).suit) && (denom == ((Card)c).denom);
		
	}
	
	

}
