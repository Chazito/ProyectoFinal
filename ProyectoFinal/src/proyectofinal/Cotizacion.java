/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hachi
 */
public class Cotizacion implements Serializable
{
    // ARRAY DE COTIZACIONES
    private ArrayList<Objeto> carroCompras;
    private String codigo;
    private String fecha;
    public Cotizacion (String codigo, String fecha)
    {
        this.carroCompras = new ArrayList<>();
        this.codigo = codigo;
        this.fecha = fecha;
    }

    public ArrayList<Objeto> getCarroCompras() {
        return carroCompras;
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
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public String getFecha(){
        return this.fecha;
    }
}
