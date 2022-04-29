package IniciativaAjedrez;

public class PiezaRey extends Pieza{
	
	public PiezaRey(){
		posiblesMovimientos = new Coordenada[8];
		
		posiblesMovimientos[0] = new Coordenada(1, 1);
		posiblesMovimientos[1] = new Coordenada(1, -1);
		posiblesMovimientos[2] = new Coordenada(-1,-1);
		posiblesMovimientos[3] = new Coordenada(-1, 1);
		
		posiblesMovimientos[4] = new Coordenada(0, 1);
		posiblesMovimientos[5] = new Coordenada(1, 0);
		posiblesMovimientos[6] = new Coordenada(0,-1);
		posiblesMovimientos[7] = new Coordenada(-1, 0);
	}

	
	boolean checarMovimiento(Coordenada coordenada) {
		
		return false;
	}

}
