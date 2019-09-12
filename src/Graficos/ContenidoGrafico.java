package Graficos;

import java.awt.Image;
import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ContenidoGrafico {
	protected JLabel label; 
	protected Icon image[];
	protected  int width = 80;
	protected  int height = 80;
	protected Point pos;
	
	public ContenidoGrafico( int fila, int columna ) {
		pos = new Point(fila * width, columna * height);
		image = new Icon[4];
	}
	
	public ContenidoGrafico () {
		image = new Icon[1];
		
	}
		
	public void setPoint(int x, int y) {
		pos.setLocation(x*width, y*height);
	}
	
	public JLabel getLabel (){
		return label;
	}
	
	public Point getPos() {
		return pos;
	}
	
	public void actualizarGrafico(int dir){		
			ImageIcon aux=(ImageIcon) image[dir];
		  Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getWidth(), Image.SCALE_DEFAULT));
		  label.setIcon(icono);
		  label.setBounds(pos.y, pos.x, width, height);
	}

	public JLabel getGrafico(int dir) {
		 if (label == null) {
			label= new JLabel(image[dir]);
			label.setBounds(pos.y, pos.x, width, height); 
			ImageIcon aux = (ImageIcon)image[dir];
			Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
			label.setIcon(icono);
		 }
		 return label;	
		}
		

}
