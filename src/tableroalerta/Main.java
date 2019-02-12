/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableroalerta;
import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author estudiantes
 */
public class Main{
    public static void main(String[] args) {        
        Carro carroControlado = new Carro(200, 100, 10, 10, Color.RED);
        Carro carroAleatorio = new Carro(200, 50, 20, 20, Color.GREEN);
        Tablero tabVentana = new Tablero(Color.BLACK, 500, 500);        
        Controlador cont = new Controlador(carroControlado, carroAleatorio, tabVentana); 
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Bouncing Ball");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setSize(tabVentana.getAncho(), tabVentana.getAlto());        
        frame.setContentPane(cont);        
        frame.setVisible(true);
    }
}


