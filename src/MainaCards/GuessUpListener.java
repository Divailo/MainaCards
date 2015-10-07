package MainaCards;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessUpListener implements ActionListener{
	
	private MainView window;
	private Game game;
	
	public GuessUpListener(MainView window, Game gameBeingPlayed){
		this.window = window;
		this.game = gameBeingPlayed;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		game.guessUp(window);
		window.updateDisplayedCard(game.getPathToTheCardImage());;
	}

}