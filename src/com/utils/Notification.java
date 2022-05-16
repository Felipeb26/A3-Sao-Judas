package com.utils;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Notification{

	private static JFrame frame = new JFrame();
	
	public Notification() throws InterruptedException {
		JLabel lbl = null;
		String string ="";
		notesCerto(lbl, string);
	}
	
	
	public static void notesCerto(JLabel lbl, String string) throws InterruptedException {
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().wait(5000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 100);
		frame.setResizable(false);
		frame.setTitle(string);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 50, 50);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\felipe.silva\\eclipse-workspace\\interface.grafica\\interface.grafica\\src\\main\\resources\\images\\certo.png"));
		
		lbl.setBounds(149, 11, 275, 39);
		frame.getContentPane().add(lbl);
		frame.setVisible(true);
	}
}
