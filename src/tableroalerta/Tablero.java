/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableroalerta;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

/**
 *
 * @author estudiantes
 */
public class Tablero{
    
	private Color colorFondo;
	private int ancho;
	private int alto;
	private JFrame frame;
    
   
    public Color getColorFondo() {
		return colorFondo;
	}

	public void setColorFondo(Color colorFondo) {
		this.colorFondo = colorFondo;
	}

	public int getAncho() {
		return ancho;
	}
	
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public Tablero(Color colorFondo, int ancho, int alto){		
        this.colorFondo = colorFondo;
        this.ancho = ancho;
        this.alto = alto;        
    }
    
	public void iniciar(List<Carro> listCarros) {
		Controlador controlador = new Controlador(listCarros);        
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Tablero Colisionador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setSize(this.ancho,  this.alto);    
        frame.setContentPane(controlador);
        frame.setVisible(true);
	}
    
}
