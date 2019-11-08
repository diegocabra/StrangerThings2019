package Visitor;

import Disparos.DisparoPersonaje;
import Enemigos.Enemigo;
import Objetos.Objeto;
import Personajes.Personaje;
import PowerUps.PowerUp;

public class VisitorPersonaje implements Visitor {
	protected Personaje personaje;
	
	public VisitorPersonaje(Personaje p) {
		personaje = p;
	}
	
	public boolean visitarEnemigo(Enemigo e) {
		System.out.println("---Destrui enemigo----");
		e.decrementarVida(personaje.getDanioAtaque());
		if(e.getVida() <=0) {
			

			e.destruir();
		}
		
		return true;
	}

	 
	public boolean visitarPersonaje(Personaje p) {
		return false;
	}

 
	public boolean visitarObjeto(Objeto o) {
		 
		return false;
	}

	 
	public boolean visitarDisparoPersonaje(DisparoPersonaje dp) {
		// TODO Auto-generated method stub
		return false;
	}

	 
	public boolean visitarPowerUP(PowerUp p) {
	 
		return false;
	}

}
