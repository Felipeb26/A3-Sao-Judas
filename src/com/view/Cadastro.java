package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.utils.Change;
import javax.swing.ImageIcon;

public class Cadastro {

	private static JFrame frame = new JFrame();
	private static JTextField inputEmail;
	private static JTextField inputNome;
	private static JTextField inputSenha;
	private static JButton btnCadastro = new JButton("CADASTRAR");
	private JButton btnCancel = new JButton("CANCEL");
	private JLabel lblNome = new JLabel("NOME");
	private JLabel lblEmail = new JLabel("EMAIL");
	private JLabel lblSenha = new JLabel("SENHA");

	public Cadastro() {
		frame = new JFrame();
		frame.setBounds(100, 100, 701, 550);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		inputEmail = new JTextField();
		inputEmail.setBounds(490, 241, 150, 30);
		frame.getContentPane().add(inputEmail);
		inputEmail.setColumns(10);

		inputNome = new JTextField();
		inputNome.setBounds(490, 312, 150, 30);
		frame.getContentPane().add(inputNome);
		inputNome.setColumns(10);

		inputSenha = new JTextField();
		inputSenha.setBounds(490, 376, 150, 30);
		frame.getContentPane().add(inputSenha);
		inputSenha.setColumns(10);

		lblNome.setBounds(543, 287, 46, 14);
		frame.getContentPane().add(lblNome);

		lblEmail.setBounds(543, 216, 46, 14);
		frame.getContentPane().add(lblEmail);

		lblSenha.setBounds(543, 353, 46, 14);
		frame.getContentPane().add(lblSenha);

		btnCadastro.setBounds(515, 419, 109, 23);
		frame.getContentPane().add(btnCadastro);

		btnCancel.setBounds(27, 11, 94, 23);
		frame.getContentPane().add(btnCancel);
		frame.setVisible(true);

		Change.ScreenIndex(btnCancel, frame);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\felip\\Pictures\\kali.png"));
		lblNewLabel.setBounds(43, 96, 369, 346);
		frame.getContentPane().add(lblNewLabel);
		Cadastrar();
	}

	public static void Cadastrar() {
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String mail = inputEmail.getText();
					String nome = inputNome.getText();
					String senha = inputSenha.getText();
					if (nome.equals("") || senha.equals("") || mail.equals("")) {
						JOptionPane.showMessageDialog(null, "os campos devem estar preenchidos");
					} else {
						System.out.println(mail + "\n" + nome + "\n" + senha);
						JOptionPane.showMessageDialog(null, "usuario " + nome + " cadastrado com sucesso!");
						frame.dispose();
						new Index();
					}
				} catch (Exception ex) {
					ex.printStackTrace();
					System.out.println(ex.getMessage());
				}
			}
		});
	}
}
