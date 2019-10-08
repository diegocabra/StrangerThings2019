package Objetos;


import Principal.Celda;
import Visitor.Visitor;

public class Objeto extends Contenido{

	Objeto(Celda c)
	{
		super(c);
	}
	
	public boolean aceptar(Visitor v)
	{
		return v.visitarObjeto(this);
	}
}


