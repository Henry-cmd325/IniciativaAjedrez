package IniciativaAjedrez;

public abstract class Pieza {
	Coordenada[] posiblesMovimientos;
	public Coordenada posicionActual;
	public boolean esBlanca; 
	
	abstract boolean checarMovimiento(Coordenada coordenada);
	
}
