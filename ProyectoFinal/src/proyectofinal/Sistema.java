
package proyectofinal;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Sistema {
    
    private Categoria hogar;
    private Categoria jardin;
    private Categoria electroHogar;
    private Categoria ferreteria;

    public Sistema() {
        this.hogar = new Hogar();
    }
    
    public void cargarArchivo(){
        Lector lector = new Lector();
        ArrayList<Objeto> listaTemp = new ArrayList();
        listaTemp.addAll(lector.leerArchivoLista());
        
    }
}
