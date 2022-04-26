package Ajedrez;

public class PiezaPeon extends Pieza{
	public PiezaPeon() {
		posiblesMovimientos = new Coordenada[4];
		
		posiblesMovimientos[0] = new Coordenada(0, 1);
		posiblesMovimientos[1] = new Coordenada(0, 2);
		posiblesMovimientos[2] = new Coordenada(1, 1);
		posiblesMovimientos[3] = new Coordenada(-1, -1);
	}

	boolean checarMovimiento(Coordenada coordenada) {
		return false;
	}
}
