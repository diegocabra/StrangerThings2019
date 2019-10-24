package PowerUps;
import Objetos.Contenido;
import Personajes.Personaje;
import Principal.Celda;
import Visitor.Visitor;
import Visitor.VisitorPowerUp;

public abstract class PowerUp extends Contenido{

	protected Visitor miVisitor;
	protected EntregarPW entregarPW;
	
	public PowerUp(Celda c){
		super(c);
		miVisitor = new VisitorPowerUp(this);
		entregarPW = new EntregarPW(this);
		entregarPW.start();
	}
	
	public void comprobar(){
		boolean comprobar = true;
		boolean parar = false;
		Celda sig;;
		int cont = 0;
		Contenido aux;
		
		if(miCelda!=null){
			while(cont<80 && !parar){
				cont++;
				sig = miCelda.getMapa().getCelda(miCelda.getFila(), miCelda.getColumna()-cont);
				aux = sig.getContenido();
				if(aux!=null){
					if(aux!=null && aux.aceptar(miVisitor)){
						comprobar = false;
						parar=true;
					}
				}
				else{
					parar = true;
				}
			}

			parar=false;
			
			if(comprobar){
				cont=0;
				while(cont<80 && !parar){
					cont++;
					sig = miCelda.getMapa().getCelda(miCelda.getFila(), miCelda.getColumna()+cont);
					aux = sig.getContenido();
					if(aux!=null){
						if(aux!=null && aux.aceptar(miVisitor)){
							comprobar = false;
							parar=true;
							}
					}
					else{
						parar=true;
					}
				}
			}
			if(!comprobar){
				this.destruir();
			}
		}
	}
	
	
	public void destruir(){
		entregarPW.terminate();
		super.destruir();
	}
	
	public boolean aceptar(Visitor v){
		return v.visitarPowerUP(this);
	}
	
	public abstract void getPowerUp(Personaje p);
}