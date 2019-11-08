package Visitor;

import Disparos.DisparoPersonaje;
import Enemigos.Enemigo;
import Objetos.Objeto;
import Personajes.Personaje;
import PowerUps.PowerUp;


public class VisitorEnemigo implements Visitor {
	
	protected Enemigo enemigo;
	
	public VisitorEnemigo(Enemigo e) {
		enemigo = e;
	}

 
	public boolean visitarEnemigo(Enemigo e) {
		 
		return false;
	}

	 
	public boolean visitarPersonaje(Personaje p) {
		if(p.getEsperando()) {
			p.atacar();
		}
		
		if(enemigo.getCaminando()) {
			enemigo.atacar();
		}
		
		p.decrementarVida(enemigo.getDanioAtaque());
		enemigo.decrementarVida(p.getDanioAtaque());
		
		if(enemigo.getVida() <= 0) {
			enemigo.destruir();
			p.esperar();
		}
	
		
		if(p.getVida() <= 0) {
			enemigo.caminar();
			p.destruir();
		}
		
		return true;
	}

	 
	public boolean visitarObjeto(Objeto o) {
		if(enemigo.getCaminando())
			enemigo.atacar();
		
		o.decrementarVida(enemigo.getDanioAtaque());
		
		if(o.getVida()<= 0) {
			enemigo.caminar();
			o.destruir();
			enemigo.setCaminando(true);
		}
		
		enemigo.setCaminando(true);
		return true;
	}
	

	public boolean visitarDisparoPersonaje(DisparoPersonaje dp) {
		// TODO Auto-generated method stub
		return false;
	}
	 
	public boolean visitarPowerUP(PowerUp p) {
		p.destruir();
		return false;
	}
}
