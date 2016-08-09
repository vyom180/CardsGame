import java.util.ArrayList;

public class Poker {

	public PokerHand getTypeOfHand(Hand hand) {
		
		
		if(hand.getN()!=5)
			return PokerHand.NONE;
		
		ArrayList<Card> cards = hand.getCards();
		if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;	
		else if(isStraightFlush(cards))
			return PokerHand.STRAIGHT_FLUSH;
		else if(isFourOfAKind(cards))
			return PokerHand.FOUR_OF_A_KIND;
		else if(isFlush(cards))
			return PokerHand.FLUSH;
		else if(isStraight(cards))
			return PokerHand.STRAIGHT;
		/*if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;
		if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;
		if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;
		if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;
		if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;*/
		return null;
	}

	private boolean isRoyalFlush(ArrayList<Card> cards) {
		
		Suits suit = cards.get(0).getSuit();
		if(cards.contains(new Card(suit,Denom.ACE)))
			if(cards.contains(new Card(suit,Denom.KING)))
				if(cards.contains(new Card(suit,Denom.QUEEN)))			
					if(cards.contains(new Card(suit,Denom.JACK)))
						if(cards.contains(new Card(suit,Denom.TEN)))
							return true;
		return false;
	}

	private void p(Object o) {
		System.out.print(o);
	}

	private boolean isStraightFlush(ArrayList<Card> cards) {
		Suits suit = cards.get(0).getSuit();
		Denom denom = cards.get(0).getDenom();
		for(int i = 1 ; i < cards.size() ; i++ ) {
			if(cards.get(i).getSuit()!=suit && cards.get(i).getDenom().ordinal() - denom.ordinal() != 1) {
				return false;
			}
			denom = cards.get(i).getDenom();
		}
		return true;
	}
		
	private boolean isFourOfAKind(ArrayList<Card> cards) {
		int count = 0;
		Denom denom = cards.get(0).getDenom();
		if(denom.ordinal() != cards.get(1).getDenom().ordinal()) 
			denom = cards.get(1).getDenom();
		for(Card c : cards) {
			if(c.getDenom().equals(denom)) {
				count = count + 1;
			}
		}
		if(count == 4) {
			return true;
		}
		return false;
	}
	
	private boolean isFlush(ArrayList<Card> cards) {
		Suits suit = cards.get(0).getSuit();
		for(Card c : cards) {
			if(c.getSuit()!=suit) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isStraight(ArrayList<Card> cards) {
		Denom denom = cards.get(0).getDenom();
		for(int i = 1 ; i < cards.size() ; i++ ) {
			if(cards.get(i).getDenom().ordinal() - denom.ordinal() != 1) {
				return false;
			}
			denom = cards.get(i).getDenom();
		}
		return true;
	}
	/*
	private boolean fullHouse(ArrayList<Card> cards) {
		
	}
	
	private boolean flush(ArrayList<Card> cards) {
		if(cards.contains(new Card(Suits.HEARTS,Denom.KING)))
			if(cards.contains(new Card(Suits.HEARTS,Denom.EIGHT)))
				if(cards.contains(new Card(Suits.HEARTS,Denom.SIX)))
					if(cards.contains(new Card(Suits.HEARTS,Denom.FOUR)))
						if(cards.contains(new Card(Suits.HEARTS,Denom.TWO)))
							return true;
		return false;
	}
	
	private boolean straight(ArrayList<Card> cards) {
		if(cards.contains(new Card(Suits.HEARTS,Denom.EIGHT)))
			if(cards.contains(new Card(Suits.CLUBS,Denom.SEVEN)))
				if(cards.contains(new Card(Suits.DIAMONDS,Denom.SIX)))
					if(cards.contains(new Card(Suits.SPADES,Denom.FIVE)))
						if(cards.contains(new Card(Suits.HEARTS,Denom.FOUR)))
							return true;
		return false;
	}
	
	private boolean threeOfAKind(ArrayList<Card> cards) {
		if(cards.contains(new Card(Suits.CLUBS,Denom.QUEEN)))
			if(cards.contains(new Card(Suits.HEARTS,Denom.QUEEN)))
				if(cards.contains(new Card(Suits.SPADES,Denom.QUEEN)))
					if(cards.contains(new Card(Suits.DIAMONDS,Denom.SEVEN)))
						if(cards.contains(new Card(Suits.CLUBS,Denom.TWO)))
							return true;
		return false;
	}
	
	private boolean twoPair(ArrayList<Card> cards) {
		if(cards.contains(new Card(Suits.,Denom.QUEEN)))
			if(cards.contains(new Card(Suits.HEARTS,Denom.QUEEN)))
				if(cards.contains(new Card(Suits.SPADES,Denom.QUEEN)))
					if(cards.contains(new Card(Suits.DIAMONDS,Denom.SEVEN)))
						if(cards.contains(new Card(Suits.CLUBS,Denom.TWO)))
							return true;
		return false;
	}
	*/
}
