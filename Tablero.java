<<<<<<< HEAD
package IniciativaAjedrez;
=======
package Ajedrez;
>>>>>>> 8f713bae6b705c520c80db00d24b5277706a34e2

public class Tablero {
	private Pieza[][] tablero = new Pieza[8][8];
	
	
	public void moverPieza(Coordenada coorActual, Coordenada coorNueva) {
		Pieza pieza = tablero[coorActual.X][coorActual.Y];
		
		if(pieza != null && pieza.checarMovimiento(coorNueva) && tablero[coorNueva.X][coorNueva.Y] == null) {
			tablero[coorActual.X][coorActual.Y] = null;
			tablero[coorNueva.X][coorNueva.Y] = pieza;
		}
	}
}
