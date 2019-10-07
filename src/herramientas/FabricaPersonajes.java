package herramientas;

import Personajes.Personaje;
import Principal.Celda;

public interface FabricaPersonajes {

	public Personaje crearSoldado1(Celda c);
	public Personaje crearSoldado2(Celda c);
	public Personaje crearSoldado3(Celda c);
	public Personaje crearSoldado4(Celda c);
	public Personaje crearSoldado5(Celda c);

}