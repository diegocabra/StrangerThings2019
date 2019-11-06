package Botonera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Personajes.Monje_5;
import Personajes.Personaje;
import Principal.Market;

public class BotonMonje_5 extends Boton {

	protected Market market;
	
	public BotonMonje_5() {
		market = Market.getInstance();
		this.addActionListener(new OyenteBotonmonje5());
		this.setBounds(340, 20, 60, 50);
		this.setText("Monje Negro");
		ImageIcon iconobtn = new ImageIcon(this.getClass().getResource("/Sprites/Face_5_open.png"));
		this.setIcon(iconobtn);
	}
	
	public Personaje generateEntidad() {
		return new Monje_5();
		}

	class OyenteBotonmonje5 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			Personaje p =generateEntidad();
		market.setFabricado(new Monje_5());
		}
	}
	
	
	
	
}
