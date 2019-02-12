/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableroalerta;

import java.awt.Color;

/**
 *
 * @author estudiantes
 */
public class Tablero {
    
    Color colorFondo;
    int ancho;
    int alto;

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

    
    
    public Tablero(Color colorFondo, int ancho, int alto){
        this.colorFondo = colorFondo;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    
}
