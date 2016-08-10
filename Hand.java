import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private int n;
	private ArrayList<Card> cards;
	
	public Hand() {
		n = 0;
		cards = new ArrayList<Card>();
	}
	
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public void setCards(ArrayList<Card> cards1) {
		this.cards.clear();
		for(int i = 0; i < cards1.size(); i++)
			this.cards.add(cards1.get(i));
		n = cards.size();
	}
	
	private void p(Object o) {
		System.out.print(o);
	}

	public ArrayList<Card> getCards() {
		return cards;
	}
	
	public PokerHand evaluatePoker() {
	
		Poker p = new Poker();
		sort();
		return p.getTypeOfHand(this);
	}
	
	public void sort() {
		Collections.sort(cards);
	}
	
}
