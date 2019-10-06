package Visitor;

import Disparos.DisparoPersonaje;
import Enemigos.Enemigo;
import Objetos.Objeto;
import Personajes.Personaje;

public class VisitorPersonaje implements Visitor {
	protected Personaje personaje;
	
	public VisitorPersonaje(Personaje p) {
		personaje = p;
	}
	
	public boolean visitarEnemigo(Enemigo e) {
		e.decrementarVida(personaje.getDanioAtaque());
		if(e.getVida() <=0) 
			e.destruir();
		
		return true;
	}

	 
	public boolean visitarPersonaje(Personaje p) {
		//Esperar a combate
		return false;
	}

 
	public boolean visitarObjeto(Objeto o) {
		 
		return false;
	}

	 
	public boolean visitarDisparoPersonaje(DisparoPersonaje dp) {
		// TODO Auto-generated method stub
		return false;
	}

}
