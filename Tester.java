import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		Hand hand = new Hand();
		
		// Checking Straight Flush
//		ArrayList<Card> cards = new ArrayList<Card>();
//		cards.add(new Card(Suits.HEARTS,Denom.ACE));
//		cards.add(new Card(Suits.HEARTS,Denom.TWO));
//		cards.add(new Card(Suits.HEARTS,Denom.THREE));
//		cards.add(new Card(Suits.HEARTS,Denom.FOUR));
//		cards.add(new Card(Suits.HEARTS,Denom.FIVE));
//		hand.setCards(cards);
//		p(hand.evaluatePoker().toString()+"\n");
		
		// Checking Royal Flush
		ArrayList<Card> cards1 = new ArrayList<Card>();
		cards1.add(new Card(Suits.HEARTS,Denom.ACE));
		cards1.add(new Card(Suits.HEARTS,Denom.KING));
		cards1.add(new Card(Suits.HEARTS,Denom.QUEEN));
		cards1.add(new Card(Suits.HEARTS,Denom.JACK));
		cards1.add(new Card(Suits.HEARTS,Denom.TEN));
		hand.setCards(cards1);
		p(hand.evaluatePoker().toString()+"\n");
		
	}

	private static void p(Object o) {
		System.out.print(o);
	}
	
}

