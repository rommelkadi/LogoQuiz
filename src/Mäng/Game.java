package Mäng;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Game implements ActionListener{
	public static ArrayList<String> logod = new ArrayList<String>();
	//public static int skoor = 0;

	public ArrayList<String> getLogod() {
		return logod;
	}
	
	public Game() {}
	
	public Game(List<String> logod) {
		Game.logod.addAll(logod);
	}
	
	public void actionPerformed (ActionEvent e) {

		Random suvaline = new Random();
		int  rand = suvaline.nextInt(logod.size() - 1);
		System.out.println(rand);

		JPanel panel = new JPanel();

		JButton vastaButton = new JButton("Vasta");
		panel.add(vastaButton);
		vastaButton.addActionListener(new Game());
		JTextField vastus =new JTextField(20);
		panel.add(vastus);
		ImageIcon pic = new ImageIcon("C:/Users/Kadi/workspace/LogoQuiz/src/Mäng/"+ logod.get(rand));
		panel.add(new JLabel(pic));

		//Muutsin dialoogi

		String s = (String)JOptionPane.showInputDialog(panel,"Vastus: ","", JOptionPane.QUESTION_MESSAGE, pic,null, "");



		if (logod.get(rand) == "logo-1.jpg" && s.equalsIgnoreCase("chrome")){
				System.out.println("CHROME ÕIGE");
				logod.remove(rand);				
			}

		if (logod.get(rand) == "logo-3.jpg" && s.equalsIgnoreCase("android")){
				System.out.println("ANDROID ÕIGE");
				logod.remove(rand);
				
			}


		if (logod.get(rand) == "logo-4.jpg" && s.equalsIgnoreCase("apple")){
				System.out.println("APPLE ÕIGE");
				logod.remove(rand);

			}

		if (logod.get(rand) == "logo-5.jpg" && s.equalsIgnoreCase("nike")){
				System.out.println("NIKE ÕIGE");
				logod.remove(rand);
		}
		if (logod.get(rand) == "logo-2.jpg" && s.equalsIgnoreCase("lays")){
				System.out.println("LAYS ÕIGE");
				logod.remove(rand);
				
				}
	}

}
