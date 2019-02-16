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

	private List<Carro> listaCarros;
	private int anchoEspacio;
	private int altoEspacio;

	public Controlador(List<Carro> listCarros) {
		this.listaCarros = listCarros;
		System.out.println("listaCarrosInt: " + listaCarros.size());
		Thread thread = new Thread() {
			public void run() {
				while (true) {
					anchoEspacio = getWidth();
					altoEspacio = getHeight();
					if (anchoEspacio != 0) {
						for (Carro carro : listaCarros) {
							carro.moverCarro(anchoEspacio, altoEspacio);
						}
						mostrarAlerta(listaCarros);
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
		for (Carro carro : listaCarros) {
			g.setColor(carro.getColor());
			g.fill3DRect(carro.getPosicionX(), carro.getPosicionY(), carro.getAncho(), carro.getAlto(), true);
		}
	}

	public void mostrarAlerta(List<Carro> listCarros) {
		for (int i = 0; i < listCarros.size(); i++) {
			Carro carroComp = listCarros.get(i);
			for (int j = i + 1; j < listCarros.size(); j++) {
				Carro carro = listCarros.get(j);
				if (carroComp.getPosicionX() == carro.getPosicionX()
						&& carroComp.getPosicionY() == carro.getPosicionY()) {
					JOptionPane.showMessageDialog(null, "OHHHH COLISIONARON Carro [" + i + "] y el Carro [" + j + "]");
				}
			}
		}
	}
	
}
