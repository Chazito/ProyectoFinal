/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author usuario
 */
public enum Pago {
    EFECTIVO("Efectivo"),
    CHEQUE("Cheque"), 
    TARJETA_CREDITO("Tarjeta de credito bancaria"),
    TARJETA_TIENDA("Tarjeta de credito de la tienda");
    
    private String nombre;
    
    private Pago(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
}
