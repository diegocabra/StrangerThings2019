package Botonera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Personajes.Monje_2;
import Personajes.Personaje;

import Principal.Market;

public class BotonMonje_2 extends Boton {
	
	protected Market market;
	
	public BotonMonje_2() {
		market = Market.getInstance();
		this.addActionListener(new OyenteBotonmonje2());
		this.setBounds(200, 20, 90, 90);
		this.setText("Monje Negro");
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