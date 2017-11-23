/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author Hachi
 */
public class Cotizacion 
{
    // ARRAY DE COTIZACIONES
     private ArrayList<Cotizacion> cotizaciones;

    public Cotizacion()
    {
        this.cotizaciones = new ArrayList<>();
    }

    public int size() {
        return cotizaciones.size();
    }

    public Cotizacion get(int index) 
    {
        return cotizaciones.get(index);
    }

    public boolean add(Cotizacion e) {
        return cotizaciones.add(e);
    }

    public Cotizacion remove(int index) {
        return cotizaciones.remove(index);
    }
     
}
