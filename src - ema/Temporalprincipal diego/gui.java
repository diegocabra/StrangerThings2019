package Principal;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class gui implements Runnable{

	private JFrame frame;
	private Mapa mapa;
	private final int ALTO = 8;
	private final int ANCHO = 16;
	private final int ALTO_IMG = 50; // antes 32
	private final int ANCHO_IMG = 50; // antes 32

	private JLayeredPane panelMapa;
	private JPanel panelPuntuacion;
	private JPanel panelTienda;
	
	private JButton botonEleven;
	
	private JLabel muroJuego;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		

		frame = new JFrame("Stranger Things");
		//frame.setBounds(new Rectangle(0, 0, 1000, 800));
		//frame.getContentPane().setBounds(new Rectangle(0, 0, 1000,600));
		//frame.setBounds(100, 100, 1000, 700);
		frame.setSize(1000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		panelMapa = new JLayeredPane();
		panelMapa.setBounds(200, 0, 500, 1000);
		panelMapa.setSize(800,800);
		panelPuntuacion = new JPanel();
		panelPuntuacion.setBounds(0, 0, 200, 1000);
		panelPuntuacion.setBackground(Color.yellow);
		panelPuntuacion.setVisible(true);
		frame.getContentPane().add(panelPuntuacion);
		
		JPanel celdas = new JPanel();
		celdas.setOpaque(false);
		celdas.setBounds(200, 0, 500, 1000);
		celdas.setBackground(Color.red);
		panelMapa.add(celdas);
		panelMapa.setBackground(Color.black);
		panelMapa.setVisible(true);
		frame.getContentPane().add(panelMapa);
		//-----------------
		
		panelTienda = new JPanel();
		panelTienda.setBounds(800, 0, 200, 1000);
		panelTienda.setBackground(Color.blue);
		panelTienda.setVisible(true);
		frame.getContentPane().add(panelTienda);
		
	
		botonEleven = new JButton("eleven");
		botonEleven.setBounds(0, 0, 100, 93);
	botonEleven.setIcon(new ImageIcon());//falta imagen 
		
		panelTienda.add(botonEleven);
	ActionListener a1 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			panelMapa.addMouseListener(new java.awt.event.MouseAdapter() {
				boolean estadoBoton1 = true;
				
				public void mousePressed(MouseEvent e) {
						if (estadoBoton1) {
						int x=e.getX() ;
						int y=e.getY() ;
						int filas = y / 80;
						int columnas = x  / 80;
					  estadoBoton1 = false;
				//	 if( mapa.celdaLibre(filas,columnas))
//					 mapa.agregar("eleven");
				//	 System.out.println("Hola Soy Eleven");
					 ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Sprites/whatsapp.png"));
					 JLabel eleven = new JLabel();
					 eleven.setIcon(imagen1);
					 panelMapa.add(eleven);
					 eleven.setBounds(x,y,80,80);
					  
					//  mapa.posicionar(eleven,x,y);
					  
					  
					  
					}

				}});
		}};
		botonEleven.addActionListener(a1);
	// ------------------------
	}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
}
	
	//--------------------------
