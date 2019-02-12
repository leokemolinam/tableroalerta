/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableroalerta;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Controlador extends JPanel {
    
    Carro carro1;
    Carro carro2;
    Tablero tablero;
    
    int width;
    int height;    
 
    // Center of Call
    int posicionXcarroControlado;
    int posicionYcarroControlado;
    int posicionXcarroAleatorio;
    int posicionYcarroAleatorio;

    // Direction
    int dx = 3;
    int dy = 3;
    int dx2 = 3;
    int dy2 = 3;
    
        
    public Controlador(Carro carroControlado, Carro carroAleatorio, Tablero tableroVentana){
        this.carro1 = carroControlado;
        this.carro2 = carroAleatorio;        
        this.tablero = tableroVentana;        
        Thread thread = new Thread() {
        public void run() {
            while (true) { 
                width = getWidth();
                height = getHeight();
                if(width != 0){
                    
                    //MOVIMIENTO CARRO CONTROLADO
                    posicionXcarroControlado = carroControlado.getPosicionX() + dx ;
                    posicionYcarroControlado = carroControlado.getPosicionY() + dy;          
                    
                    if (posicionXcarroControlado < 0) {
                        dx = -dx; 
                        posicionXcarroControlado = 0; 
                    } else if (posicionXcarroControlado > width) {
                        dx = -dx;
                        posicionXcarroControlado = width;
                    }
                    
                    if (posicionYcarroControlado < 0) {
                      dy = -dy;
                      posicionYcarroControlado = 0;
                    } else if (posicionYcarroControlado > height) {
                      dy = -dy;
                      posicionYcarroControlado = height;
                    }                    
                                        
                    carroControlado.moverCarro(posicionXcarroControlado, posicionYcarroControlado);                    
                        
                    //MOVIMIENTO CARRO ALEATORIO
                    posicionXcarroAleatorio = carroAleatorio.getPosicionX() + dx2 ;
                    posicionYcarroAleatorio = carroAleatorio.getPosicionY() + dy2;  
                    
                    if (posicionXcarroAleatorio < 0) {
                        dx2 = -dx2; 
                        posicionXcarroAleatorio = 0; 
                    } else if (posicionXcarroAleatorio > width) {
                        dx2 = -dx2;
                        posicionXcarroAleatorio = width;
                    }
                    
                    if (posicionYcarroAleatorio < 0) {
                      dy2 = -dy2;
                      posicionYcarroAleatorio = 0;
                    } else if (posicionYcarroAleatorio > height) {
                      dy2 = -dy2;
                      posicionYcarroAleatorio = height;
                    }              
                    carroAleatorio.moverCarro(posicionXcarroAleatorio, posicionYcarroAleatorio);
                    
                    mostrarAlerta(carroControlado, carroAleatorio);
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
        g.setColor(carro1.getColor());        
        g.fill3DRect(carro1.getPosicionX(), carro1.getPosicionY(), carro1.getAncho(), carro1.getAlto(), true);
        g.setColor(carro2.getColor());        
        g.fill3DRect(carro2.getPosicionX(), carro2.getPosicionY(), carro2.getAncho(), carro2.getAlto(), true);
        
    }
    
    public void mostrarAlerta(Carro carroCont, Carro carroAle){        
        if(carroCont.getPosicionX() == carroAle.getPosicionX() && carroCont.getPosicionY() == carroAle.getPosicionY()){
            JOptionPane.showMessageDialog(null, "OHHHH COLISIONARON");                        
        }
    }
    
}


