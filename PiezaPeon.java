package IniciativaAjedrez;

public class PiezaPeon extends Pieza {
	public PiezaPeon(Coordenada posicionInicial, boolean esBlanca) {
		posicionActual = posicionInicial;
		posiblesMovimientos = new Coordenada[4];
		this.esBlanca = esBlanca;

		if (esBlanca) {
			posiblesMovimientos[0] = new Coordenada(0, 1);
			posiblesMovimientos[1] = new Coordenada(0, 2);
			posiblesMovimientos[2] = new Coordenada(1, 1);
			posiblesMovimientos[3] = new Coordenada(-1, 1);
		}else{
			posiblesMovimientos[0] = new Coordenada(0, -1);
			posiblesMovimientos[1] = new Coordenada(0, -2);
			posiblesMovimientos[2] = new Coordenada(1, -1);
			posiblesMovimientos[3] = new Coordenada(-1, -1);
		}
			
	}

	boolean checarMovimiento(Coordenada coordenada) {
		Coordenada direccion = new Coordenada(coordenada.X - posicionActual.X, coordenada.Y - posicionActual.Y);
		for (int x = 0; x < posiblesMovimientos.length; x++) {
			if (posiblesMovimientos[x].X == direccion.X && posiblesMovimientos[x].Y == direccion.Y) {
				return true;
			}
		}
		return false;
	}
}
