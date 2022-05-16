package com.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.utils.Change;


public class Index {
	
	private JFrame frame = new JFrame();
	private JTextField inputSenha = new JTextField();
	private JTextField inputUsuario = new JTextField();
	private JButton buttonLogin = new JButton("ENTRAR");
	private JButton btnAbout = new JButton("about");
	private JLabel lblUsuario = new JLabel("USUARIO");
	private JLabel lblSenha = new JLabel("SENHA");
	private JButton btnEsqueciSenha = new JButton("esqueci a senha");
	private JButton btnCadastro = new JButton("CADASTRAR");

	public Index() {
		frame = new JFrame();
		frame.setBounds(100, 100, 701, 550);frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		lblUsuario.setBounds(107, 281, 81, 14);
		frame.getContentPane().add(lblUsuario);

		lblSenha.setBounds(107, 333, 81, 14);
		frame.getContentPane().add(lblSenha);

		inputSenha.setBounds(92, 358, 179, 25);
		frame.getContentPane().add(inputSenha);
		inputSenha.setColumns(10);

		inputUsuario.setBounds(92, 306, 179, 20);
		frame.getContentPane().add(inputUsuario);
		inputUsuario.setColumns(10);

		btnAbout.setBounds(593, 11, 69, 23);
		frame.getContentPane().add(btnAbout);

		btnEsqueciSenha.setBounds(107, 453, 137, 14);
		frame.getContentPane().add(btnEsqueciSenha);

		btnCadastro.setBounds(117, 422, 113, 25);
		frame.getContentPane().add(btnCadastro);

		buttonLogin.setBounds(125, 395, 89, 23);
		frame.getContentPane().add(buttonLogin);
		
		Change.ScreenMain(buttonLogin, frame, inputUsuario, inputSenha);
		Change.ScreenAbout(btnAbout, frame);
		Change.ScreenAddUser(btnCadastro, frame);
	}
}
