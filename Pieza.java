package IniciativaAjedrez;


public abstract class Pieza {
	Coordenada[] posiblesMovimientos;
	
	abstract boolean checarMovimiento(Coordenada coordenada);
}
