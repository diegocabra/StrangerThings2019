package herramientas;
 

import Personajes.Soldado_2;
import Personajes.Soldado_1;
import Personajes.Soldado_3;
import Personajes.Soldado_5;
import Personajes.Soldado_4;
import Personajes.Personaje;
import Principal.Celda;

public class FabricaPersonal implements FabricaPersonajes{
	
	public Personaje crearSoldado1(Celda c) {
		return new Soldado_1(c);
	}
	
	public Personaje crearSoldado2(Celda c) {
		return new Soldado_2(c);
	}
	
	public Personaje crearSoldado3(Celda c) {
		return new Soldado_3(c);
	}
	
	public Personaje crearSoldado4(Celda c) {
		return new Soldado_4(c);
	}
	
	public Personaje crearSoldado5(Celda c) {
		return new Soldado_5(c);
	}
	
	

}
