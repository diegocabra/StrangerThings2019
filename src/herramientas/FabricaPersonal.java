package herramientas;
 

import Personajes.Monje_2;
import Personajes.Monje_1;
import Personajes.Monje_3;
import Personajes.Soldado_5;
import Personajes.Soldado_4;
import Personajes.Personaje;
import Principal.Celda;

public class FabricaPersonal implements FabricaPersonajes{
	
	public Personaje crearMonje1() {
		return new Monje_1();
	}
	
	public Personaje crearMonje2() {
		return new Monje_2();
	}
	
	public Personaje crearMonje3() {
		return new Monje_3();
	}
	
	public Personaje crearSoldado4() {
		return new Soldado_4();
	}
	
	public Personaje crearSoldado5() {
		return new Soldado_5();
	}
	
	

}
