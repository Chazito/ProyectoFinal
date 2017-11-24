/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;
import java.io.Serializable;

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
    
    public ArrayList<Objeto> getCarroCompras() {
        return carroCompras;
    }

    public void clearCarro(){
        carroCompras.clear();
    }
    
    public int size() {
        return carroCompras.size();
    }

    public Objeto get(int index) {
        return carroCompras.get(index);
    }

    public void add(Objeto element) {
        carroCompras.add(element);
    }

    public Objeto remove(int index) {
        return carroCompras.remove(index);
    }
    // DESDE EL CARRO DE COMPRAS AGREGAR OBJETOS A LA COTIZACION, LA CUAL SE GUARDARA EN EL ARRAY. 
    
    public int precioTotal (){
        int precio = 0;
        for (int i = 0; i < carroCompras.size(); i++)
        {
            precio += carroCompras.get(i).getPrecio();
        }
        return precio;
    }
}
