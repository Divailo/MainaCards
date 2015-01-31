package MainaCards;

import java.util.Scanner;

public class Game {
	
	private HallOfFame hof = new HallOfFame();
	private Deck deck;
	private Card currCard;
	private Card nextCard;
	private int choice;
	private int points;
	private String username = "Pesho";
	
	public Game(){
		points = 0;
		deck = new Deck();
		currCard = deck.pick();
		//GUI tree
		gameProgress();
	}
	
	
	
	public void guessUp(){
		if(nextCard.getRank() >= currCard.getRank()){
			points++;
			currCard = nextCard;
			gameProgress();
		}
		else{
			GameOver();
		}
	}
	
	public void guessDown(){
		if(nextCard.getRank() <= currCard.getRank()){
			points++;
			currCard = nextCard;
			gameProgress();
		}
		else{
			GameOver();
		}
	}
	
	public void gameProgress(){
		System.out.println(currCard);
		newGame();
		nextCard = deck.pick();
		//pri natiskane na butona, choice se promenq na 0 iii 1
		if(choice == 0){
			guessDown();
		}
		else if(choice == 1){
			guessUp();
		}
	}
	
	public void GameOver(){
		System.out.println(points);
		System.out.println("Game Over");
//		System.out.println("Do youwant to play again ?");
		HighScore hs = new HighScore(username, points);
		hof.tryToAdd(hs);
	}
	
	public int getPoints(){
		return points;
	}
	
	public void newGame(){
		Scanner sc = new Scanner(System.in);
		choice  = sc.nextInt();
	}

}
