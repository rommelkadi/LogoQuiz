package Mäng;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game implements ActionListener{
	public void actionPerformed (ActionEvent e) {
		JFrame frame1 = new JFrame("LogoQuiz");
		frame1.setVisible(true);
		frame1.setSize(600, 600);
		JPanel panel = new JPanel();
		frame1.add(panel);
		panel.setBackground(new Color(204, 255, 204));
		
	}
}
