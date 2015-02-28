package Mäng;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Reeglid implements ActionListener{
	
	public void actionPerformed (ActionEvent e) {
		JFrame frame3 = new JFrame("Reeglid");
		frame3.setVisible(true);
		frame3.setSize(250,150);
		JLabel label1 = new JLabel("Mängus tuleb ära arvata,");
		JLabel label2 = new JLabel("mis logoga on tegu");
		JLabel label3 = new JLabel("ning kirjutada see vastavasse lahtrisse");
		JPanel panel = new JPanel();
		frame3.add(panel);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.setBackground(new Color(204, 255, 204));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
