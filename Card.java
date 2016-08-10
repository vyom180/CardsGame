import java.util.Random;

public class Card implements Comparable<Card>{
	
	private Suits suit;
	private Denom denom;
	
	public Card(Suits suit,Denom denom) {
		this.suit = suit;
		this.denom = denom;
	}
	
	public Card() {
		
	}
	
	public Suits getSuit() {
		return suit;
	}
	
	
	
	public Denom getDenom() {
		return denom;
	}
	
	public void setRandom() {
		this.suit = (Suits.values()[new Random().nextInt(Suits.values().length)]);
		this.denom = (Denom.values()[new Random().nextInt(Denom.values().length)]);
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
