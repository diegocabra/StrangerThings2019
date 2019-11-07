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

		
		boolean mover = true;
		Celda siguiente = miCelda.getIzquierda();
		int cont = 0;
		Contenido aux;
		boolean encontre=false;
		if(siguiente == null) {
			encontre=false;
			// miCelda.getMapa().getJuego().finalizarJuego(false);
		}
		else {
			while(cont<80 && !encontre) {
				cont++;
				//ver
				siguiente = miCelda.getMapa().getCelda(miCelda.getFila(),miCelda.getColumna()-cont);
				if(siguiente!=null) {
					aux = siguiente.getContenido();
					if(aux !=null ) {
						aux.aceptar(miVisitor);
						//System.out.println("Encontre alguien wachin");
						encontre=true;
						entregarPW.terminate();
						this.destruir();
						//mover = false;
						
					}
				}
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