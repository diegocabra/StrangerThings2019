package Objetos;

public class Fabrica implements FabricaDePersonajes{

	public FabricaDefensas(){}
	
	public Personaje crearEleven(Celda c){
		return new Eleven(c);
	}
	
	public Personaje crearHopper(Celda c){
		return new Hopper(c);
	}
	
	public Personaje crearMike(Celda c){
		return new Mike(c);
	}
	
	public Personaje crearDustin(Celda c){
		return new Dustin(c);
	}
	
	public Personaje crearMaxine(Celda c){
		return new Maxine(c);
	}
	
	public Personaje crearSteve(Celda c){
		return new Steve(c);
	}
	
	public Personaje crearMindflayer(Celda c){
		return new Mindflayer(c);
	}
	
	public Personaje crearDemodog(Celda c){
		return new Demodog(c);
	}
	
	public Personaje crearBilly(Celda c){
		return new Billy(c);
	}
	
	public Personaje crearDemogorgon(Celda c){
		return new Demogorgon(c);
	}
	
	public Personaje crearDimitri(Celda c){
		return new Dimitri(c);
	}
}