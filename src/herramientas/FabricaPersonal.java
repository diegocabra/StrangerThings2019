package herramientas;
 

import Personajes.Monje_2;
import Personajes.Monje_1;
import Personajes.Monje_3;
import Personajes.Soldado_5;
import Personajes.Soldado_4;
import Personajes.Personaje;
import Principal.Celda;

public class FabricaPersonal implements FabricaPersonajes{
	
	public Personaje crearSoldado1(Celda c) {
		return new Monje_1();
	}
	
	public Personaje crearSoldado2(Celda c) {
		return new Monje_2();
	}
	
	public Personaje crearSoldado3(Celda c) {
		return new Monje_3();
	}
	
	public Personaje crearSoldado4(Celda c) {
		return new Soldado_4(c);
	}
	
	public Personaje crearSoldado5(Celda c) {
		return new Soldado_5();
	}
	
	

}
