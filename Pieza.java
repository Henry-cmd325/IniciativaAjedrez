package IniciativaAjedrez;

public abstract class Pieza {
	Coordenada[] posiblesMovimientos;
	public Coordenada posicionActual;
	
	abstract boolean checarMovimiento(Coordenada coordenada);
}
