import java.util.Random;

public class Card implements Comparable<Card>{
	
	private Suits suit;
	private Value value;
	
	public Card(Suits suit,Value value) {
		this.suit = suit;
		this.value = value;
	}
	
	public Card() {
		
	}
	
	public Suits getSuit() {
		return suit;
	}
	
	
	
	public Value getDenom() {
		return value;
	}
	
	public void setRandom() {
		this.suit = (Suits.values()[new Random().nextInt(Suits.values().length)]);
		this.value = (Value.values()[new Random().nextInt(Value.values().length)]);
	}

	@Override
	public int compareTo(Card c1) {
		return this.value.compareTo(c1.value);
	}
	@Override
	public boolean equals(Object c) {
		return (suit == ((Card)c).suit) && (value == ((Card)c).value);
		
	}
	
	

}
