import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private int n;
	ArrayList<Card> cards;
	
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public void setCards(ArrayList<Card> cards1) {
		for(int i = 0; i < cards1.size(); i++)
			this.cards.add(cards1.get(i));
	}
	
	public ArrayList<Card> getCards() {
		return cards;
	}
	
	public PokerHand evaluatePoker() {
		Poker p = new Poker();
		return p.getTypeOfHand(this);
	}
	
	public void sort() {
		Collections.sort(cards);
	}
	
}
