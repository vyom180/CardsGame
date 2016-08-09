import java.util.ArrayList;

public class Poker {

	public PokerHand getTypeOfHand(Hand hand) {
		
		if(hand.getN()!=5)
			return PokerHand.NONE;
		
		ArrayList<Card> cards = hand.getCards();
		if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;
		if(isStraightFlush(cards))
			return PokerHand.STRAIGHT_FLUSH;
		if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;
		if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;
		if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;
		if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;
		if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;
		if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;
		if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;
		if(isRoyalFlush(cards))
			return PokerHand.ROYAL_FLUSH;
		return null;
	}

	private boolean isStraightFlush(ArrayList<Card> cards) {
		if(cards.contains(new Card(Suits.SPADES,Denom.ACE)))
			if(cards.contains(new Card(Suits.SPADES,Denom.KING)))
				if(cards.contains(new Card(Suits.SPADES,Denom.QUEEN)))
					if(cards.contains(new Card(Suits.SPADES,Denom.JACK)))
						if(cards.contains(new Card(Suits.SPADES,Denom.TEN)))
							return true;
	return false;
	}

	private boolean isRoyalFlush(ArrayList<Card> cards) {
			if(cards.contains(new Card(Suits.HEARTS,Denom.ACE)))
				if(cards.contains(new Card(Suits.HEARTS,Denom.KING)))
					if(cards.contains(new Card(Suits.HEARTS,Denom.QUEEN)))
						if(cards.contains(new Card(Suits.HEARTS,Denom.JACK)))
							if(cards.contains(new Card(Suits.HEARTS,Denom.TEN)))
								return true;
		return false;
	}
	

}
