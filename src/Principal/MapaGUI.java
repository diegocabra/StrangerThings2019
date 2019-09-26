package Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Botonera.Boton;
import Botonera.BotonEleven;
import Objetos.Contenido;
import Personajes.Eleven;
import herramientas.FabricaPersonajes;
import herramientas.FabricaPersonal;
 





public class MapaGUI extends JFrame{
	
	protected int cantFilas,cantColumnas,alto,ancho,fabricado,cantidadBombas;	

	protected FabricaPersonajes fabricaPersonajes;
	
	protected Juego juego;
	protected Mapa mapa;	
	protected JPanel contentPane;
	protected JPanel panelJuego,panelOpciones;
	protected JPanel panel_1;
	protected JPanel panel_2;
	protected JPanel panel_3;
	
	protected JLabel etiqueta,etiquetaPuntos,etiquetaMonedas,etiquetaInformacion,etiquetaMarket;
	
	protected JButton market[];
	protected String nombres[];

	
	
	public MapaGUI(Juego j) {
		
		juego = j;
		mapa = juego.getMap();
		cantFilas = juego.getFilas();
		cantColumnas = juego.getColumnas();
		alto = cantFilas * 80;
		ancho = cantColumnas;
		
		fabricaPersonajes = new FabricaPersonal();
		fabricado=-1;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(ancho+6, alto+189);
		
		panelOpciones = new JPanel();
		inicializarPanelBotones();
		
		panelJuego = new JPanel();
		inicializarPanelJuego();
		
		//Panel con etiqueta de fondo
		JPanel panelFondo = new JPanel();
		panelFondo.setLayout(null);
		panelFondo.setBounds(0, 160, ancho, alto);
		panelFondo.setOpaque(false);
		
		JLabel fondo = new JLabel();
	    fondo.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/piso.png")));
	    fondo.setBounds(0, 0, ancho, alto);
	    panelFondo.add(fondo);
	    
	  
		//Panel combate
		
	    getContentPane().add(panelJuego);
	    getContentPane().setBackground(Color.green);
	    getContentPane().add(panelOpciones);
		
		//getContentPane().add(panelFondo);
		this.setResizable(false);
		this.setVisible(true);
		
	}

	public void agregar(JLabel l) {
	
		panelJuego.add(l);
	}
	
	private void inicializarPanelBotones(){
		panelOpciones.setLayout(null);
		panelOpciones.setBorder(BorderFactory.createLineBorder(Color.black));
		panelOpciones.setBounds(0,0, ancho, 160);
	 BotonEleven BEleven = new BotonEleven ();
	BEleven.addActionListener(new oyenteBEleven())
		
		int i = 0;
		nombres = new String[10];
		market = new JButton[5];
		
		nombres[0]="Eleven.png";
		nombres[1]="Eleven.png";
		nombres[2]="Eleven.png";
		nombres[3]="Eleven.png";
		nombres[4]="Eleven.png";
		
		for(i=0;i<5;i++)
		{
			market[i]=new JButton();
			market[i].setBounds(0+(i*60), 20, 60, 60);
			//Buscar Sprites para personaje
		//	market[i].setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Eleven.png")));
			market[i].setActionCommand(""+i);
			//market[i].setText(nombres)
			market[i].addActionListener(new OyenteAgregar());
			panelOpciones.add(market[i]);
		}
		
		//market[5].setEnabled(true);
		
		etiquetaMarket = new JLabel("MarketPlace");
		etiquetaMarket.setBounds(120, 0, 500, 25);
		
		etiquetaInformacion = new JLabel("");
		etiquetaInformacion.setBounds(5, 140, 500, 25);
		
		etiquetaMonedas = new JLabel("Monedas: "+juego.getMonedas());
		etiquetaMonedas.setBounds(ancho-220,0 , 100, 20);
		
		
		
		panelOpciones.add(etiquetaMarket);
		panelOpciones.add(etiquetaInformacion);
		panelOpciones.add(etiquetaMonedas);
		//panelOpciones.add(etiquetaPuntos);
		
	}
	
	private class OyenteBeleven implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {BEleven.generatedEntidad()
        	
        }
    }
	
	private class OyenteAgregar implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
        	System.out.println("Entre a Oyente Agregar");
        	fabricado = Integer.parseInt(e.getActionCommand());
        }
    }
	
	private class OyentePanelMouse implements MouseListener {		
        public void mousePressed(MouseEvent e)
        {
        	
        	int i = e.getY() ;
        	int j = e.getX();
        	System.out.println("ENTRE OYENTE PANEL MOUSE");
        	
        	if(fabricado>=0)
        	{
        		Celda aux = mapa.getCelda(i, j);
        		Contenido nuevo=null;
    			switch (fabricado) {
                case 0:  if(40<=juego.getMonedas()) nuevo = fabricaPersonajes.crearEleven(aux);
                         break;
                case 1:  if(50<=juego.getMonedas()) nuevo = fabricaPersonajes.crearMike(aux);
                         break;
                case 2:  if(50<=juego.getMonedas()) nuevo = fabricaPersonajes.crearDustin(aux);
                         break;
                case 3:  if(100<=juego.getMonedas()) nuevo = fabricaPersonajes.crearMaxine(aux);
                		 break;
                case 4:  if(125<=juego.getMonedas()) nuevo = fabricaPersonajes.crearHopper(aux);
       		 			 break;
            	}
    			
    			if(nuevo==null)
    			{
    				etiquetaInformacion.setText("NO DISPONE DE DINERO SUFICIENTE");
    			}
    			else
    			{
    				etiquetaInformacion.setText("");
    				juego.decrementarMonedas(nuevo.getCosto());
           			aux.agregar(nuevo);
           			panelJuego.add(nuevo.getGrafico());
            		}
    			}
        		
        		fabricado=-1;
        	}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
        }
	
	
	
	public void actualizar() {
		for(int i = 0;i <cantFilas;i++) {
			for(int j=0;j<cantColumnas;j++) {
				Contenido c = mapa.getCelda(i,j).getContenido();
				if(c != null) {
					etiqueta = c.getGrafico();
					if(etiqueta != null) {
						etiqueta.setBounds(j,i*80,80,80);
					}
				}
			}
		}
	}
	
	private void inicializarPanelJuego() {
		panelJuego.setLayout(null);
		panelJuego.setBackground(new Color(135,206,255));
		panelJuego.setBounds(0, 160, ancho, alto);
		panelJuego.setOpaque(false);
		panelJuego.addMouseListener(new OyentePanelMouse());
		
		for(int i = 0;i<cantFilas;i++) {
			for(int j=0; j<cantColumnas;j++) {
				Contenido c = mapa.getCelda(i,j).getContenido();
				if(c != null) {
					etiqueta = c.getGrafico();
					if(etiqueta != null) {
						etiqueta.setBounds(j,i*80,80,80);
						panelJuego.add(etiqueta);
						}
					}
			}
		}
	}



 
	



}
