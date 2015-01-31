package MainaCards;

import java.util.Random;



public class Deck {
//	private ArrayList <Card> deck;
	private Random rand = new Random();
	private Card[] deck;
	private int curr;
	private int cardsLeft;
	
	public Deck(){
		deck = new Card[52];
		int curr = 0;
		cardsLeft = 52;
		int z = 0;
		for(int i = 0; i < 13; i++){
			for(int j = 0; j < 4; j++){
				Card s = new Card(i, j);
				deck[z] = s;
				z++;
			}
		}
		shuffle();
	}
	
	public void shuffle(){
		for(int i = 0; i < 52; i++){
			int r = rand.nextInt(52);
			Card P = deck[r];
			deck[r] = deck[i];
			deck[i] = P;
		}
	}
	
	public Card pick(){
		cardsLeft--;
		curr++;
		return deck[curr];
	}
	
}
