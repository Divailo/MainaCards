package MainaCards;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
	
	private Deck deck;
	private Card currCard;
	private Card nextCard;
	private int points;
	
	public Game(){
		points = 0;
		deck = new Deck();
		currCard = deck.pick();
	}
	
	public void rightGuess(){
		points++;
		currCard = nextCard;
	}
	
	public void guessUp(MainView view){
		nextCard = deck.pick();
		if(nextCard.getRank() >= currCard.getRank()){
			rightGuess();
		}
		else{
			GameOver(view);
		}
	}
	
	public void guessDown(MainView view){
		nextCard = deck.pick();
		if(nextCard.getRank() <= currCard.getRank()){
			rightGuess();
		}
		else{
			GameOver(view);
		}
	}
	
	public void GameOver(MainView view) {
		JPanel gameOverPanel = new JPanel(new BorderLayout());
		System.out.println(points);
		System.out.println("Game Over");
		JLabel previousGameInfo = new JLabel("Game Over! " +  "\n" + " Your score: " + getPoints());
		previousGameInfo.setFont(new Font("Arial", Font.PLAIN, 35));
		JPanel buttonPanel = new JPanel(new FlowLayout());
		JButton tryAgainButton = new JButton("Try Again");
		JButton exitButton = new JButton("Exit");
		buttonPanel.add(tryAgainButton);
		buttonPanel.add(exitButton);
		gameOverPanel.add(previousGameInfo, BorderLayout.NORTH);
		gameOverPanel.add(buttonPanel, BorderLayout.SOUTH);
		view.add(gameOverPanel, BorderLayout.SOUTH);
		view.disableButtons();
		view.pack();
		tryAgainButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				view.dispose();
				MainView newGame = new MainView();
				newGame.setVisible(true);
			}
		});
		exitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
			}
		});
	}
	
	public int getPoints(){
		return points;
	}
	
	public String getPathToTheCardImage(){
		return "/MainaCards/res/" + currCard.getRank() + "" + currCard.getSuit() + ".png";
	}

}
