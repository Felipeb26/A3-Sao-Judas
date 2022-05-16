package com.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.utils.Change;


public class Eventos {
	JFrame frame = new JFrame();
	private static JTextField eventoMarcado;
	private static JTextField eventoEnviado;
	private static JTextField eventoCriado;
	private JTable tableEvento;

	public Eventos() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 700);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 100, 674);
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_1.setPreferredSize(new Dimension(90, 50));
		panel.add(lblNewLabel_1);

		JButton btn = new JButton("LOGIN");
		btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn.setMargin(new Insets(10, 14, 2, 14));
		btn.setPreferredSize(new Dimension(90, 100));
		panel.add(btn);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setPreferredSize(new Dimension(90, 100));
		panel.add(btnNewButton);

		JButton button = new JButton("New button");
		button.setPreferredSize(new Dimension(90, 100));
		panel.add(button);

		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setPreferredSize(new Dimension(90, 100));
		panel.add(btnNewButton_3);

		JButton btnSair = new JButton("SAIR");
		btnSair.setPreferredSize(new Dimension(90, 100));
		panel.add(btnSair);

		eventoMarcado = new JTextField();
		eventoMarcado.setEditable(false);
		eventoMarcado.setFont(new Font("Arial Black", Font.PLAIN, 35));
		eventoMarcado.setHorizontalAlignment(SwingConstants.CENTER);
		eventoMarcado.setColumns(10);
		eventoMarcado.setBounds(510, 35, 164, 110);
		frame.getContentPane().add(eventoMarcado);

		eventoEnviado = new JTextField();
		eventoEnviado.setEditable(false);
		eventoEnviado.setFont(new Font("Arial Black", Font.PLAIN, 35));
		eventoEnviado.setHorizontalAlignment(SwingConstants.CENTER);
		eventoEnviado.setColumns(10);
		eventoEnviado.setBounds(316, 35, 164, 110);
		frame.getContentPane().add(eventoEnviado);

		eventoCriado = new JTextField();
		eventoCriado.setEditable(false);
		eventoCriado.setFont(new Font("Arial Black", Font.PLAIN, 35));
		eventoCriado.setHorizontalAlignment(SwingConstants.CENTER);
		eventoCriado.setColumns(10);
		eventoCriado.setBounds(122, 35, 164, 110);
		frame.getContentPane().add(eventoCriado);

		Change.ScreenIndex(btnSair, frame);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 169, 554, 409);
		frame.getContentPane().add(scrollPane);

		Object[][] data = { { "teste", "26/04", "sim" }, { "teste", "26/04", "sim" }, { "teste", "26/04", "sim" },
				{ "teste", "26/04", "sim" }, };
		String[] colum = { "Nome", "data", "participar" };
		tableEvento = new JTable(data, colum);
		tableEvento.setFillsViewportHeight(true);
		scrollPane.setViewportView(tableEvento);
		QuadroEventos();
	}

	public static void QuadroEventos() {
		int quantEvent = 50;
		String event = String.format("%s", quantEvent) + "%";
		eventoCriado.setText(event);
		eventoEnviado.setText("15%");
		eventoMarcado.setText("87%");
	}
}
