import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {

		p("Creating and Checking the kind of Hand formed :\n");
		p("------------------------------------------------\n");

		Hand hand = new Hand();

		// Checking Straight Flush
		ArrayList<Card> cards = new ArrayList<Card>();
		cards.add(new Card(Suits.HEARTS, Value.ACE));
		cards.add(new Card(Suits.HEARTS, Value.TWO));
		cards.add(new Card(Suits.HEARTS, Value.THREE));
		cards.add(new Card(Suits.HEARTS, Value.FOUR));
		cards.add(new Card(Suits.HEARTS, Value.FIVE));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString() + "\n");

		cards.clear();
		// Checking Royal Flush
		cards.add(new Card(Suits.HEARTS, Value.ACE));
		cards.add(new Card(Suits.HEARTS, Value.KING));
		cards.add(new Card(Suits.HEARTS, Value.QUEEN));
		cards.add(new Card(Suits.HEARTS, Value.JACK));
		cards.add(new Card(Suits.HEARTS, Value.TEN));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString() + "\n");

		cards.clear();
		// Checking Four of a kind
		cards.add(new Card(Suits.CLUBS, Value.ACE));
		cards.add(new Card(Suits.HEARTS, Value.ACE));
		cards.add(new Card(Suits.SPADES, Value.ACE));
		cards.add(new Card(Suits.DIAMONDS, Value.ACE));
		cards.add(new Card(Suits.HEARTS, Value.TEN));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString() + "\n");

		cards.clear();
		// Checking Full House
		cards.add(new Card(Suits.CLUBS, Value.ACE));
		cards.add(new Card(Suits.HEARTS, Value.ACE));
		cards.add(new Card(Suits.SPADES, Value.ACE));
		cards.add(new Card(Suits.DIAMONDS, Value.TEN));
		cards.add(new Card(Suits.HEARTS, Value.TEN));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString() + "\n");

		cards.clear();
		// Checking Flush
		cards.add(new Card(Suits.HEARTS, Value.TEN));
		cards.add(new Card(Suits.HEARTS, Value.KING));
		cards.add(new Card(Suits.HEARTS, Value.EIGHT));
		cards.add(new Card(Suits.HEARTS, Value.JACK));
		cards.add(new Card(Suits.HEARTS, Value.TWO));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString() + "\n");

		cards.clear();
		// Checking Straight
		cards.add(new Card(Suits.HEARTS, Value.TWO));
		cards.add(new Card(Suits.CLUBS, Value.THREE));
		cards.add(new Card(Suits.SPADES, Value.FOUR));
		cards.add(new Card(Suits.HEARTS, Value.FIVE));
		cards.add(new Card(Suits.HEARTS, Value.SIX));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString() + "\n");

		cards.clear();
		// Checking Three Of a Kind
		cards.add(new Card(Suits.CLUBS, Value.ACE));
		cards.add(new Card(Suits.HEARTS, Value.ACE));
		cards.add(new Card(Suits.SPADES, Value.ACE));
		cards.add(new Card(Suits.DIAMONDS, Value.TEN));
		cards.add(new Card(Suits.HEARTS, Value.TWO));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString() + "\n");

		cards.clear();
		// Checking Two Pair
		cards.add(new Card(Suits.CLUBS, Value.ACE));
		cards.add(new Card(Suits.HEARTS, Value.ACE));
		cards.add(new Card(Suits.SPADES, Value.TWO));
		cards.add(new Card(Suits.DIAMONDS, Value.TEN));
		cards.add(new Card(Suits.HEARTS, Value.TEN));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString() + "\n");

		cards.clear();
		// Checking One Pair
		cards.add(new Card(Suits.CLUBS, Value.ACE));
		cards.add(new Card(Suits.HEARTS, Value.ACE));
		cards.add(new Card(Suits.SPADES, Value.TWO));
		cards.add(new Card(Suits.DIAMONDS, Value.THREE));
		cards.add(new Card(Suits.HEARTS, Value.TEN));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString() + "\n");

		cards.clear();
		// Checking High Hand
		cards.add(new Card(Suits.CLUBS, Value.ACE));
		cards.add(new Card(Suits.HEARTS, Value.KING));
		cards.add(new Card(Suits.SPADES, Value.EIGHT));
		cards.add(new Card(Suits.DIAMONDS, Value.TWO));
		cards.add(new Card(Suits.HEARTS, Value.TEN));
		hand.setCards(cards);
		p(hand.evaluatePoker().toString() + "\n");

		p("\n");
		createAndCheckRandomHand();
	}

	private static void createAndCheckRandomHand() {

		p("Creating and Checking the Random Hand formed :\n");
		p("------------------------------------------------\n");

		Hand hand = new Hand();
		hand.setRandomPokerHand();
		for (int i = 0; i < hand.getN(); i++)
			p(hand.getCards().get(i).getDenom().name() + " OF " + hand.getCards().get(i).getSuit().name() + "\n");
		p("\n");
		p(hand.evaluatePoker().toString() + "\n");
	}

	private static void p(Object o) {
		System.out.print(o);
	}

}
