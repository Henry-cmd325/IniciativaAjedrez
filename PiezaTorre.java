package IniciativaAjedrez;

public class PiezaTorre extends Pieza{
	
	public PiezaTorre(Coordenada posicionInicial, boolean esBlanca){
		posicionActual = posicionInicial;
		posiblesMovimientos= new Coordenada[4];
		this.esBlanca = esBlanca;
		
		posiblesMovimientos[0] = new Coordenada(0, 1);
		posiblesMovimientos[1] = new Coordenada(1, 0);
		posiblesMovimientos[2] = new Coordenada(0,-1);
		posiblesMovimientos[3] = new Coordenada(-1, 0);
	}

	
	boolean checarMovimiento(Coordenada coordenada) {
		Coordenada direccion = new Coordenada(coordenada.X-posicionActual.X, coordenada.Y-posicionActual.Y);
		for(int x = 0; x< posiblesMovimientos.length;x++){
			if(posiblesMovimientos[x].X==direccion.X && posiblesMovimientos[x].Y==direccion.Y){
				return true;
			}
		}
		return false;
	}
	
	

}
