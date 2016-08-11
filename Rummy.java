import java.util.ArrayList;
import java.util.HashMap;

public class Rummy {

	private Hand hand;

	public Rummy(Hand hand1) {
		hand = new Hand();
		hand.setCards(hand1.getCards());
	}

	public void calcEqualValueMelds() {
		
		p("Melds possible with all cards having equal value :\n");
		p("----------------------------------------------------\n");
		HashMap<Value, ArrayList<Card>> hash = hand.getSameValueMelds();
		for (Value v : hash.keySet()) {
			ArrayList<Card> c = hash.get(v);
			
			p("Meld : [");
			for(int i=0;i<c.size();i++)
				p(c.get(i).toString()+",");
			p("]\n");
			
			if (c.size() < 4) {
				p("Required Card is :\n");
				int[] flag = { 0, 0, 0, 0 };
				for (Card ca : c)
					flag[ca.getSuit().ordinal()]++;
				
			for(int i=0;i<4;i++) 
				if(flag[i]==0) 
					p(v.name()+" of " + Suits.values()[i].name()+",");
			}
			p("\n\n");
		}
	}
	
	public void calcAscSuitsMelds() {
		p("Melds possible with all cards having same Suit :\n");
		p("----------------------------------------------------\n");
		HashMap<Suits, ArrayList<Card>> hash = hand.getSameSuitsMelds();
		
		for (Suits v : hash.keySet()) {
			ArrayList<Card> c = hash.get(v);
		
			
			
			
			
			if (c.size() < 4) {
				
				int[] flag = { 0, 0, 0, 0 ,0,0,0,0,0,0,0,0,0};
				for (Card ca : c)
					flag[ca.getDenom().ordinal()]++;
				
			for(int i=0;i<13;i++) 
			{
				int j =i;
			
				if(flag[i]==1) {
					int cnt = 0;
					p("Meld :\n");
					while(flag[j]==1)
					{
						p((j+1) + " of "+v.name()+",");
						cnt++;
						j++;
					}
					p("\nRequired Cards : \n");
					if(cnt==1)
					{
						p((j+1) + " of "+v.name()+",");
						j++;
						p((j+1) + " of "+v.name()+",");
						j++;
						p("\n");
					}
					if(cnt==2)
					{
						p((j+1) + " of "+v.name()+",");
						j++;
						p("\n");
					
					}
					
					
				}
					
			}
			}
			p("\n\n");
		}
		
	}
	
	public static void main(String[] args) {
		
		p("Finding the Melds possible:\n");
		p("------------------------------------------------\n");

		Hand hand = new Hand();

		// Checking 
		ArrayList<Card> cards = new ArrayList<Card>();
		cards.add(new Card(Suits.HEARTS, Value.ACE));
		cards.add(new Card(Suits.SPADES, Value.ACE));
		cards.add(new Card(Suits.DIAMONDS, Value.TWO));
		cards.add(new Card(Suits.DIAMONDS, Value.THREE));
		cards.add(new Card(Suits.DIAMONDS, Value.FOUR));
		hand.setCards(cards);
		Rummy r = new Rummy(hand);
		r.calcEqualValueMelds();
		r.calcAscSuitsMelds();
		

	}

	private static void p(Object o) {
		System.out.print(o);
	}

}
