package Mäng;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game implements ActionListener{
	public void actionPerformed (ActionEvent e) {
		
		String[] logo = {"logo-1.jpg","logo-2.jpg","logo-3.jpg","logo-4.jpg","logo-5.jpg"};
		 int rand = 1 + (int)(Math.random() * ((5 - 1)));
		 
		 JButton vastaButton = new JButton("Vasta");
		 
		 JPanel panel = new JPanel();
		 panel.add(vastaButton);
		 vastaButton.addActionListener(new Game());
		 JTextField vastus = new JTextField(20);
		 panel.add(vastus);
		 ImageIcon pic = new ImageIcon("C:/Users/Kadi/workspace/LogoQuiz/src/Mäng/"+ logo[rand]);
		 panel.add(new JLabel(pic));
		 JOptionPane.showMessageDialog(null,panel,"Information",JOptionPane.INFORMATION_MESSAGE);
	   
	    
	    
	    
	  
		
	}
	
}
