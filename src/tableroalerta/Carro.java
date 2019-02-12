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

    
    
    public Carro(int iniX, int iniY, int ancho, int alto, Color color){        
        this.posicionX = iniX;
        this.posicionY = iniY;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }
    
    public void moverCarro(int masX, int masY){
        this.posicionX = masX;
        this.posicionY = masY;
    }
       
}
