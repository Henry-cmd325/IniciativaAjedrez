package IniciativaAjedrez;

public class PiezaCaballo extends Pieza{
	
	public PiezaCaballo(){
		posiblesMovimientos = new Coordenada[8];
		posiblesMovimientos[0]= new Coordenada(1,2);
		posiblesMovimientos[1]= new Coordenada(2,-1);
		posiblesMovimientos[2]= new Coordenada(-1,-2);
		posiblesMovimientos[3]= new Coordenada(-2,1);
		
		posiblesMovimientos[4]= new Coordenada(-1,2);
		posiblesMovimientos[5]= new Coordenada(-2,-1);
		posiblesMovimientos[6]= new Coordenada(1,-2);
		posiblesMovimientos[7]= new Coordenada(2,1);
	}

	
	boolean checarMovimiento(Coordenada coordenada) {
		
	
		return false;
	}

}
