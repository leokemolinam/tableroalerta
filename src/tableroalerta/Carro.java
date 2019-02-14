/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableroalerta;

import java.awt.Color;


public class Carro {
    
    Color color;
    int posicionX;
    int posicionY;
    int ancho;
    int alto;
    int tipo;
    int dx;
    int dy;
    
    public static int CARRO_ALEATORIO = 1;
    public static int CARRO_CONTROLADO = 2;

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
 
    public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Carro(int iniX, int iniY, int ancho, int alto, Color color, int tipo, int dx, int dy){        
        this.posicionX = iniX;
        this.posicionY = iniY;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.tipo = tipo;
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

	public void moverCarro(int width, int height){
		posicionX = posicionX + dx;
    	posicionY = posicionY + dy;
        if (posicionX < 0) {
        	dx = -dx;
        	posicionX = 0; 
        } else if (posicionX > width) {
        	dx = -dx;
        	posicionX = width;
        }
        
        if (posicionY < 0) {
        	dy = -dy;
        	posicionY = 0;
        } else if (posicionY > height) {
        	dy = -dy;
        	posicionY = height;
        }
    }
    
    
       
}
