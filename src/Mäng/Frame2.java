package Mäng;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.util.Arrays;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Frame2 extends JFrame {


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 204));
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tere tulemast mängima LogoQuizi");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Snap ITC", Font.ITALIC, 17));
		lblNewLabel.setBounds(34, 11, 362, 43);
		contentPane.add(lblNewLabel);
		
		JButton btnReeglid = new JButton("REEGLID");
		btnReeglid.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReeglid.setBounds(140, 100, 133, 30);
		contentPane.add(btnReeglid);
		btnReeglid.addActionListener(new Reeglid());
		
		
		JButton btnNewButton = new JButton("ALUSTA MÄNGU");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(140, 151, 133, 30);
		contentPane.add(btnNewButton);
		
		
		btnNewButton.addActionListener(new Game(Arrays.asList("logo-1.jpg","logo-2.jpg","logo-3.jpg","logo-4.jpg","logo-5.jpg")));
		btnNewButton.addActionListener(new Game());
		btnNewButton.addActionListener(new Game());
		btnNewButton.addActionListener(new Game());
		
	}
		
}