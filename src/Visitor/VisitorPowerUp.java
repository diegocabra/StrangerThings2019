package Visitor;

import Disparos.DisparoPersonaje;
import Enemigos.Enemigo;
import Objetos.Objeto;
import Personajes.Personaje;
import PowerUps.PowerUp;

public class VisitorPowerUp implements Visitor {

	protected PowerUp powerup;
	
	public VisitorPowerUp(PowerUp pw){
		powerup=pw;
	}
	
	public boolean visitarEnemigo(Enemigo e){
		return false;
	}
	
	public boolean visitarPersonaje(Personaje p){
		//p.getCelda().getMapa().getJuego().obtuvePowerUp();
	System.out.println("HOla SOY UN VISITOR DE PW");
		powerup.getPowerUp(p);
		return true;
	}
	
	public boolean visitarObjeto(Objeto p){
		return false;
	}
	
	
	public boolean visitarDisparoPersonaje(DisparoPersonaje dp){
		return false;
	}

 
	public boolean visitarPowerUP(PowerUp p) {
 
		return false;
	}
 
}