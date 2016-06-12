package MainaCards;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JFrame {
	
	private JLabel currentCardImageLabel;
	private JLabel cardBackImageLabel;
	private String currentCardImagePath;
	private String cardBackImagePath = "/MainaCards/res/cardB.jpg";
	private String upButtonImagePath = "/MainaCards/res/up.png";
	private String downButtonImagePath = "/MainaCards/res/down.png";
	private JPanel buttonPanel;

	public MainView(){
		setDefaults();
		Game newGame = new Game();
		JPanel mainPanel = new JPanel(new BorderLayout());
		//current card panel
		currentCardImagePath = newGame.getPathToTheCardImage();
		ImageIcon curretCardImage = new ImageIcon(getClass().getResource(currentCardImagePath));
		currentCardImageLabel = new JLabel(curretCardImage);
		//card back panel
		ImageIcon cardBackImage = new ImageIcon(getClass().getResource(cardBackImagePath));
		cardBackImageLabel = new JLabel(cardBackImage);
		
		JButton upButton = new JButton();
		upButton.setIcon(new ImageIcon(getClass().getResource(upButtonImagePath)));
		JButton downButton = new JButton();
		downButton.setIcon(new ImageIcon(getClass().getResource(downButtonImagePath)));
		buttonPanel = new JPanel(new BorderLayout());

		upButton.addActionListener(new GuessUpListener(this, newGame));
		downButton.addActionListener(new GuessDownListener(this, newGame));
		//adding the buttons to the button panel
		buttonPanel.add(upButton, BorderLayout.NORTH);
		buttonPanel.add(downButton, BorderLayout.SOUTH);
		
		//adding everything in the main panel
		mainPanel.add(currentCardImageLabel, BorderLayout.WEST);
		mainPanel.add(cardBackImageLabel, BorderLayout.EAST);
		mainPanel.add(buttonPanel, BorderLayout.CENTER);

		add(mainPanel);
	}
	
	public void setDefaults(){
		setSize(600,400);
		this.setTitle("GAMBLING CARDS");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void updateDisplayedCard(String newPath){
		ImageIcon newImage = new ImageIcon(getClass().getResource(newPath));
		currentCardImageLabel.setIcon(newImage);
	}
	
	public void disableButtons(){
		for(Component c : buttonPanel.getComponents()){
			if(c instanceof JButton){
				c.setEnabled(false);
			}
		}
	}

}