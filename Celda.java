package IniciativaAjedrez;

import javax.swing.JButton;

public class Celda extends JButton{
	private static final long serialVersionUID = 1L;

	private static int numeroCelda = 0;

	public Coordenada coordenada;
	
	
	public Celda(String texto) {
		super(texto);
		int index = 0;
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(index == numeroCelda) {
					coordenada = new Coordenada(i, j);
				}
				index++;
			}
		}
		numeroCelda++;
	}
	
	
}
