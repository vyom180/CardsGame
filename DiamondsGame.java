import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DiamondsGame {

	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		playDiamonds();
	}

	private static void playDiamonds() {
		
		ArrayList<Card> cardsPC = new ArrayList<Card>();
		ArrayList<Card> cardsUser = new ArrayList<Card>();
		ArrayList<Card> diamondCards = new ArrayList<Card>();
		
		getSuit(cardsPC,Suits.CLUBS);
		getSuit(cardsUser,Suits.SPADES);
		getSuit(diamondCards,Suits.DIAMONDS);
		
		playMoves(cardsPC,cardsUser,diamondCards);
		
		
		
		
		
	}

	private static void playMoves(ArrayList<Card> cardsPC, ArrayList<Card> cardsUser, ArrayList<Card> diamondCards) {
		
		Card d = pickRandom(diamondCards,0,diamondCards.size()-1); 
		int val = d.getDenom().ordinal();
		if(val==0)
			val = 13;
		
		p("The Diamond Card obtained is " + val+"\n");
		
		if(val<=5) {
			playSmallestCard(cardsPC);
			getUserMove(cardsUser);
		} else {
//			playNextGreatest(cardsPC,cardsUser);
//			or
//			playGreatest(cardsPC);
			getUserMove(cardsUser);
		}
			 
		
		
		
	}



	private static void getUserMove(ArrayList<Card> cardsUser) {
		p("\n"+cardsUser.toString()+"\n");
		int ind = sc.nextInt();
		p("You played " + cardsUser.get(ind).toString()+"\n");
		cardsUser.remove(ind);
		
	}

	private static void playSmallestCard(ArrayList<Card> cardsPC) {
		int ind = 0;
		int minval = 13;
		for(int i = 0; i < cardsPC.size(); i++)
			if(getValue(cardsPC.get(i).getDenom())<minval)
			{
				ind = i;
				minval = getValue(cardsPC.get(i).getDenom());
			}
		p("PC plays " + cardsPC.get(ind).getDenom().name()+"\n");
		cardsPC.remove(ind);
		
	}

	private static int getValue(Value denom) {
		if(denom.ordinal()==0)
			return 13;
		
		return denom.ordinal();
	}

	private static void p(Object o) {
		System.out.print(o);
		
	}

	private static Card pickRandom(ArrayList<Card> cards, int start, int end) {
		 int index = new Random().nextInt(end-start+1);
	     Card c = cards.get(start+index);
	     cards.remove(start+index);
	     return c;
	}

	private static void getSuit(ArrayList<Card> cards, Suits suit) {
		for(Value val : Value.values())
			cards.add(new Card(suit,val));
	}
}
