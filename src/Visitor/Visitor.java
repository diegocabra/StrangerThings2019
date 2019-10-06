package Visitor;

import Disparos.DisparoPersonaje;
import Enemigos.Enemigo;
import Objetos.Objeto;
import Personajes.Personaje;

public interface Visitor {

	public boolean visitarEnemigo(Enemigo e);
	public boolean visitarPersonaje(Personaje p);
	public boolean visitarObjeto(Objeto o);
	public boolean visitarDisparoPersonaje(DisparoPersonaje dp);
	 
}