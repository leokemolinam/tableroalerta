/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableroalerta;

import java.awt.Color;


public class Carro {
    
    private Color color;
    private int posicionX;
    private int posicionY;
    private int ancho;
    private int alto;    
    private int dx;
    private int dy;
        
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
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
     

	public Carro(int iniX, int iniY, int ancho, int alto, Color color, int dx, int dy){        
        this.posicionX = iniX;
        this.posicionY = iniY;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;       
        this.dx = dx;
        this.dy = dy;
    }
    
    public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public void moverCarro(int anchoEspacio, int altoEspacio){
		posicionX = posicionX + dx;
    	posicionY = posicionY + dy;
        if (posicionX < 0) {
        	dx = -dx;
        	posicionX = 0; 
        } else if (posicionX > anchoEspacio) {
        	dx = -dx;
        	posicionX = anchoEspacio;
        }
        
        if (posicionY < 0) {
        	dy = -dy;
        	posicionY = 0;
        } else if (posicionY > altoEspacio) {
        	dy = -dy;
        	posicionY = altoEspacio;
        }
    }
    
    
       
}
