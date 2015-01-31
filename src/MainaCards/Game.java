package MainaCards;

public class Game {
	
	private Deck deck;
	private Card currCard;
	private Card nextCard;
	private int choice;
	
	public Game(){
		deck = new Deck();
		currCard = deck.pick();
		//GUI tree
		gameProgress();
	}
	
	public void GameProgress(){
		nextCard = deck.pick();
		//pri natiskane na butona, choice se promenq na 0 iii 1
		if(choice == 0){
			guessDown();
		}
		else if(choice == 1){
			guessUp();
		}
	}
	
	public void guessUp(){
		if(nextCard.getRank() > currCard.getRank()){
			gameProgress();
		}
		else{
			GameOver();
		}
	}
	
	public void guessDown(){
		if(nextCard.getRank() < currCard.getRank()){
			gameProgress();
		}
		else{
			GameOver();
		}
	}
	
	public void GameOver(){
		
	}

}
