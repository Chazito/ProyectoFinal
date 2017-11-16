
package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author Franco Nuñez
 */
public class Ferreteria extends Categoria{
   private ArrayList<Objeto> pinturaLista;
   private ArrayList<Objeto> electricidadLista;
   private ArrayList<Objeto> gasfiteriaLista;
   private ArrayList<Objeto> herramientasLista;
   private ArrayList<Objeto> maquinariaLista;
   private ArrayList<Objeto> construccionLista;

    public Ferreteria() 
    {
        this.pinturaLista = new ArrayList<>();
        this.electricidadLista = new ArrayList<>();
        this.gasfiteriaLista = new ArrayList<>();
        this.herramientasLista = new ArrayList<>();
        this.maquinariaLista = new ArrayList<>();
        this.construccionLista = new ArrayList<>();
    }
    
    //Añadir objetos usando esta funcion. Se le entrega el objeto junto con la categoria correspondiente
    @Override
    public void addObjeto(Objeto objeto, int cat){
        switch(cat){
            case 1:
                addToList(pinturaLista, objeto);
                break;
            case 2:
                addToList(electricidadLista, objeto);
                break;
            case 3:
                addToList(gasfiteriaLista, objeto);
                break;
            case 4:
                addToList(herramientasLista, objeto);
                break;
            case 5:
                addToList(maquinariaLista, objeto);
                break;
            case 6:
                addToList(construccionLista, objeto);
                break;
        }
    }
    
    @Override
    public boolean addToList(ArrayList<Objeto> lista, Objeto objeto){
        if(lista.contains(objeto)){
            return false;
        }
        if(lista.size()>0){
            for(int i = 0; i < lista.size(); i++){
                Objeto check = lista.get(i);
                if(check.getCodigo()==objeto.getCodigo()) return false;
            }
        }
        
        lista.add(objeto);
        return true;
    }
    
    @Override
    public Objeto getObjeto(int cat, int index){
        Objeto returned = null;
        switch(cat){
            case 1:
                returned = pinturaLista.get(index);
                break;
            case 2:
                returned = electricidadLista.get(index);
                break;
            case 3:
                returned = gasfiteriaLista.get(index);
                break;
            case 4:
                returned = herramientasLista.get(index);
                break;
            case 5:
                returned = maquinariaLista.get(index);
                break;
            case 6:
                returned = construccionLista.get(index);
                break;
            default:
                break;
        }
        return returned;
    }
    
    @Override
    public int sizeLista(int cat){
        int size = 0;
        switch(cat){
            case 1:
                size = pinturaLista.size();
                break;
            case 2:
                size = electricidadLista.size();
                break;
            case 3:
                size = gasfiteriaLista.size();
                break;
            case 4:
                size = herramientasLista.size();
                break;
            case 5:
                size = maquinariaLista.size();
                break;
            case 6:
                size = construccionLista.size();
                break;
        }
        return size;
    }
}
