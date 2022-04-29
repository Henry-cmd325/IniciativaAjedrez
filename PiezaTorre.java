package IniciativaAjedrez;

public class PiezaTorre extends Pieza{
	
	public PiezaTorre(){
		posiblesMovimientos= new Coordenada[4];
		
		posiblesMovimientos[4] = new Coordenada(0, 1);
		posiblesMovimientos[5] = new Coordenada(1, 0);
		posiblesMovimientos[6] = new Coordenada(0,-1);
		posiblesMovimientos[7] = new Coordenada(-1, 0);
	}

	
	boolean checarMovimiento(Coordenada coordenada) {
		
		return false;
	}
	
	

}
