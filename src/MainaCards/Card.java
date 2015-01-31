package MainaCards;

public class Card {

	private int rank;
	private int suit;
	private String[] ranks = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
			"Jack", "Queen", "King", "Ace" };
	private String[] suits = { "Clubs", "Diamonds", "Hearts" , "Spades"};
	
	public Card(int i, int j){
		rank = i;
		suit = j;
	}
	
	public String toString(){
		return ranks[rank] + " of " + suits[suit];
	}
	
	public int getRank(){
		return rank;
	}
	
	public int getSuit(){
		return suit;
	}
	
}
