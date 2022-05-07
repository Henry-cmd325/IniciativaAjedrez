package IniciativaAjedrez;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;

public class Ventana extends JFrame {

	private JPanel contentPane;

	private Celda celdaSeleccionada = null;

	private Tablero Juego = new Tablero();
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
	public void Seleccion(ActionEvent e) {
		if(celdaSeleccionada != null) {
			if(celdaSeleccionada.getBackground() != SystemColor.controlDkShadow) 
				celdaSeleccionada.setBackground(Color.WHITE);
			else
				celdaSeleccionada.setBackground(Color.BLACK);	
		}
		
		Celda celda = (Celda)e.getSource();
		
		if(celda.getBackground() == Color.WHITE)
			celda.setBackground(SystemColor.activeCaption);
		else
			celda.setBackground(SystemColor.controlDkShadow);
		
		celdaSeleccionada = celda;
	}
	
	public void PonerTexto(Celda celda) {
		if(Juego.tablero[celda.coordenada.X][celda.coordenada.Y] != null) {
			String type = Juego.tablero[celda.coordenada.X][celda.coordenada.Y].getClass().getSimpleName();
				
			switch(type) {
				case "PiezaAlfil":
					celda.setText("A");
					break;
				case "PiezaCaballo":
					celda.setText("C");
					break;
				case "PiezaPeon":
					celda.setText("P");
					break;
				case "PiezaReina":
					celda.setText("Ra");
					break;
				case "PiezaRey":
					celda.setText("Re");
					break;
				case "PiezaTorre":
					celda.setText("T");
					break;
				}
		}
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
		
		Celda A8 = new Celda("");
		A8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		A8.setBackground(Color.WHITE);
		panel.add(A8);
		
		
		Celda B8 = new Celda("");
		B8.setForeground(Color.WHITE);
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		
		B8.setBackground(Color.BLACK);
		panel.add(B8);
		
		Celda C8 = new Celda("");
		C8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		C8.setBackground(Color.WHITE);
		panel.add(C8);
		
		Celda D8 = new Celda("");
		D8.setForeground(Color.WHITE);
		D8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		D8.setBackground(Color.BLACK);
		panel.add(D8);
		
		Celda E8 = new Celda("");
		E8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		E8.setBackground(Color.WHITE);
		panel.add(E8);
		
		Celda F8 = new Celda("");
		F8.setForeground(Color.WHITE);
		F8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		F8.setBackground(Color.BLACK);
		panel.add(F8);
		
		Celda G8 = new Celda("");
		G8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		G8.setBackground(Color.WHITE);
		panel.add(G8);
		
		Celda H8 = new Celda("");
		H8.setBackground(Color.BLACK);
		H8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		panel.add(H8);
		
		Celda A7 = new Celda("");
		A7.setBackground(Color.BLACK);
		A7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		panel.add(A7);
		
		Celda B7 = new Celda("");
		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		B7.setBackground(Color.WHITE);
		panel.add(B7);
		
		Celda C7 = new Celda("");
		C7.setForeground(Color.WHITE);
		C7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		C7.setBackground(Color.BLACK);
		panel.add(C7);
		
		Celda D7 = new Celda("");
		D7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		D7.setBackground(Color.WHITE);
		panel.add(D7);
		
		Celda E7 = new Celda("");
		E7.setForeground(Color.WHITE);
		E7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		E7.setBackground(Color.BLACK);
		panel.add(E7);
		
		Celda F7 = new Celda("");
		F7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		F7.setBackground(Color.WHITE);
		panel.add(F7);
		
		Celda G7 = new Celda("");
		G7.setForeground(Color.WHITE);
		G7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		G7.setBackground(Color.BLACK);
		panel.add(G7);
		
		Celda H7 = new Celda("");
		H7.setBackground(Color.WHITE);
		H7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		panel.add(H7);
		
		Celda A6 = new Celda("");
		A6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		A6.setBackground(Color.WHITE);
		panel.add(A6);
		
		Celda B6 = new Celda("");
		B6.setForeground(Color.WHITE);
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		B6.setBackground(Color.BLACK);
		panel.add(B6);
		
		Celda C6 = new Celda("");
		C6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		C6.setBackground(Color.WHITE);
		panel.add(C6);
		
		Celda D6 = new Celda("");
		D6.setForeground(Color.WHITE);
		D6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		D6.setBackground(Color.BLACK);
		panel.add(D6);
		
		Celda E6 = new Celda("");
		E6.setBackground(Color.WHITE);
		E6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		panel.add(E6);
		
		Celda F6 = new Celda("");
		F6.setForeground(Color.WHITE);
		F6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		F6.setBackground(Color.BLACK);
		panel.add(F6);
		
		Celda G6 = new Celda("");
		G6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		G6.setBackground(Color.WHITE);
		panel.add(G6);
		
		Celda H6 = new Celda("");
		H6.setForeground(Color.WHITE);
		H6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		H6.setBackground(Color.BLACK);
		panel.add(H6);
		
		Celda A5 = new Celda("");
		A5.setForeground(Color.WHITE);
		A5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		A5.setBackground(Color.BLACK);
		panel.add(A5);
		
		Celda B5 = new Celda("");
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		B5.setBackground(Color.WHITE);
		panel.add(B5);
		
		Celda C5 = new Celda("");
		C5.setForeground(Color.white);
		C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		C5.setBackground(Color.BLACK);
		panel.add(C5);
		
		Celda D5 = new Celda("");
		D5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		D5.setBackground(Color.WHITE);
		panel.add(D5);
		
		Celda E5 = new Celda("");
		E5.setForeground(Color.WHITE);
		E5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		E5.setBackground(Color.BLACK);
		panel.add(E5);
		
		Celda F5 = new Celda("");
		F5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		F5.setBackground(Color.WHITE);
		panel.add(F5);
		
		Celda G5 = new Celda("");
		G5.setForeground(Color.WHITE);
		G5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		G5.setBackground(Color.BLACK);
		panel.add(G5);
		
		Celda H5 = new Celda("");
		H5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		H5.setBackground(Color.WHITE);
		panel.add(H5);
		
		Celda A4 = new Celda("");
		A4.setBackground(Color.WHITE);
		A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		panel.add(A4);
	
		Celda B4 = new Celda("");
		B4.setForeground(Color.WHITE);
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		B4.setBackground(Color.BLACK);
		panel.add(B4);
		
		Celda C4 = new Celda("");
		C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		C4.setBackground(Color.WHITE);
		panel.add(C4);
		
		Celda D4 = new Celda("");
		D4.setForeground(Color.WHITE);
		D4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		D4.setBackground(Color.BLACK);
		panel.add(D4);
		
		Celda E4 = new Celda("");
		E4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		E4.setBackground(Color.WHITE);
		panel.add(E4);
		
		Celda F4 = new Celda("");
		F4.setForeground(Color.WHITE);
		F4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		F4.setBackground(Color.BLACK);
		panel.add(F4);
		
		Celda G4 = new Celda("");
		G4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		G4.setBackground(Color.WHITE);
		panel.add(G4);
		
		Celda H4 = new Celda("");
		H4.setForeground(Color.WHITE);
		H4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		H4.setBackground(Color.BLACK);
		panel.add(H4);
		
		Celda A3 = new Celda("");
		A3.setForeground(Color.WHITE);
		A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		A3.setBackground(Color.BLACK);
		panel.add(A3);
		
		Celda B3 = new Celda("");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		B3.setBackground(Color.WHITE);
		panel.add(B3);
		
		Celda C3 = new Celda("");
		C3.setForeground(Color.WHITE);
		C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		C3.setBackground(Color.BLACK);
		panel.add(C3);
		
		Celda D3 = new Celda("");
		D3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		D3.setBackground(Color.WHITE);
		panel.add(D3);
		
		Celda E3 = new Celda("");
		E3.setForeground(Color.WHITE);
		E3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		E3.setBackground(Color.BLACK);
		panel.add(E3);
		
		Celda F3 = new Celda("");
		F3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		F3.setBackground(Color.WHITE);
		panel.add(F3);
		
		Celda G3 = new Celda("");
		G3.setForeground(Color.WHITE);
		G3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		G3.setBackground(Color.BLACK);
		panel.add(G3);
		
		Celda H3 = new Celda("");
		H3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		H3.setBackground(Color.WHITE);
		panel.add(H3);
		
		Celda A2 = new Celda("");
		A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		A2.setBackground(Color.WHITE);
		panel.add(A2);
		
		Celda B2 = new Celda("");
		B2.setForeground(Color.WHITE);
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		B2.setBackground(Color.BLACK);
		panel.add(B2);
		
		Celda C2 = new Celda("");
		C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		C2.setBackground(Color.WHITE);
		panel.add(C2);
		
		Celda D2 = new Celda("");
		D2.setForeground(Color.WHITE);
		D2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		D2.setBackground(Color.BLACK);
		panel.add(D2);
		
		Celda E2 = new Celda("");
		E2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		E2.setBackground(Color.WHITE);
		panel.add(E2);
		
		Celda F2 = new Celda("");
		F2.setForeground(Color.WHITE);
		F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		F2.setBackground(Color.BLACK);
		panel.add(F2);
		
		Celda G2 = new Celda("");
		G2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		G2.setBackground(Color.WHITE);
		panel.add(G2);
		
		Celda H2 = new Celda("");
		H2.setForeground(Color.WHITE);
		H2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		H2.setBackground(Color.BLACK);
		panel.add(H2);
		
		Celda A1 = new Celda("");
		A1.setForeground(Color.WHITE);
		A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		A1.setBackground(Color.BLACK);
		panel.add(A1);
		
		Celda B1 = new Celda("");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		B1.setBackground(Color.WHITE);
		panel.add(B1);
		
		Celda C1 = new Celda("");
		C1.setForeground(Color.WHITE);
		C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		C1.setBackground(Color.BLACK);
		panel.add(C1);
		
		Celda D1 = new Celda("");
		D1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		D1.setBackground(Color.WHITE);
		panel.add(D1);
		
		Celda E1 = new Celda("");
		E1.setForeground(Color.WHITE);
		E1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		E1.setBackground(Color.BLACK);
		panel.add(E1);
		
		Celda F1 = new Celda("");
		F1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		F1.setBackground(Color.WHITE);
		panel.add(F1);
		
		Celda G1 = new Celda("");
		G1.setForeground(Color.WHITE);
		G1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		G1.setBackground(Color.BLACK);
		panel.add(G1);
		
		Celda H1 = new Celda("");
		H1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion(e);
			}
		});
		H1.setBackground(Color.WHITE);
		panel.add(H1);
		
		
		PonerTexto(A8);
		PonerTexto(B8);
		PonerTexto(C8);
		PonerTexto(D8);
		PonerTexto(E8);
		PonerTexto(F8);
		PonerTexto(G8);
	}
}
