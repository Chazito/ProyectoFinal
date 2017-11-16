
package proyectofinal;

import java.util.ArrayList;

public abstract class Categoria {

    public Categoria() {
    }
    
    public void addObjeto(Objeto objeto, int cat){
        System.out.println("To be Override");
    }
    
    public boolean addToList(ArrayList<Objeto> lista, Objeto objeto){
        
        return true;
    }
    
    public Objeto getObjeto(int cat, int index){
        
        return null;
    }
    
    public int sizeLista(int cat){
        
        return 0;
    }
}
