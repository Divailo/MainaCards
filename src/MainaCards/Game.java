package MainaCards;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
	
	private HallOfFame hof = new HallOfFame();
	private Deck deck;
	private Card currCard;
	private Card nextCard;
//	private int choice;
	private int points;
//	private String username = "Pesho";
	private boolean isGameActive;
	
	public Game(){
		isGameActive = true;
		points = 0;
		deck = new Deck();
		currCard = deck.pick();
		//GUI tree
		//gameProgress();
	}
	
	
	
	public void guessUp(){
		nextCard = deck.pick();
		if(nextCard.getRank() >= currCard.getRank()){
			points++;
			currCard = nextCard;
		}
		else{
			GameOver();
		}
	}
	
	public void guessDown(){
		nextCard = deck.pick();
		if(nextCard.getRank() <= currCard.getRank()){
			points++;
			currCard = nextCard;
		}
		else{
			GameOver();
		}
	}
	
//	public void gameProgress(){
////		System.out.println(currCard);
////		newGame();
//		nextCard = deck.pick();
//		//pri natiskane na butona, choice se promenq na 0 iii 1
//		if(choice == 0){
//			guessDown();
//		}
//		else if(choice == 1){
//			guessUp();
//		}
//	}
	
	public void GameOver(){
		isGameActive = false;
		System.out.println(points);
		System.out.println("Game Over");
//		setVisible(false);
		hey h = new hey();
		h.setSize(600,400);
		JLabel jl1 = new JLabel("Game Over! " +  "\n" + " Your score: " + getPoints());
		jl1.setFont(new Font("Arial", Font.PLAIN, 35));
		h.setLayout(new BorderLayout());
		h.add(jl1, BorderLayout.CENTER);
		h.setVisible(true);
		JButton jb = new JButton("Try Again");
		JButton jb1 = new JButton("Exit");
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		jp.add(jb);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					h.setVisible(false);
					areeeeeeeeee a = new areeeeeeeeee();
					a.setVisible(true);
				} catch (IOException e) {
					System.out.println("Rosen e myr6a!");
				}
			}
			});
		jp.add(jb1);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				h.dispatchEvent(new WindowEvent(h, WindowEvent.WINDOW_CLOSING));
			}
		});
		h.add(jp, BorderLayout.SOUTH);
	}
	
	public boolean isGameActive(){
		return isGameActive;
	}
	
	public int getPoints(){
		return points;
	}
	
//	public void newGame(){
//		Scanner sc = new Scanner(System.in);
//		choice  = sc.nextInt();
//	}
	public String getCardName(){
		return currCard.getRank() + "" + currCard.getSuit() + ".png";
	}

}
