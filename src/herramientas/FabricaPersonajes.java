package herramientas;

import Personajes.Personaje;
import Principal.Celda;

public interface FabricaPersonajes {

	public Personaje crearEleven(Celda c);
	public Personaje crearMike(Celda c);
	public Personaje crearDustin(Celda c);
	public Personaje crearMaxine(Celda c);
	public Personaje crearHopper(Celda c);

}