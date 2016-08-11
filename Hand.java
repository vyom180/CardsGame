import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Hand {

	private static final int POKER_HAND_SIZE = 5;
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
		for (int i = 0; i < cards1.size(); i++)
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

	public void setRandomPokerHand() {

		for (int i = 0; i < POKER_HAND_SIZE; i++) {
			Card c = new Card();
			c.setRandom();
			cards.add(c);
		}
		n = cards.size();

	}

	public HashMap<Value, ArrayList<Card>> getSameValueMelds() {
		HashMap<Value, ArrayList<Card>> hash = new HashMap<Value, ArrayList<Card>>();
		for (int i = 0; i < cards.size(); i++)
			if (hash.containsKey(cards.get(i).getDenom()))
				hash.get(cards.get(i).getDenom()).add(cards.get(i));
			else {
				ArrayList<Card> c = new ArrayList<Card>();
				c.add(cards.get(i));
				hash.put(cards.get(i).getDenom(), c);
			}

		return hash;

	}

	public HashMap<Suits, ArrayList<Card>> getSameSuitsMelds() {
		HashMap<Suits, ArrayList<Card>> hash = new HashMap<Suits, ArrayList<Card>>();
		for (int i = 0; i < cards.size(); i++)
			if (hash.containsKey(cards.get(i).getSuit()))
				hash.get(cards.get(i).getSuit()).add(cards.get(i));
			else {
				ArrayList<Card> c = new ArrayList<Card>();
				c.add(cards.get(i));
				hash.put(cards.get(i).getSuit(), c);
			}

		return hash;

	}

}
