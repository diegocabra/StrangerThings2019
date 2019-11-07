package Objetos;


import Principal.Celda;
import Visitor.Visitor;

public class Objeto extends Contenido{

	public Objeto(Celda c)
	{
		super(c);
	}
	
	public Objeto ()
	{
		super();
	}
	
	
	public boolean aceptar(Visitor v)
	{
		return v.visitarObjeto(this);
	}
}


