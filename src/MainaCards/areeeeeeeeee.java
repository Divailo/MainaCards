package MainaCards;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class areeeeeeeeee extends JFrame {
	
	ImageIcon image;
	JLabel l1;
	JLabel l2;
	ImageIcon image2;
	ImageIcon up;
	ImageIcon down;
	JLabel l3;
	JLabel l4;

	public areeeeeeeeee() throws IOException {
//		JLabel jl = new JLabel("Game Over!");
		Game g = new Game();
		final String card = g.getCardName();
		image = new ImageIcon(getClass().getResource(card));
		l1 = new JLabel(image);
		image2 = new ImageIcon(getClass().getResource("cardB.jpg"));
		l2 = new JLabel(image2);
		JButton button = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource("down.png"));
			button.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}

		JButton button1 = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource("up.png"));
			button1.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}

		JPanel jp = new JPanel(new BorderLayout());
		jp.add(l1, BorderLayout.WEST);
		jp.add(l2, BorderLayout.EAST);
		add(jp);

		JPanel jp1 = new JPanel(new BorderLayout());

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// label to4kite da raboti
					g.guessDown();
					String newcard = g.getCardName();
					ImageIcon newImage = new ImageIcon(getClass().getResource(
							newcard));
					l1.setIcon(newImage);
					System.out.println(g.getCardName());
					if(!g.isGameActive()){
						setVisible(false);
					}
				}

		});
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// label to4kite da raboti

				g.guessUp();
				String newcard = g.getCardName();
				ImageIcon newImage = new ImageIcon(getClass().getResource(
						newcard));
				l1.setIcon(newImage);
				System.out.println(g.getCardName());
				if(!g.isGameActive()){
					setVisible(false);
				}

				// final String card1 = g.getCardName();
				// image = new ImageIcon(getClass().getResource(card1));
				// l1 = new JLabel(image);

			}
		});

		jp1.add(button1, BorderLayout.NORTH);

		jp1.add(button, BorderLayout.SOUTH);

		jp.add(jp1, BorderLayout.CENTER);

	}
	public static void main(String[] args) throws IOException {
		areeeeeeeeee are = new areeeeeeeeee();
		are.setDefaultCloseOperation(EXIT_ON_CLOSE);
		are.setVisible(true);
		are.pack();
		are.setTitle("QJ MI KURA GEORGI");

	}
}
