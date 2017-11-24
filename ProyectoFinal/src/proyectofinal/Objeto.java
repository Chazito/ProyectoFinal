
package proyectofinal;

import java.io.Serializable;

/**
 *
 * @author Hachi
 */
public class Objeto implements Serializable
{
    String categoria;
    int codigo;
    String nombre;
    int precio;
    
    public Objeto(String categoria, int codigo, String nombre, int precio) {
        this.categoria = categoria;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
