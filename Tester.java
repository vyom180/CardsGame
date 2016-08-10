import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		
		p("Creating and Checking the kind of Hand formed :\n");
		p("------------------------------------------------\n");
		
		Hand hand = new Hand();
		
		//Checking Straight Flush
		ArrayList<Card> cards = new ArrayList<Card>();
		cards.add(new Card(Suits.HEARTS, Denom.ACE));
		cards.add(new Card(Suits.HEARTS, Denom.TWO));
		cards.add(new Card(Suits.HEARTS, Denom.THREE));
		cards.add(new Card(Suits.HEARTS, Denom.FOUR));
		cards.add(new Card(Suits.HEARTS, Denom.FIVE));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString()+"\n");
		
		cards.clear();
		// Checking Royal Flush
		cards.add(new Card(Suits.HEARTS, Denom.ACE));
		cards.add(new Card(Suits.HEARTS, Denom.KING));
		cards.add(new Card(Suits.HEARTS, Denom.QUEEN));
		cards.add(new Card(Suits.HEARTS, Denom.JACK));
		cards.add(new Card(Suits.HEARTS, Denom.TEN));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString()+"\n");
		
		cards.clear();
		//Checking Four of a kind
		cards.add(new Card(Suits.CLUBS, Denom.ACE));
		cards.add(new Card(Suits.HEARTS, Denom.ACE));
		cards.add(new Card(Suits.SPADES, Denom.ACE));
		cards.add(new Card(Suits.DIAMONDS, Denom.ACE));
		cards.add(new Card(Suits.HEARTS, Denom.TEN));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString()+"\n");
		
		cards.clear();
		//Checking Full House
		cards.add(new Card(Suits.CLUBS, Denom.ACE));
		cards.add(new Card(Suits.HEARTS, Denom.ACE));
		cards.add(new Card(Suits.SPADES, Denom.ACE));
		cards.add(new Card(Suits.DIAMONDS, Denom.TEN));
		cards.add(new Card(Suits.HEARTS, Denom.TEN));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString()+"\n");
		
		cards.clear();
		//Checking Flush
		cards.add(new Card(Suits.HEARTS, Denom.TEN));
		cards.add(new Card(Suits.HEARTS, Denom.KING));
		cards.add(new Card(Suits.HEARTS, Denom.EIGHT));
		cards.add(new Card(Suits.HEARTS, Denom.JACK));
		cards.add(new Card(Suits.HEARTS, Denom.TWO));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString()+"\n");
		
		cards.clear();
		//Checking Straight
		cards.add(new Card(Suits.HEARTS, Denom.TWO));
		cards.add(new Card(Suits.CLUBS, Denom.THREE));
		cards.add(new Card(Suits.SPADES, Denom.FOUR));
		cards.add(new Card(Suits.HEARTS, Denom.FIVE));
		cards.add(new Card(Suits.HEARTS, Denom.SIX));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString()+"\n");
		
		cards.clear();
		//Checking Three Of a Kind
		cards.add(new Card(Suits.CLUBS, Denom.ACE));
		cards.add(new Card(Suits.HEARTS, Denom.ACE));
		cards.add(new Card(Suits.SPADES, Denom.ACE));
		cards.add(new Card(Suits.DIAMONDS, Denom.TEN));
		cards.add(new Card(Suits.HEARTS, Denom.TWO));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString()+"\n");
		
		cards.clear();
		//Checking Two Pair
		cards.add(new Card(Suits.CLUBS, Denom.ACE));
		cards.add(new Card(Suits.HEARTS, Denom.ACE));
		cards.add(new Card(Suits.SPADES, Denom.TWO));
		cards.add(new Card(Suits.DIAMONDS, Denom.TEN));
		cards.add(new Card(Suits.HEARTS, Denom.TEN));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString()+"\n");
		
		cards.clear();
		//Checking One Pair
		cards.add(new Card(Suits.CLUBS, Denom.ACE));
		cards.add(new Card(Suits.HEARTS, Denom.ACE));
		cards.add(new Card(Suits.SPADES, Denom.TWO));
		cards.add(new Card(Suits.DIAMONDS, Denom.THREE));
		cards.add(new Card(Suits.HEARTS, Denom.TEN));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString()+"\n");
		
		cards.clear();
		//Checking High Hand
		cards.add(new Card(Suits.CLUBS, Denom.ACE));
		cards.add(new Card(Suits.HEARTS, Denom.KING));
		cards.add(new Card(Suits.SPADES, Denom.EIGHT));
		cards.add(new Card(Suits.DIAMONDS, Denom.TWO));
		cards.add(new Card(Suits.HEARTS, Denom.TEN));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString()+"\n");
		
	}

	private static void p(Object o) {
		System.out.print(o);
	}
	
}
