package Botonera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Objetos.Contenido;
import Personajes.*;
import Principal.Market;

public class BotonMonje_1 extends Boton {
	protected Market market;
	
	public BotonMonje_1() {
		market = Market.getInstance();
		this.addActionListener(new OyenteBotonmonje1());
		this.setBounds(100,20, 60, 50);
		ImageIcon iconobtn = new ImageIcon(this.getClass().getResource("/Sprites/Face_1_open.png"));
		this.setIcon(iconobtn);
	
	}
	
	public Contenido generateEntidad() {
		return new Monje_1();
		}

	class OyenteBotonmonje1 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			Contenido p =generateEntidad();
		market.setFabricado(new Monje_1());
		}
	}
}



