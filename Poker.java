import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Poker {

	public PokerHand getTypeOfHand(Hand hand) {

		if (hand.getN() != 5)
			return null;

		ArrayList<Card> cards = hand.getCards();
		if (isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;
		else if (isStraightFlush(cards))
			return PokerHand.STRAIGHT_FLUSH;
		else if (isFourOfAKind(cards))
			return PokerHand.FOUR_OF_A_KIND;
		else if (isFullHouse(cards))
			return PokerHand.FULL_HOUSE;
		else if (isFlush(cards))
			return PokerHand.FLUSH;
		else if (isStraight(cards))
			return PokerHand.STRAIGHT;
		if (isThreeOfAKind(cards))
			return PokerHand.THREE_OF_A_KIND;
		if (isTwoPair(cards))
			return PokerHand.TWO_PAIR;
		if (isOnePair(cards))
			return PokerHand.ONE_PAIR;
		else
			return PokerHand.HIGH_CARD;
	}

	private boolean isOnePair(ArrayList<Card> cards) {

		int pairs = 0;
		HashMap<Value, Integer> hash = new HashMap<Value, Integer>();
		for (Card c : cards)
			if (hash.containsKey(c.getDenom()))
				hash.put(c.getDenom(), hash.get(c.getDenom()) + 1);
			else
				hash.put(c.getDenom(), 1);
		for (Value d : hash.keySet())
			if (hash.get(d) == 2)
				pairs++;

		return (pairs == 1);
	}

	private boolean isTwoPair(ArrayList<Card> cards) {

		int pairs = 0;
		HashMap<Value, Integer> hash = new HashMap<Value, Integer>();
		for (Card c : cards)
			if (hash.containsKey(c.getDenom()))
				hash.put(c.getDenom(), hash.get(c.getDenom()) + 1);
			else
				hash.put(c.getDenom(), 1);
		for (Value d : hash.keySet())
			if (hash.get(d) == 2)
				pairs++;

		return (pairs == 2);
	}

	private boolean isThreeOfAKind(ArrayList<Card> cards) {

		HashMap<Value, Integer> hash = new HashMap<Value, Integer>();
		for (Card c : cards)
			if (hash.containsKey(c.getDenom()))
				hash.put(c.getDenom(), hash.get(c.getDenom()) + 1);
			else
				hash.put(c.getDenom(), 1);

		if (hash.values().contains(3))
			return true;
		else
			return false;
	}

	private boolean isRoyalFlush(ArrayList<Card> cards) {

		Suits suit = cards.get(0).getSuit();
		if (cards.contains(new Card(suit, Value.ACE)))
			if (cards.contains(new Card(suit, Value.KING)))
				if (cards.contains(new Card(suit, Value.QUEEN)))
					if (cards.contains(new Card(suit, Value.JACK)))
						if (cards.contains(new Card(suit, Value.TEN)))
							return true;
		return false;
	}

	private void p(Object o) {
		System.out.print(o);
	}

	private boolean isStraightFlush(ArrayList<Card> cards) {
		Suits suit = cards.get(0).getSuit();
		Value value = cards.get(0).getDenom();

		for (int i = 1; i < cards.size(); i++) {
			if ((cards.get(i).getSuit() != suit) || ((cards.get(i).getDenom().ordinal() - value.ordinal()) != 1)) {
				return false;
			}
			value = cards.get(i).getDenom();
		}
		return true;
	}

	private boolean isFourOfAKind(ArrayList<Card> cards) {

		int count = 0;
		Value value = cards.get(0).getDenom();
		if (value.ordinal() != cards.get(1).getDenom().ordinal())
			value = cards.get(1).getDenom();
		for (Card c : cards) {
			if (c.getDenom().equals(value)) {
				count = count + 1;
			}
		}
		if (count == 4) {
			return true;
		}
		return false;
	}

	private boolean isFullHouse(ArrayList<Card> cards) {
		HashMap<Value, Integer> hash = new HashMap<Value, Integer>();
		for (Card c : cards)
			if (hash.containsKey(c.getDenom()))
				hash.put(c.getDenom(), hash.get(c.getDenom()) + 1);
			else
				hash.put(c.getDenom(), 1);

		if (hash.keySet().size() == 2)
			return true;
		return false;
	}

	private boolean isFlush(ArrayList<Card> cards) {
		Suits suit = cards.get(0).getSuit();
		for (Card c : cards)
			if (c.getSuit() != suit)
				return false;
		
		return true;
	}

	private boolean isStraight(ArrayList<Card> cards) {

		if (isStraightException(cards))
			return true;

		Value value = cards.get(0).getDenom();
		for (int i = 1; i < cards.size(); i++) {
			if (cards.get(i).getDenom().ordinal() - value.ordinal() != 1)
				return false;
			value = cards.get(i).getDenom();
		}
		return true;
	}

	private boolean isStraightException(ArrayList<Card> cards) {

		Value[] d = { Value.ACE, Value.TEN, Value.JACK, Value.QUEEN, Value.KING };
		List<Value> except = Arrays.asList(d);
		for (int i = 0; i < d.length; i++)
			if (cards.get(i).getDenom() != except.get(i))
				return false;
		return true;
	}

}
