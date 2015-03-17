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
	public static int skoor = 0;
	public static int counter = 10;

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

		JPanel panel = new JPanel();

		JButton vastaButton = new JButton("Vasta");
		panel.add(vastaButton);
		vastaButton.addActionListener(new Game());
		JTextField vastus =new JTextField(20);
		panel.add(vastus);
		ImageIcon pic = new ImageIcon("C:/Users/Kadi/workspace/LogoQuiz/src/Mäng/"+ logod.get(rand));
		panel.add(new JLabel(pic));

		//Muutsin dialoogi

		String s = (String)JOptionPane.showInputDialog(panel,"Vastus: \n"+ "(Tulemus: " +skoor +")","", JOptionPane.QUESTION_MESSAGE, pic,null, "");



		if (logod.get(rand) == "logo-1.jpg" && s.equalsIgnoreCase("chrome")){
				System.out.println("CHROME ÕIGE");
				logod.remove(rand);	
				skoor +=1;
				System.out.println("Skoor on:" + skoor);
				
				
			}

		if (logod.get(rand) == "logo-3.jpg" && s.equalsIgnoreCase("android")){
				System.out.println("ANDROID ÕIGE");
				logod.remove(rand);
				skoor +=1;
				System.out.println("Skoor on:" + skoor);
				
			}


		if (logod.get(rand) == "logo-4.jpg" && s.equalsIgnoreCase("apple")){
				System.out.println("APPLE ÕIGE");
				logod.remove(rand);
				skoor +=1;
				System.out.println("Skoor on:" + skoor);

			}

		if (logod.get(rand) == "logo-5.jpg" && s.equalsIgnoreCase("nike")){
				System.out.println("NIKE ÕIGE");
				logod.remove(rand);
				skoor +=1;
				System.out.println("Skoor on:" + skoor);
		}
		if (logod.get(rand) == "logo-2.jpg" && s.equalsIgnoreCase("lays")){
				System.out.println("LAYS ÕIGE");
				logod.remove(rand);
				skoor +=1;
				System.out.println("Skoor on:" + skoor);
				}
		if (logod.get(rand) == "logo-6.jpg" && s.equalsIgnoreCase("mazda")){
			System.out.println("MAZDA ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	if (logod.get(rand) == "logo-7.jpg" && s.equalsIgnoreCase("shell")){
			System.out.println("SHELL ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	if (logod.get(rand) == "logo-8.jpg" && s.equalsIgnoreCase("mcdonalds")){
			System.out.println("MCDONALDS ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	if (logod.get(rand) == "logo-9.jpg" && s.equalsIgnoreCase("facebook")){
			System.out.println("FACEBOOK ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	if (logod.get(rand) == "logo-10.jpg" && s.equalsIgnoreCase("pepsi")){
			System.out.println("PEPSI ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	if (logod.get(rand) == "logo-11.jpg" && s.equalsIgnoreCase("puma")){
			System.out.println("PUMA ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	if (logod.get(rand) == "logo-12.jpg" && s.equalsIgnoreCase("hello kitty")){
			System.out.println("HELLO KITTY ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	if (logod.get(rand) == "logo-13.jpg" && s.equalsIgnoreCase("wordpress")){
			System.out.println("WORDPRESS ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	if (logod.get(rand) == "logo-14.jpg" && s.equalsIgnoreCase("bp")){
			System.out.println("BP ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	if (logod.get(rand) == "logo-15.jpg" && s.equalsIgnoreCase("spotify")){
			System.out.println("SPOTIFY ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	if (logod.get(rand) == "logo-16.jpg" && s.equalsIgnoreCase("nato")){
			System.out.println("NATO ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	if (logod.get(rand) == "logo-17.jpg" && s.equalsIgnoreCase("youtube")){
			System.out.println("YOUTUBE ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	if (logod.get(rand) == "logo-18.jpg" && s.equalsIgnoreCase("warner bros")){
			System.out.println("WARNER BROS ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	if (logod.get(rand) == "logo-19.jpg" && s.equalsIgnoreCase("national geographic")){
			System.out.println("NATIONAL GEOGRAPHIC ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	if (logod.get(rand) == "logo-20.jpg" && s.equalsIgnoreCase("evian")){
			System.out.println("EVIAN ÕIGE");
			logod.remove(rand);
			skoor +=1;
			System.out.println("Skoor on:" + skoor);
		}
	
	counter -=1;
	
	if (counter == 0){
		JOptionPane.showMessageDialog(panel,
			    "Vastasid kümnest õigesti " + skoor);
	}
	
}
}


