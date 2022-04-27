package IniciativaAjedrez;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.SystemColor;

public class Ventana extends JFrame {

	private JPanel contentPane;

	private JButton btnSeleccionado = null;

	private Tablero tablero = new Tablero();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public void SeleccionBlanca(ActionEvent e) {
		if(btnSeleccionado != null) {
			if(btnSeleccionado.getBackground() != SystemColor.controlDkShadow) 
				btnSeleccionado.setBackground(Color.WHITE);
			else
				btnSeleccionado.setBackground(Color.BLACK);	
		}
		
		JButton btn = (JButton)e.getSource();
		btn.setBackground(SystemColor.activeCaption);
		btnSeleccionado = btn;
	}
	
	public void SeleccionNegra(ActionEvent e) {
			if(btnSeleccionado != null) {
				if(btnSeleccionado.getBackground() != SystemColor.controlDkShadow) 
					btnSeleccionado.setBackground(Color.WHITE);
				else
					btnSeleccionado.setBackground(Color.BLACK);	
			}
				
			JButton btn = (JButton)e.getSource();
			btn.setBackground(SystemColor.controlDkShadow);
			btnSeleccionado = btn;
	}
	
	public Ventana() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1063, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(201, 23, 634, 666);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(8, 8));
		
		JButton A8 = new JButton("");
		A8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SeleccionBlanca(e);
			}
		});
		A8.setBackground(Color.WHITE);
		panel.add(A8);
		
		JButton B8 = new JButton("");
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SeleccionNegra(e);
			}
		});
		B8.setBackground(Color.BLACK);
		panel.add(B8);
		
		JButton C8 = new JButton("");
		C8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SeleccionBlanca(e);
			}
		});
		C8.setBackground(Color.WHITE);
		panel.add(C8);
		
		JButton D8 = new JButton("");
		D8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SeleccionNegra(e);
			}
		});
		D8.setBackground(Color.BLACK);
		panel.add(D8);
		
		JButton E8 = new JButton("");
		E8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SeleccionBlanca(e);
			}
		});
		E8.setBackground(Color.WHITE);
		panel.add(E8);
		
		JButton F8 = new JButton("");
		F8.setBackground(Color.BLACK);
		panel.add(F8);
		
		JButton G8 = new JButton("");
		G8.setBackground(Color.WHITE);
		panel.add(G8);
		
		JButton A7 = new JButton("");
		A7.setBackground(Color.BLACK);
		panel.add(A7);
		
		JButton B7 = new JButton("");
		B7.setBackground(Color.WHITE);
		panel.add(B7);
		
		JButton C7 = new JButton("");
		C7.setBackground(Color.BLACK);
		panel.add(C7);
		
		JButton D7 = new JButton("");
		D7.setBackground(Color.WHITE);
		panel.add(D7);
		
		JButton E7 = new JButton("");
		E7.setBackground(Color.BLACK);
		panel.add(E7);
		
		JButton F7 = new JButton("");
		F7.setBackground(Color.WHITE);
		panel.add(F7);
		
		JButton G7 = new JButton("");
		G7.setBackground(Color.BLACK);
		panel.add(G7);
		
		JButton A6 = new JButton("");
		A6.setBackground(Color.WHITE);
		panel.add(A6);
		
		JButton B6 = new JButton("");
		B6.setBackground(Color.BLACK);
		panel.add(B6);
		
		JButton C6 = new JButton("");
		C6.setBackground(Color.WHITE);
		panel.add(C6);
		
		JButton D6 = new JButton("");
		D6.setBackground(Color.BLACK);
		panel.add(D6);
		
		JButton E6 = new JButton("");
		E6.setBackground(Color.WHITE);
		E6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(E6);
		
		JButton F6 = new JButton("");
		F6.setBackground(Color.BLACK);
		panel.add(F6);
		
		JButton G6 = new JButton("");
		G6.setBackground(Color.WHITE);
		panel.add(G6);
		
		JButton A5 = new JButton("");
		A5.setBackground(Color.BLACK);
		panel.add(A5);
		
		JButton B5 = new JButton("");
		B5.setBackground(Color.WHITE);
		panel.add(B5);
		
		JButton C5 = new JButton("");
		C5.setBackground(Color.BLACK);
		panel.add(C5);
		
		JButton D5 = new JButton("");
		D5.setBackground(Color.WHITE);
		panel.add(D5);
		
		JButton E5 = new JButton("");
		E5.setBackground(Color.BLACK);
		panel.add(E5);
		
		JButton F5 = new JButton("");
		F5.setBackground(Color.WHITE);
		panel.add(F5);
		
		JButton G5 = new JButton("");
		G5.setBackground(Color.BLACK);
		panel.add(G5);
		
		JButton A4 = new JButton("");
		A4.setBackground(Color.WHITE);
		panel.add(A4);
		
		JButton B4 = new JButton("");
		B4.setBackground(Color.BLACK);
		panel.add(B4);
		
		JButton C4 = new JButton("");
		C4.setBackground(Color.WHITE);
		C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(C4);
	
		JButton D4 = new JButton("");
		D4.setBackground(Color.BLACK);
		panel.add(D4);
		
		JButton E4 = new JButton("");
		E4.setBackground(Color.WHITE);
		panel.add(E4);
		
		JButton F4 = new JButton("");
		F4.setBackground(Color.BLACK);
		panel.add(F4);
		
		JButton G4 = new JButton("");
		G4.setBackground(Color.WHITE);
		panel.add(G4);
		
		JButton A3 = new JButton("");
		A3.setBackground(Color.BLACK);
		panel.add(A3);
		
		JButton B3 = new JButton("");
		B3.setBackground(Color.WHITE);
		panel.add(B3);
		
		JButton C3 = new JButton("");
		C3.setBackground(Color.BLACK);
		panel.add(C3);
		
		JButton D3 = new JButton("");
		D3.setBackground(Color.WHITE);
		panel.add(D3);
		
		JButton E3 = new JButton("");
		E3.setBackground(Color.BLACK);
		panel.add(E3);
		
		JButton F3 = new JButton("");
		F3.setBackground(Color.WHITE);
		panel.add(F3);
		
		JButton G3 = new JButton("");
		G3.setBackground(Color.BLACK);
		panel.add(G3);
		
		JButton A2 = new JButton("");
		A2.setBackground(Color.WHITE);
		panel.add(A2);
		
		JButton B2 = new JButton("");
		B2.setBackground(Color.BLACK);
		panel.add(B2);
		
		JButton C2 = new JButton("");
		C2.setBackground(Color.WHITE);
		panel.add(C2);
		
		JButton D2 = new JButton("");
		D2.setBackground(Color.BLACK);
		panel.add(D2);
		
		JButton E2 = new JButton("");
		E2.setBackground(Color.WHITE);
		panel.add(E2);
		
		JButton F2 = new JButton("");
		F2.setBackground(Color.BLACK);
		panel.add(F2);
		
		JButton G2 = new JButton("");
		G2.setBackground(Color.WHITE);
		panel.add(G2);
		
		JButton A1 = new JButton("");
		A1.setBackground(Color.BLACK);
		panel.add(A1);
		
		JButton B1 = new JButton("");
		B1.setBackground(Color.WHITE);
		panel.add(B1);
		
		JButton C1 = new JButton("");
		C1.setBackground(Color.BLACK);
		panel.add(C1);
		
		JButton D1 = new JButton("");
		D1.setBackground(Color.WHITE);
		panel.add(D1);
		
		JButton E1 = new JButton("");
		E1.setBackground(Color.BLACK);
		panel.add(E1);
		
		JButton F1 = new JButton("");
		F1.setBackground(Color.WHITE);
		panel.add(F1);
		
		JButton G1 = new JButton("");
		G1.setBackground(Color.BLACK);
		panel.add(G1);
	}
}
