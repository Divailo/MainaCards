package maina;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class areeeeeeeeee extends JFrame {
	JPanel panel4e = new JPanel();
	ImageIcon image;
	JLabel l1;
	JLabel l2;
	ImageIcon image2;
	ImageIcon up;
	ImageIcon down;
	JLabel l3;
	JLabel l4;
	JButton button;
	JLabel inARow = new JLabel("Congrats! You won 5 games in a row!");
	
	
	public areeeeeeeeee() throws IOException{
		BufferedImage buttonIcon = ImageIO.read(new File("52.png"));
		button = new JButton(new ImageIcon(buttonIcon));
		//setLayout(new FlowLayout());
		JPanel panel1 = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		image = new ImageIcon(getClass().getResource("00.png"));
		l1 = new JLabel(image);
		up = new ImageIcon(getClass().getResource("up.png"));
		l3 = new JLabel(up);
		
		down = new ImageIcon(getClass().getResource("down.png"));
		l4 = new JLabel(down);
		
		image2 = new ImageIcon(getClass().getResource("01.png"));
		l2= new JLabel(image2);
		
		add(panel1);
		JPanel jp = new JPanel(new BorderLayout());
		add(jp);
		jp.add(l1, BorderLayout.WEST);
		jp.add(l2, BorderLayout.EAST);
		
		JPanel jp1 = new JPanel(new BorderLayout());
		JPanel jp2 = new JPanel(new BorderLayout());
		
		button.setBorder(BorderFactory.createEmptyBorder());
		button.setContentAreaFilled(false);
		
		jp1.add(jp2, BorderLayout.CENTER);		
		jp2.add(l3,BorderLayout.NORTH);
		jp2.add(inARow, BorderLayout.CENTER);
		jp2.add(l4,BorderLayout.SOUTH);
		
		jp.add(jp1, BorderLayout.CENTER);
		
		
	}
	public static void main(String[] args) throws IOException{
		areeeeeeeeee are = new areeeeeeeeee();
		are.setDefaultCloseOperation(EXIT_ON_CLOSE);
		are.setVisible(true);
		are.pack();
		are.setTitle("QJ MI KURA GEORGI");
	}
}


