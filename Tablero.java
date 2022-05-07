package IniciativaAjedrez;

public class Tablero {
	public Pieza[][] tablero = new Pieza[8][8];
	
	public Tablero() {
		//Piezas negras = false
		tablero[0][0] = new PiezaTorre(new Coordenada(0, 0), false);
		tablero[0][1] = new PiezaCaballo(new Coordenada(0, 1), false);
		tablero[0][2] = new PiezaAlfil(new Coordenada(0, 2), false);
		tablero[0][3] = new PiezaRey(new Coordenada(0, 3), false);
		tablero[0][4] = new PiezaReina(new Coordenada(0, 4), false);
		tablero[0][5] = new PiezaAlfil(new Coordenada(0, 5), false);
		tablero[0][6] = new PiezaCaballo(new Coordenada(0, 6), false);
		tablero[0][7] = new PiezaTorre(new Coordenada(0, 7), false);
		
		tablero[1][0] = new PiezaPeon(new Coordenada(1, 0), false);
		tablero[1][1] = new PiezaPeon(new Coordenada(1, 1), false);
		tablero[1][2] = new PiezaPeon(new Coordenada(1, 2), false);
		tablero[1][3] = new PiezaPeon(new Coordenada(1, 3), false);
		tablero[1][4] = new PiezaPeon(new Coordenada(1, 4), false);
		tablero[1][5] = new PiezaPeon(new Coordenada(1, 5), false);
		tablero[1][6] = new PiezaPeon(new Coordenada(1, 6), false);
		tablero[1][7] = new PiezaPeon(new Coordenada(1, 7), false);
		
		//Piezas blancas = true
		tablero[7][0] = new PiezaTorre(new Coordenada(7, 0), false);
		tablero[7][1] = new PiezaCaballo(new Coordenada(7, 1), false);
		tablero[7][2] = new PiezaAlfil(new Coordenada(7, 2), false);
		tablero[7][3] = new PiezaRey(new Coordenada(7, 3), false);
		tablero[7][4] = new PiezaReina(new Coordenada(7, 4), false);
		tablero[7][5] = new PiezaAlfil(new Coordenada(7, 5), false);
		tablero[7][6] = new PiezaCaballo(new Coordenada(7, 6), false);
		tablero[7][7] = new PiezaTorre(new Coordenada(7, 7), false);
		
		tablero[6][0] = new PiezaPeon(new Coordenada(6, 0), false);
		tablero[6][1] = new PiezaPeon(new Coordenada(6, 1), false);
		tablero[6][2] = new PiezaPeon(new Coordenada(6, 2), false);
		tablero[6][3] = new PiezaPeon(new Coordenada(6, 3), false);
		tablero[6][4] = new PiezaPeon(new Coordenada(6, 4), false);
		tablero[6][5] = new PiezaPeon(new Coordenada(6, 5), false);
		tablero[6][6] = new PiezaPeon(new Coordenada(6, 6), false);
		tablero[6][7] = new PiezaPeon(new Coordenada(6, 7), false);
	}
	
	public void moverPieza(Coordenada coorActual, Coordenada coorNueva) {
		Pieza pieza = tablero[coorActual.X][coorActual.Y];
		
		if(pieza != null && pieza.checarMovimiento(coorNueva) && tablero[coorNueva.X][coorNueva.Y] == null) {
			tablero[coorActual.X][coorActual.Y] = null;
			pieza.posicionActual = coorNueva;
			tablero[coorNueva.X][coorNueva.Y] = pieza;
		}
	}
	
	public void posiblesMovimientos(Coordenada coorActual) {
		
	}
}
