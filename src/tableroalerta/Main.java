/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableroalerta;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author estudiantes
 */
public class Main{
    public static void main(String[] args) {
    	List<Carro> listCarros = new ArrayList<>();
        Carro carroControlado = new Carro(1, 1, 10, 10, Color.RED, 1, 3);
        Carro carroAleatorio = new Carro(50, 50, 20, 20, Color.GREEN, 2, 3);
        Carro carroOtro = new Carro(100, 100, 25, 25, Color.BLUE, 3, 3);
        Carro carroOtroa = new Carro(200, 200, 15, 15, Color.CYAN, 4, 2);
        listCarros.add(carroControlado);
        listCarros.add(carroAleatorio);
        listCarros.add(carroOtro);
        listCarros.add(carroOtroa);
        Tablero tablero = new Tablero(Color.BLACK, 500, 500);
        tablero.iniciar(listCarros);
    }
}


