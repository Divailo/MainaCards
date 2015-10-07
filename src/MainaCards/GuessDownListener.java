package MainaCards;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessDownListener implements ActionListener{
	
	private MainView window;
	private Game game;
	
	public GuessDownListener(MainView window, Game gameBeingPlayed){
		this.window = window;
		this.game = gameBeingPlayed;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		game.guessDown(window);
		window.updateDisplayedCard(game.getPathToTheCardImage());;
	}

}
