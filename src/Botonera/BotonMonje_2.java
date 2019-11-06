package Botonera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Personajes.Monje_2;
import Personajes.Personaje;

import Principal.Market;

public class BotonMonje_2 extends Boton {
	
	protected Market market;
	
	public BotonMonje_2() {
		market = Market.getInstance();
		this.addActionListener(new OyenteBotonmonje2());
		this.setBounds(160,20,60,50);
		ImageIcon iconobtn = new ImageIcon(this.getClass().getResource("/Sprites/Face_2_open.png"));
		this.setIcon(iconobtn);
	
	}
	
	public Personaje generateEntidad() {
		return new Monje_2();
		}

	class OyenteBotonmonje2 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			Personaje p =generateEntidad();
		market.setFabricado(new Monje_2());
		}
	}
}