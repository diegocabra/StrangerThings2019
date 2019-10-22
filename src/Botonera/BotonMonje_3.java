package Botonera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Personajes.*;
import Principal.Market;

public class BotonMonje_3 extends Boton {


	protected Market market;
	
	public BotonMonje_3() {
		market = Market.getInstance();
		this.addActionListener(new OyenteBotonmonje3());
		this.setBounds(300, 20, 90, 90);
		this.setText("Monje Negro");
	}
	
	public Personaje generateEntidad() {
		return new Monje_3();
		}

	class OyenteBotonmonje3 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			Personaje p =generateEntidad();
		market.setFabricado(new Monje_3());
		}
	}
}

