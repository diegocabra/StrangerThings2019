package herramientas;
 

import Personajes.Dustin;
import Personajes.Eleven;
import Personajes.Hopper;
import Personajes.Maxine;
import Personajes.Mike;
import Personajes.Personaje;
import Principal.Celda;

public class FabricaPersonal implements FabricaPersonajes{
	
	public Personaje crearEleven(Celda c) {
		return new Eleven(c);
	}
	
	public Personaje crearMike(Celda c) {
		return new Mike(c);
	}
	
	public Personaje crearDustin(Celda c) {
		return new Dustin(c);
	}
	
	public Personaje crearMaxine(Celda c) {
		return new Maxine(c);
	}
	
	public Personaje crearHopper(Celda c) {
		return new Hopper(c);
	}
	
	

}
