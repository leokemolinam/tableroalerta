/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableroalerta;

import java.awt.Graphics;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Controlador extends JPanel {
    
	private static final long serialVersionUID = 1L;
	
	List<Carro> listaCarrosInt;        
    int width;
    int height;
 
    public Controlador(List<Carro> listCarros){
    	this.listaCarrosInt = listCarros;
    	System.out.println("listaCarrosInt: " + listaCarrosInt.size());
        Thread thread = new Thread() {
        public void run() {
            while (true) { 
                width = getWidth();
                height = getHeight();
                if(width != 0){                	
                    for (Carro carro : listaCarrosInt) {                    	
                    	carro.moverCarro(width, height);                        
					}
                    mostrarAlerta(listaCarrosInt);
                    repaint();                   
         
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                }
            }
        }
        };
        thread.start();
    
    }        
    
    public void paintComponent(Graphics g) {     
        super.paintComponent(g);   
        for (Carro carro : listaCarrosInt) {
        		g.setColor(carro.getColor());        
            	g.fill3DRect(carro.getPosicionX(), carro.getPosicionY(), carro.getAncho(), carro.getAlto(), true);	
		}
    }
    
    public void mostrarAlerta(List<Carro> listCarro){
    	int cont = 0;
    	int contComp = 0;
    	for (Carro carroComp : listCarro) {
    		cont++;
    		contComp = 0;
    		for (Carro carro : listCarro) {
    			contComp++;
    			if(contComp != cont) {
    				if(carroComp.getPosicionX() == carro.getPosicionX() && carroComp.getPosicionY() == carro.getPosicionY()){
        				JOptionPane.showMessageDialog(null, "OHHHH COLISIONARON: carro" + cont);                        
        	        }
    			}    			    			
    		}
		}    
    }

	
    
}


