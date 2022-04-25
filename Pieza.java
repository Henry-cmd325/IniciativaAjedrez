package Ajedrez;

public abstract class Pieza {
	Coordenada[] posiblesMovimientos;
	
	abstract boolean checarMovimiento(Coordenada coordenada);
}
