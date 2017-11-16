
package proyectofinal;
import java.util.ArrayList;
/**
 *
 * @author Franco Nuñez
 */
public class Hogar {
    
   private ArrayList<Objeto> bañoLista;
   private ArrayList<Objeto> cocinaLista;
   private ArrayList<Objeto> iluminacionLista;
   private ArrayList<Objeto> menajeLista;
   private ArrayList<Objeto> mueblesLista;
   private ArrayList<Objeto> decoracionLista;
   private ArrayList<Objeto> textilLista;

    public Hogar() {
        this.bañoLista = new ArrayList<>();
        this.cocinaLista = new ArrayList<>();
        this.iluminacionLista = new ArrayList<>();
        this.menajeLista = new ArrayList<>();
        this.mueblesLista = new ArrayList<>();
        this.decoracionLista = new ArrayList<>();
        this.textilLista = new ArrayList<>();
    }
    
    //Añadir objetos usando esta funcion. Se le entrega el objeto junto con la categoria correspondiente
    public void addObjeto(Objeto objeto, int cat){
        switch(cat){
            case 1:
                addToList(bañoLista, objeto);
                break;
            case 2:
                addToList(cocinaLista, objeto);
                break;
            case 3:
                addToList(iluminacionLista, objeto);
                break;
            case 4:
                addToList(menajeLista, objeto);
                break;
            case 5:
                addToList(mueblesLista, objeto);
                break;
            case 6:
                addToList(decoracionLista, objeto);
                break;
            case 7:
                addToList(textilLista, objeto);
                break;
        }
    }
    
    public boolean addToList(ArrayList<Objeto> lista, Objeto objeto){
        if(lista.contains(objeto)){
            return false;
        }
        lista.add(objeto);
        return true;
    }
    
    public Objeto getObjeto(int cat, int index){
        Objeto returned = null;
        switch(cat){
            case 1:
                returned = bañoLista.get(index);
                break;
            case 2:
                returned = cocinaLista.get(index);
                break;
            case 3:
                returned = iluminacionLista.get(index);
                break;
            case 4:
                returned = menajeLista.get(index);
                break;
            case 5:
                returned = mueblesLista.get(index);
                break;
            case 6:
                returned = decoracionLista.get(index);
                break;
            case 7:
                returned = textilLista.get(index);
                break;
            default:
                break;
        }
        return returned;
    }
    
    public int sizeLista(int cat){
        int size = 0;
        switch(cat){
            case 1:
                size = bañoLista.size();
                break;
            case 2:
                size = cocinaLista.size();
                break;
            case 3:
                size = iluminacionLista.size();
                break;
            case 4:
                size = menajeLista.size();
                break;
            case 5:
                size = mueblesLista.size();
                break;
            case 6:
                size = decoracionLista.size();
                break;
            case 7:
                size = textilLista.size();
                break;
        }
        return size;
    }
    
    
}
