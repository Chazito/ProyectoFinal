/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author usuario
 */
public class CarroCompra implements Serializable{
    private ArrayList<Objeto> carroCompras;
    public CarroCompra ()
    {
        this.carroCompras = new ArrayList<>();
    }

    public int size() {
        return carroCompras.size();
    }

    public Objeto get(int index) {
        return carroCompras.get(index);
    }

    public void add(int index, Objeto element) {
        carroCompras.add(index, element);
    }

    public Objeto remove(int index) {
        return carroCompras.remove(index);
    }
    
}
