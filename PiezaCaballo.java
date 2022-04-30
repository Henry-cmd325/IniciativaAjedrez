package IniciativaAjedrez;

public class PiezaCaballo extends Pieza{
	
	public PiezaCaballo(Coordenada posicionInicial, boolean esBlanca){
		this.esBlanca = esBlanca;
		posicionActual = posicionInicial;
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
		Coordenada direccion = new Coordenada(coordenada.X-posicionActual.X, coordenada.Y-posicionActual.Y);
		for(int x = 0; x< posiblesMovimientos.length;x++){
			if(posiblesMovimientos[x].X==direccion.X && posiblesMovimientos[x].Y==direccion.Y){
				return true;
			}
		}
		return false;
	
		
	}

}
