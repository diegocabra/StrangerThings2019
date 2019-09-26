package Graficos;

import javax.swing.ImageIcon;

public class ElevenGrafico extends ContenidoGrafico{
	
	public ElevenGrafico (int x,int y) {
		super(x,y);
		image[0] = new ImageIcon(getClass().getResource("/Sprites/Eleven.png"));
	}

}
