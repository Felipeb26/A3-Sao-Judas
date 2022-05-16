package com.utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.view.About;
import com.view.Cadastro;
import com.view.Eventos;
import com.view.Index;

public class Change {

	public static void ScreenMain(JButton button, JFrame frame, JTextField user, JTextField pass) {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (user.getText().equals("felipes") && pass.getText().equals("2626")) {
						frame.dispose();
						new Eventos();
					} else {
						JOptionPane.showMessageDialog(null, "usuario invalido");
						user.setText("");
						pass.setText("");
					}
				} catch (Exception ex) {
					ex.printStackTrace();
					System.out.println(ex.getMessage());
				}
			}
		});
	}

	public static void ScreenAddUser(JButton button, JFrame frame) {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					new Cadastro();
				} catch (Exception ex) {
					ex.printStackTrace();
					System.out.println(ex.getMessage());
				}
			}
		});
	}
	
	public static void ScreenIndex(JButton button, JFrame frame) {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					new Index();
				} catch (Exception ex) {
					ex.printStackTrace();
					System.out.println(ex.getMessage());
				}
			}
		});
	}

	public static void ScreenAbout(JButton btnAbout, JFrame frame) {
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					new About();
				} catch (Exception ex) {
					ex.printStackTrace();
					System.out.println(ex.getMessage());
				}
			}
		});
	}

}
