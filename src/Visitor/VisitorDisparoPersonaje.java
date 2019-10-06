package Visitor;

import Disparos.DisparoPersonaje;
import Enemigos.Enemigo;
import Objetos.Objeto;
import Personajes.Personaje;

public class VisitorDisparoPersonaje implements Visitor {

	protected DisparoPersonaje disparoPersonaje;
	
	public VisitorDisparoPersonaje(DisparoPersonaje dp){
		disparoPersonaje = dp;
	}
	
	public boolean visitarEnemigo(Enemigo e){
		e.decrementarVida(disparoPersonaje.getDanioAtaque());
		if(e.getVida()<=0)
			e.destruir();
		return true;
	}
	
	public boolean visitarPersonaje(Personaje p)
	{
		//p.esperar();
		return false;
	}
	
	public boolean visitarObjeto(Objeto p){
		p.decrementarVida(disparoPersonaje.getDanioAtaque());
		if(p.getVida()<=0)
			p.destruir();
		
		return true;
	}
	
	/*
	public boolean visitarDisparoEnemigo(DisparoEnemigo de)
	{
		return false;
	}
	*/
	
	public boolean visitarDisparoPersonaje(DisparoPersonaje dp)
	{
		return false;
	}
}

